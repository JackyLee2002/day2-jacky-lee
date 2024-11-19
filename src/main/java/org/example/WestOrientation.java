package org.example;

public class WestOrientation implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.W;
    }

    @Override
    public Orientation turnLeft() {
        return new SouthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new NorthOrientation();
    }

    @Override
    public void move(MarsRover rover) {
        rover.setX(rover.getX() - 1);
    }
}
