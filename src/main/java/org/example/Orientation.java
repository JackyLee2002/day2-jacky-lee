package org.example;

public interface Orientation {
    Direction getDirection();
    Orientation turnLeft();
    Orientation turnRight();
    void move(MarsRover rover);
}
