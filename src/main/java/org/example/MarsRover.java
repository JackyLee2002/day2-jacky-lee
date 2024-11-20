package org.example;

import java.util.Arrays;

public class MarsRover {
    private Orientation orientation;
    private int xCoord;
    private int y;

    MarsRover() {
        this.orientation = new NorthOrientation();
        this.xCoord = 0;
        this.y = 0;
    }

    public int getX() { return xCoord; }
    public int getY() { return y; }
    public void setX(int xCoord) { this.xCoord = xCoord; }
    public void setY(int y) { this.y = y; }

    public String showStatus() {
        return String.format("%d:%d:%s", xCoord, y, orientation.getDirection());
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
