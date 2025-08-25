package fr.popelier.sarah.dungeons.and.balthromaw.model;

/**
 * Représente la classe de base avec les attributs pour tous les personnages
 */
public abstract class Entity {

    /**
     * Le niveau d'attaque
     */
    protected int attack; //Niveau d'attaque
    /**
     * Le niveau de vie
     */
    protected int life; //Niveau de vie


    /**
     *
     * @return le niveau d'attaque
     */
    public int getAttack() {
        return  attack;
    }

    /**
     *
     * @return le niveau de vie
     */
    public int getLife() {
        return life;
    }

    /**
     * modifie la valeur du niveau d'attaque
     *
     * @param attack la nouvelle valeur d'attaque
     */
    //Setters
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * modifie le niveau de vie
     *
     * @param life la nouvelle valeur du niveau de vie
     */
    public void setLife(int life) {
        this.life = life;
    }


    /**
     * Construit les attributs de niveau d'attaque et de vie
     *
     * @param attack le niveau d'attaque
     * @param life le niveau de vie
     */
    protected Entity(int attack, int life) {
        this.attack = attack;
        this.life = life;
    }

    /**
     * Retourne la valeur en texte du personnage
     * avec son niveau d'attaque et de vie
     * @return une chaîne de caractères qui décrit les stats personnage
     */
    @Override
    public String toString() {
        return "Le niveau d'attaque est de : " + attack + " et le niveau de vie est de " +life + " .";
    }
}
