package fr.popelier.sarah.dungeons.and.balthromaw.game;

/**
 * classe des cases de jeu
 * attribution de leurs symbole
 */
public abstract class Cell {

    /**
     *
     * @return le symbole associé
     */
    public abstract String getSymbol();


    /**
     * représente une cellule vide du plateau
     */
    class EmptyCell extends Cell {
            @Override
            public String getSymbol() {
                return "V";
            }
        }

    /**
     * représente une cellule contenant un ennemi
     */
    class EnemyCell  extends Cell {
            @Override
            public String getSymbol() {
                return "X";
            }
        }

    /**
     * représente une cellule contenant une arme
     */
    class WeaponCell extends Cell {
            @Override
            public String getSymbol() {
                return "W";
            }
        }

    /**
     * représente une cellule contenant une potion
     */
    class PotionCell extends Cell  {
            @Override
            public String getSymbol() {
                return "P";
            }
        }
    }
