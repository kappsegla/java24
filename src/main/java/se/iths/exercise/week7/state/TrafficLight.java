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
    }

    private void nextState() {
        state = switch (state) {
            case RED -> RED_ORANGE;
            case RED_ORANGE -> GREEN;
            case GREEN -> ORANGE;
            case ORANGE -> RED;
        };
    }
}

enum LightState {
    RED, RED_ORANGE, ORANGE, GREEN
}
