package entities;

import java.util.Date;

public class Session {
    /**
     * Creacion de atributos
     */
    private char type;
    private int dayOfTheWeek;
    /**
     * Creacion de relaciones
     */
    private Activity activity;
    /**
     * Creacion de asignacion
     */
    public void assignActivity(Activity activity) {
        this.activity = activity;
    }
    /**
     * creacion de metodos
     */
    public Date date(){
        return new Date();
    }

    public int averageBeats(){
        int result=0;
        if(activity!= null){
            result=activity.averageBeats();
        }
        return result;
    }
}
