package fr.popelier.sarah.dungeons.and.balthromaw.ui;

/**
 * représente la carte version graphique du joueur Warrior
 * associe le nom et l'image
 */
public class WarriorCard extends CharacterCard{

    /**
     * permet d'afficher via l'interface graphique l'image du joueur séléctionné
     */
    public WarriorCard() {
        this.imagePath = "/assets/warrior.png";
    }

    /**
     * permet d'afficher textuellement le name du joueur Warrior
     * @return le nom du joueur
     */
    @Override
    public String toString() {
        return "WarriorCard{" +
                "name='" + name + '\'' +
                '}';
    }
}
