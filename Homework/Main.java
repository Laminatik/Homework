package Homework;

import Homework.obstacles.Track;
import Homework.obstacles.Wall;
import Homework.participants.Participants;
import Homework.participants.Human;
import Homework.participants.Robot;
import Homework.participants.Cat;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------1-----------");
        System.out.println("Подготовительный этап...");
        System.out.println("-----------2-----------");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнование!");
        System.out.println("-----------3-----------");
        competition.startCompetition();

        System.out.println("-----------------------");
        System.out.println("Соревнование окончено! Победители:");
        for (Participants winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
        System.out.println("-----------------------");
    }

    private static Competition createAndPrepareCompetition() {
        Participants human = new Human("Vitalia", 150, 2000);
        Participants cat = new Cat("Iriska", 200, 1500);
        Participants robot = new Robot(127, 2000, 10000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(250));
        Track track = new Track(random.nextInt(2000));

        Competition competition = new Competition("Olimpia run");
        competition.setParticipants(human, cat, robot);
        competition.setObstacles(wall, track);
        return competition;
    }
}
