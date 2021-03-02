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
    private String type; //en el digrama de clases aparecec string pero en el codigo enviado aparece char

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
    public Plan(String type, Cyclist cyclist){
        this.type=type;
        this.cyclist=cyclist;
    }
    /**
     * Creacion de metodos
     */
    public int averageBeats(){
        int result =0;
        for(int i=0; getWeeks().size()<i;i++){
            result = this.weeks.get(i).averageBeats();
        }
        return result;
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

    public String getType() {
        return type;
    }

    public List<Week> getWeeks() {
        return weeks;
    }
}
