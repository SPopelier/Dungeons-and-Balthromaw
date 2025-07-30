package fr.popelier.sarah.dungeons.and.balthromaw.model;


public class Entity {

    //Charactéristiques
    private String type;
    private int attack; //Niveau d'attaque
    private int life; //Niveau de vie


    //Getters
    public String getType() {
        return type;
    }

    public int getAttack() {
        return  attack;
    }

    public int getLife() {
        return life;
    }

    //Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //Constructeur
    protected Entity(String type, int attack, int life) {
        this.type = type;
        this.attack = attack;
        this.life = life;
    }

    //méthode toString
    @Override
    public String toString() {
        return type + attack +life;
    }
}
