package org.example;

public class NorthOrientation implements Orientation{
    @Override
    public Direction getDirection() {
        return Direction.N;
    }

    @Override
    public Orientation turnLeft() {
        return new WestOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new EastOrientation();
    }

    @Override
    public void move(MarsRover rover) {
        rover.setY(rover.getY() + 1);
    }
}
