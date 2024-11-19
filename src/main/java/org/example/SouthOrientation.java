package org.example;

public class SouthOrientation implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.S;
    }

    @Override
    public Orientation turnLeft() {
        return new EastOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new WestOrientation();
    }

    @Override
    public void moveForward(MarsRover rover) {
        rover.setY(rover.getY() - 1);
    }

    @Override
    public void moveBackward(MarsRover rover) {
        rover.setY(rover.getY() + 1);
    }
}
