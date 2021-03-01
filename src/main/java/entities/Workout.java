package entities;

import java.time.Duration;

public class Workout {
    /**
     * creacion de aributos
     *
     */
    private String code;
    private String objective;
    private String descriptoion;
    private int zone;
    private char type;
    private Duration duration;
    private String steps;
    /**
     * creacion de relaciones
     */
    Trainer trainer;
}
