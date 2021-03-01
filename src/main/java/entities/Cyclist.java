package entities;

import java.util.ArrayList;
import java.util.Date;

public class Cyclist {
    /**
     * Creacion de atributos
     */
    private  String email;
    private  String name;
    private Date birthDate;
    private int level;
    private double height;
    private double weight;
    /**
     * creacion de relaciones
     */
    private ArrayList<Plan> plans;
    private ArrayList<Activity> results;


}
