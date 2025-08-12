package fr.popelier.sarah.dungeons.and.balthromaw.equipment;

import java.io.Serializable;

/**
 * Représente la classe des équipements(name)
 */
public class Equipment {

    /**
     * Le nom de l'équipement
     */
    private String name;

    /**
     *
     * @return le nom de l'équipement
     */
    public String getName() { return name;}

    /**
     *
     * @param name le nouveau nom à attribuer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructeur d'un nouvel équipement
     * @param name le nom de l'équipement
     */
    public Equipment(String name) {
        this.name = name;
    }

    /**
     * affiche textuellement l'équipement
     * @return le nom de l'équipement
     */
    @Override
    public String toString() {
    return name;
    }
}
