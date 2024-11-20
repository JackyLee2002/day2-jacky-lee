package org.example;

import java.util.Arrays;

public class MarsRover {
    private Orientation orientation;
    private int x;
    private int y;

    MarsRover() {
        this.orientation = new NorthOrientation();
        this.x = 0;
        this.y = 0;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public String showStatus() {
        return String.format("%d:%d:%s", x, y, orientation.getDirection());
    }

    public void executeCommand(String command) {
        switch (command) {
            case "L":
                orientation = orientation.turnLeft();
                break;
            case "R":
                orientation = orientation.turnRight();
                break;
            case "M":
                orientation.moveForward(this);
                break;
            case "B":
                orientation.moveBackward(this);
                break;
        }
    }

    public String parseCommands(String command) {
        String[] commands = command.split("");
        Arrays.stream(commands).forEach(this::executeCommand);
        return showStatus();
    }
}
