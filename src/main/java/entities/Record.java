package entities;

import java.time.Instant;

public class Record {
    /**
     * Creaciopn de atributos
     */
    private int beats;

    private double speed;
    private int power;
    private Instant time;

    /**
     * Creacion de constructor
     */
    public Record(int beats) {
        this.beats = beats;
    }
    /**
     * Creacion de getters
     */
    public int getBeats() {
        return beats;
    }
}
