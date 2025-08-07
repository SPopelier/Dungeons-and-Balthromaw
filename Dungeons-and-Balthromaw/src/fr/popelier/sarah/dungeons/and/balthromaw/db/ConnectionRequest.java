package fr.popelier.sarah.dungeons.and.balthromaw.db;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.game.GameBoard;

import java.sql.*;

public class ConnectionRequest {
    //méthode pour sauvegarder des caractères
    //méthode pour mettre à jour
    //Open a conection
    static final String DB_URL = "jdbc:mysql://localhost/DungeonsAndBalthromaw";
    //Connexion à la bdd
    static final String USER = "root";
    //user de la bdd
    static final String PASS = "Azerty123!!!";
    //mdp de la bdd

    // ------------------- CONNEXION -------------------
    public Connection connectToDB() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // ------------------- GET HEROES -------------------
    public void getHeroes() {
        try {
            Connection conn = connectToDB();
            String query = "SELECT * FROM DungeonsAndBalthromaw.Entity ";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + " | Name: " + name);

            }
        } catch (SQLException e) {
            e.printStackTrace(); //pour loguer les erreurs
        }
    }

    // ------------------- CREATE HERO -------------------
    public void createHero(Character player) {
        try {
            Connection conn = connectToDB();
            String query = "INSERT INTO DungeonsAndBalthromaw.Entity(name, attack, life, defensiveEquipment, offensiveEquipment) VALUES(? , ? , ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, player.getName());
            stmt.setInt(2, player.getAttack());
            stmt.setInt(3, player.getLife());
            stmt.setObject(4, player.getDefensiveEquipment());
            stmt.setObject(5, player.getOffensiveEquipment());
            stmt.executeUpdate();
            ResultSet keys =  stmt.getGeneratedKeys(); // donnée renvoyée depuis la BDD 
            keys.next(); // récupère la première donnée de la BDD
            Long id = keys.getLong(1); // récupère la data de la première donnée (next)
            player.setId(id);

        } catch (SQLException e) {
            e.printStackTrace(); //pour loguer les erreurs
        }
    }

    // ------------------- UPDATE HERO -------------------
    public void editHero(Character character) {
        try {
            Connection conn = connectToDB();

            String query = "UPDATE DungeonsAndBalthromaw.Entity SET name = ?, attack = ?, life = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, character.getName());
            stmt.setInt(2, character.getAttack());
            stmt.setInt(3, character.getLife());
            stmt.setLong(4, character.getId());
            int rowsUpdated = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ------------------- CHANGER LES POINTS DE VIE -------------------
    public int changeLifePoints(Character character) {
        try {
            Connection conn = connectToDB();

            String query = "UPDATE DungeonsAndBalthromaw.Entity SET life = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, character.getLife());
            stmt.setLong(2, character.getId());

            int rows =  stmt.executeUpdate();
            return rows;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // ------------------- SAUVEGARDE DU PLATEAU -------------------
    public int saveBoard(GameBoard gameBoard, int playerPosition) {
        try {
            Connection conn = connectToDB();

            String query = "INSERT INTO DungeonsAndBalthromaw.Board ( gameBoard, playerPosition) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setObject(1, gameBoard);
            stmt.setInt(2, playerPosition);
            return stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // ------------------- CHARGER UN PLATEAU -------------------
    public int loadBoard(int gameBoardId, int playerPosition) {
        try {
            Connection conn = connectToDB();

            String query = "SELECT gameboard, playerPosition FROM DungeonsAndBalthromaw.Board WHERE gameboard = ? AND playerPosition = ?";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, gameBoardId);
            stmt.setInt(2, playerPosition);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("gameboard");
            }
        }catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return gameBoardId;
    }
}