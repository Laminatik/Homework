package Homework.obstacles;

import Homework.participants.Participants;

public class Track implements Obstacles {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacles(Participants participants) {
        if (participants.run() >= length) {
            System.out.println("Участник " + participants + " | успешно пробежал дистанцию " + length);
            return true;
        }
        else {
            System.out.println("Участник " + participants + " | не смог пробежать дистанцию " + length);
            return false;
        }
    }
}
