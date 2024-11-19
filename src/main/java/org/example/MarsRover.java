package org.example;

public class MarsRover {
    private Direction direction;
    private int x;
    private int y;

    MarsRover() {
        this.direction = Direction.N;
        this.x = 0;
        this.y = 0;
    }

    public String showStatus() {
        return String.format("%d:%d:%s", x, y, direction);
    }

//    use switch case to handle turn left
    public void turnLeft() {
         switch (direction) {
             case N:
                direction = Direction.W;
                 break;
            case W:
                direction = Direction.S;
                break;
            case S:
                direction = Direction.E;
                break;
             case E:
                direction = Direction.N;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case N:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.S;
                break;
            case S:
                direction = Direction.W;
                break;
            case W:
                direction = Direction.N;
                break;
            default:
                break;
        }
    }

    private void moveForward() {
        switch (direction) {
            case N:
                y++;
                break;
            case S:
                y--;
                break;
            case E:
                x++;
                break;
            case W:
                x--;
                break;
            default:
                break;
        }
    }

    public String executeCommand(String command) {
        if (command.equals("L")) {
            turnLeft();
        }
        if (command.equals("R")) {
            turnRight();
        }
        if (command.equals("M")) {
            moveForward();
        }
        return showStatus();
    }
}
