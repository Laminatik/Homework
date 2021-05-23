package Homework.participants;

public class Robot implements Participants {

    private final int id;
    private final int jumpHeight;
    private final int maxRunLength;

    public Robot(int id, int jumpHeight, int maxRunLength) {
        this.id = id;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int run() {
        System.out.printf("Робот %s бежит дистанцию %d%n", id, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Робот %s делает прыжок %d%n", id, jumpHeight);
        return jumpHeight;
    }

    @Override
    public String toString() {
        return "киберчеловек: " +
                "id=" + id +
                ", максимальная высота прыжка=" + jumpHeight +
                ", выносливость в беге=" + maxRunLength;
    }
}
