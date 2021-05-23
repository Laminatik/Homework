package Homework.obstacles;

import Homework.participants.Participants;

public class Wall implements Obstacles {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacles(Participants participant) {
        if (participant.jump() >= height) {
            System.out.println("Участник " + participant + " | успешно перепрыгнул стену " + height);
            return true;
        }
        else {
            System.out.println("Участник " + participant + " не смог перепрыгнуть стену " + height);
            return false;
        }
    }
}
