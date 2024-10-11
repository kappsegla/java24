package se.iths.exercise.week7.state;

import static se.iths.exercise.week7.state.LightState.*;

public class TrafficLight {
    LightState state = RED;

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        System.out.println(t.state);
        t.nextState();
        System.out.println(t.state);
        t.nextState();
        System.out.println(t.state);
        t.nextState();
        System.out.println(t.state);
        t.nextState();
        System.out.println(t.state);
        t.nextState();
        System.out.println(t.state);
        t.nextState();
    }

    private void nextState() {
        if(state == RED )
            state = RED_ORANGE;
        else if(state == RED_ORANGE )
            state = GREEN;
        else if(state == GREEN)
            state = ORANGE;
        else if(state == ORANGE)
            state = RED;
    }
}

enum LightState {
    RED, RED_ORANGE, ORANGE, GREEN
}
