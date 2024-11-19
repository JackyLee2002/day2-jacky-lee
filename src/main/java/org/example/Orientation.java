package org.example;

public interface Orientation {
    Direction getDirection();
    Orientation turnLeft();
    Orientation turnRight();
    void moveForward(MarsRover rover);
    void moveBackward(MarsRover rover);
}
