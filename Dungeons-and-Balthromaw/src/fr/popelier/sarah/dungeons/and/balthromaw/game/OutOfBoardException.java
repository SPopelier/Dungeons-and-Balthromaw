package fr.popelier.sarah.dungeons.and.balthromaw.game;

/**
 *Exception lorsque le joueur dépasse les limites du GameBoard
 *Utilisé pour signaler une erreur
 *
 */
public class OutOfBoardException extends Exception {

    /**
     * Construit une exception avec message personnalisé
     * @param message le message décrivant l'erreur
     */
    public OutOfBoardException(String message) {
        super(message);
    }
}
