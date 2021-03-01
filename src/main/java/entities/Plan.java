package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plan {
    /**
     * creacion de atributos
     */
    public static final int MIN_BEATS = 90;
    public static final int MAX_BEATS = 160;

    private long number;
    private char type; //en el digrama de clases aparecec string

    private Date date;
    private int level;
    private boolean active;
    private Date start;
    private Date end;
    /**
     * creacion de relaciones
     */
    private List<Week> weeks;
    private Cyclist cyclist;
    private Trainer trainer;
    private List<ProgressLog> progress;
    /**
     * Creacion de constructor
     *
     */
    public Plan(long number) {
        this.number = number;
        this.weeks = new ArrayList<>();
    }

    /**
     * Creacion de (getters, adders,...)
     *
     */
    public void addWeek(Week week) {
        this.weeks.add(week);
    }

    public long getNumber() {
        return number;
    }

    public char getType() {
        return type;
    }
}
