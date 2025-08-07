package fr.popelier.sarah.dungeons.and.balthromaw.game;

import java.util.ArrayList;

import fr.popelier.sarah.dungeons.and.balthromaw.game.cell.*;

/**
 * représente le plateau de jeu
 * Chaque case est une instance de la classe abstraite {@link Cell}.
 * Le plateau permet de consulter, modifier et afficher l'état des cellules.
 */
public class GameBoard {

    /**
     * liste des cases du plateau
     * taille fixe à 64
     */
    private ArrayList<Cell> board;

    /**
     * constructeur : initialisation du plateau (vide)
     * Chaque cellule est une implémentation anonyme de {@link Cell} retournant un symbole vide.
     */
    public GameBoard() {
        board = new ArrayList<>();
        board.add(new EmptyCell()); //Case 1
        board.add(new EnemyCell());  // Case 2
        board.add(new OffensiveCell()); // Case 3
        board.add(new DefensiveCell()); // Case 4
        board.add(new EmptyCell()); // Case 5
        board.add(new DefensiveCell()); // Case 6
        board.add(new EnemyCell()); // Case 7
        board.add(new OffensiveCell()); // Case 8
        board.add(new EmptyCell()); // Case 9
        board.add(new DefensiveCell()); // Case 10

        /*
        for (int i = 0; i<=4; i++){
            board.add(new Cell() {
                @Override
                public String getSymbol() {
                    return "Vide";
                }
            });
        }*/
    }

    /**
     *
     * @param index index de la case
     * @return L'objet {@link Cell} à cette position
     */
    public Cell getCase(int index) {
        return board.get(index);
    }

    /**
     * Modifie la valeur d'une case.
     *
     * @param index index de la case (0 à 63)
     * @param cell cellule à stocker valeur à y stocker (ex : 1 = joueur, 0 = vide, 2 = piège, etc.)
     */
    public void setCase(int index, Cell cell) {
        board.set(index, cell);
    }

    /**
     * affiche le contenu du plateau sous forme textuelle
     */
    public String display() {
        StringBuilder sb = new StringBuilder("Plateau de jeu :\n\n");
        for (int i = 0; i < board.size(); i++) {
            sb.append(board.get(i).getSymbol()).append(" ");
            //if ((i + 1) % 64 == 0) sb.append("\n");
        }
        return sb.toString();
    }





}
