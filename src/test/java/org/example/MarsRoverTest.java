package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_initialise_mars_rover() {
        // given
        MarsRover rover = new MarsRover();
        // when
        String report = rover.showStatus();
        // then
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_face_west_when_orient_north_and_turn_left() { //00N turn left
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("L");
        String report = rover.showStatus();
        // then
        assertEquals("0:0:W", response);
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left() { //00W turn left
        // given
        MarsRover rover = new MarsRover();
        // when
       rover.parseCommands("L");
        String response = rover.parseCommands("L");
        // then
        assertEquals("0:0:S", response);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left() { //00S turn left
        // given
        MarsRover rover = new MarsRover();
        // when
        rover.parseCommands("L");
        rover.parseCommands("L");
        String response = rover.parseCommands("L");
        // then
        assertEquals("0:0:E", response);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left() { //00E turn left
        // given
        MarsRover rover = new MarsRover();
        // when
        rover.parseCommands("L");
        rover.parseCommands("L");
        rover.parseCommands("L");
        String response = rover.parseCommands("L");
        // then
        assertEquals("0:0:N", response);
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right() { //    00N turn right
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("R");
        // then
        assertEquals("0:0:E", response);
    }

    @Test
    public void should_face_south_when_orient_east_and_turn_right() { //    00 E turn right
        // given
        MarsRover rover = new MarsRover();
        // when
        rover.parseCommands("R");
        String response = rover.parseCommands("R");
        // then
        assertEquals("0:0:S", response);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right() { //    00 S turn right
        // given
        MarsRover rover = new MarsRover();
        // when
        rover.parseCommands("R");
        rover.parseCommands("R");
        String response = rover.parseCommands("R");
        // then
        assertEquals("0:0:W", response);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right() { //00W turn right
        // given
        MarsRover rover = new MarsRover();
        // when
        rover.parseCommands("L");
        String response = rover.parseCommands("R");
        // then
        assertEquals("0:0:N", response);
    }


    @Test
    public void should_be_at_0_1_N_when_move_forward_when_orient_north() { //    move forward from 00N to 01N
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("M");
        // then
        assertEquals("0:1:N", response);
    }

    @Test
    public void should_be_at_1_0_E_when_move_forward_when_orient_east() { //    move forward from 00E to 10E
        // given
        MarsRover rover = new MarsRover();
        rover.parseCommands("R");
        // when
        String response = rover.parseCommands("M");
        // then
        assertEquals("1:0:E", response);
    }

    @Test
    public void should_be_at_0_negative1_S_move_forward_when_orient_south() { //    move forward from 00S to 0-1S
        // given
        MarsRover rover = new MarsRover();
        rover.parseCommands("R");
        rover.parseCommands("R");
        // when
        String response = rover.parseCommands("M");
        // then
        assertEquals("0:-1:S", response);
    }

//    west
    @Test
    public void should_be_at_negative1_0_W_when_move_forward_when_orient_west() { //    move forward from 00W to -10W
        // given
        MarsRover rover = new MarsRover();
        rover.parseCommands("L");
        // when
        String response = rover.parseCommands("M");
        // then
        assertEquals("-1:0:W", response);
    }

    @Test
    public void should_be_at_0_negative1_N_when_move_backward_when_orient_north() { //    move backward from 00N to 0-1N
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("B");
        // then
        assertEquals("0:-1:N", response);
    }

    @Test
    public void should_be_at_negative1_0_E_when_move_backward_when_orient_east() { //    move backward from 00E to -10E
        // given
        MarsRover rover = new MarsRover();
        rover.parseCommands("R");
        // when
        String response = rover.parseCommands("B");
        // then
        assertEquals("-1:0:E", response);
    }

    @Test
    public void should_be_at_0_1_S_when_move_backward_when_orient_south() { //    move backward from 00S to 01S
        // given
        MarsRover rover = new MarsRover();
        rover.parseCommands("R");
        rover.parseCommands("R");
        // when
        String response = rover.parseCommands("B");
        // then
        assertEquals("0:1:S", response);
    }

    @Test
    public void should_be_at_1_0_W_when_move_backward_when_orient_west() { //    move backward from 00W to 10W
        // given
        MarsRover rover = new MarsRover();
        rover.parseCommands("L");
        // when
        String response = rover.parseCommands("B");
        // then
        assertEquals("1:0:W", response);
    }

    @Test
    public void should_face_west_and_be_at_negative1_0_when_turn_left_and_move_forward() { //    00N L;M
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("LM");
        // then
        assertEquals("-1:0:W", response);
    }

    @Test
    public void should_face_east_and_be_at_1_0_when_turn_right_and_move_forward() { //    00N R;M
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("RM");
        // then
        assertEquals("1:0:E", response);
    }

    @Test
    public void should_be_at_0_0_when_move_forward_and_then_backward() { //    00N M;B
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("MB");
        // then
        assertEquals("0:0:N", response);
    }

    @Test
    public void should_do_nothing_for_invalid_command() {
        // given
        MarsRover rover = new MarsRover();
        // when
        String response = rover.parseCommands("X");
        // then
        assertEquals("0:0:N", response);
    }



}

