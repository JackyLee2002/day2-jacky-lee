package org.example;

public class EastOrientation implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.E;
    }

    @Override
    public Orientation turnLeft() {
        return new NorthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new SouthOrientation();
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setX(rover.getX() + 1);
    }

    @Override
    public void moveBackward(MarsRover rover) {
        rover.setX(rover.getX() - 1);
    }
}
