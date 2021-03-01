package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Week {
    /**
     * Creacion de atributos
     */
    private int number;
    private Duration ridetime;
    private String objective;
    /**
     * Creacion de relaciones
     */
    private Plan plan;
    private ArrayList<Session> sessions;
    /**
     * Creacion de contructor
     */
    public Week() {
        this.sessions = new ArrayList<>();
    }
    /**
     *
     */
    public void registerSession(Session session) {
        this.sessions.add(session);
    }

    /**
     *Creacion de asignacion
     */
    public void assingPlan(Plan plan) {
        this.plan = plan;
    }
}
