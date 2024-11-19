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
    public void moveForward(MarsRover rover) {
        rover.setX(rover.getX() - 1);
    }

    @Override
    public void moveBackward(MarsRover rover) {
        rover.setX(rover.getX() + 1);
    }
}
