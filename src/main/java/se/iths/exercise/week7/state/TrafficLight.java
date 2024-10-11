package se.iths.exercise.week7.state;

import static se.iths.exercise.week7.state.LightState.*;

public class TrafficLight {
    LightState state = RED;

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.state);
            t.state = t.state.nextState();
        }
    }
}

enum LightState {
    RED {
        @Override
        public LightState nextState() {
            return RED_ORANGE;
        }
    }, RED_ORANGE {
        @Override
        public LightState nextState() {
            return GREEN;
        }
    }, ORANGE {
        @Override
        public LightState nextState() {
            return RED;
        }
    }, GREEN {
        @Override
        public LightState nextState() {
            return ORANGE;
        }
    };

    public abstract LightState nextState();

//    public LightState nextState() {
//        return switch (this) {
//            case RED -> RED_ORANGE;
//            case RED_ORANGE -> GREEN;
//            case GREEN -> ORANGE;
//            case ORANGE -> RED;
//        };
//    }
}
