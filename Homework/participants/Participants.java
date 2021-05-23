package Homework.participants;

import Homework.obstacles.Obstacles;
public interface Participants {

    int run();

    int jump();

    default boolean passObstacle(Obstacles obstacles) {
        return doAction(obstacles);
    }

    private boolean doAction(Obstacles obstacles) {
        return obstacles.passObstacles(this);
    }

}
