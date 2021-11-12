package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise.games;

/**
 * This class contains the {@code main}-method, responsible for starting the game.
 * Do not modify!
 */
public class PickNonEmptyTilesGameApp {

    public static void main(String[] args) {
        final PickNonEmptyTilesGame game = new PickNonEmptyTilesGame("/territories/territoryExample05-5.ter");
        game.doRun();
    }
}
