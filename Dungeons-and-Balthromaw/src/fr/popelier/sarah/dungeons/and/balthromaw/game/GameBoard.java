package fr.popelier.sarah.dungeons.and.balthromaw.game;

import java.util.ArrayList;
import java.util.Random;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.enemy.Dragon;
import fr.popelier.sarah.dungeons.and.balthromaw.enemy.Goblin;
import fr.popelier.sarah.dungeons.and.balthromaw.enemy.Sorcerer;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive.Club;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive.FireBall;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive.Flash;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive.Sword;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion.BigPotion;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion.Potion;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion.StandardPotion;
import fr.popelier.sarah.dungeons.and.balthromaw.game.cell.*;


public class GameBoard {

    protected Cell[][] board;

    private final int LIGNES = 8;
    private final int COLONNES = 8;


    public GameBoard() {

        board = new Cell[LIGNES][COLONNES];
        for (int i = 0; i< LIGNES; i++){
           for (int j = 0; j< COLONNES; j++){
               board[i][j] = new EmptyCell();
           }
        }
        RandomCells();
        }


    public Cell getCase(int ligne, int colonne) {
        return board[ligne][colonne];
    }

    public void setCell(int ligne, int colonne, Cell cell) {
        board[ligne][colonne] = cell;
    }

    private void setCells(int[] indexes, Cell c) {
        for (int i = 0; i< LIGNES; i++){
            for (int j = 0; j< COLONNES; j++){
                board[i][j] = new EmptyCell();
            }
        }
    }

    /**
     * affiche le contenu du plateau sous forme textuelle
     */
    public String display() {
        StringBuilder sb = new StringBuilder("Plateau de jeu :\n\n");
        for (int i = 0; i< LIGNES; i++){
            for (int j = 0; j< COLONNES; j++) {
                sb.append(board[i][j].getSymbol()).append(" ");
            }
             sb.append("\n");
        }
        return sb.toString();
    }

    public void RandomCells() {
        Random random = new Random();

        //Place 4 Dragons
        for  (int i = 0; i< 3; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new EnemyCell(new Dragon(4, 15));
        }

        //Place 10 Sorciers
        for  (int i = 0; i< 9; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new EnemyCell(new Sorcerer(2, 9));
        }

        //Place 10 Gobelins
        for  (int i = 0; i< 9; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new EnemyCell(new Goblin(1, 6));
        }

        //Place 5 Massues
        for  (int i = 0; i< 4; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new OffensiveCell(new Club());
        }

        //Placer 4 Epées
        for  (int i = 0; i< 3; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new OffensiveCell(new Sword());
        }

        //Placer 5 Eclairs
        for  (int i = 0; i< 4; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new OffensiveCell(new Flash());
        }

        //Placer 2 Boules de feu
        for  (int i = 0; i< 1; i++) {
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new OffensiveCell(new FireBall());
        }

        //Placer 6 potions strd
        for  (int i = 0; i< 4; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new PotionCell(new StandardPotion());
        }

        //Placer 2 Big Potion
        for  (int i = 0; i< 4; i++){
            int row = random.nextInt(LIGNES);
            int col = random.nextInt(COLONNES);
            board[row][col] = new PotionCell(new BigPotion());
        }
    }
}

