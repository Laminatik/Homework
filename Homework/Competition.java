package Homework;

import Homework.participants.Participants;
import Homework.obstacles.Obstacles;

import java.util.LinkedList;
import java.util.List;

public class Competition {

    private Obstacles[] obstacles;
    private Participants[] participants;
    private final String competitionTitle;

    private List<Participants> lastWinners = new LinkedList<>();

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }


    public void setObstacles(Obstacles... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participants... participants) {
        this.participants = participants;
    }

    public void startCompetition() {
        System.out.println("-= Начало соревнования " + competitionTitle + " =-");
        System.out.println("-----------------------");
        lastWinners.clear();

        for (Participants participants : participants) {
            boolean success = passAllObstacles(participants);
            if (!success) {
                System.out.println("Участник " + participants + " | покинул испытание");
                System.out.println("-----------------------");
            } else {
                lastWinners.add(participants);
            }
        }
    }

    public List<Participants> getLastWinners() {
        return lastWinners;
    }

    private boolean passAllObstacles(Participants participants) {
        for (Obstacles obstacles : obstacles) {
            if ( !participants.passObstacle(obstacles) ) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}
