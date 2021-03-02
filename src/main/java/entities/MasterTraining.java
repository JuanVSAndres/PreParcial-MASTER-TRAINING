package entities;

import java.util.ArrayList;
import java.util.List;

public class MasterTraining {
    /**
     * cracion de atributos
     */
    public static final int UNDEFINED=-1;
    /**
     * Creacion de relaciones
     */
    private ArrayList<Plan> plans;
    private ArrayList<Cyclist> cyclists;
    private ArrayList<Workout> workouts;
    private ArrayList<Trainer> trainers;
    /**
     * contructor
     */
    public MasterTraining() {
        this.plans = new ArrayList<>();
    }
    /**
     * creacion de metodos
     */

    /**
     * Determina para un plan específico el rendimiento del corazón del ciclista.
     * Si el corazón presenta latidos irregulares, crea un nuevo plan de tipo “Heart Care” para dicho ciclista.
     *
     * @param number El numero del plan a verificar
     * @return Plan: El nuevo plan creado en caso de necesitarlo, de lo contrario null.
     */
    public Plan checkHeart(long number) {
        this.findPlan(number);
        return null;
    }

    public Plan findPlan(long number){
        for(int i=0;i<plans.size();i++){
            if(plans.get(i).getNumber()==number){

                return plans.get(i);
            }
        }
        return null;
    }

    public void addPlan(Plan plan) {
        this.plans.add(plan);
    }

    public int countPlans() {
        return this.plans.size();
    }
}
