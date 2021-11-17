package de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.games;

import de.unistuttgart.iste.sqa.pse.sheet05.presence.controlflowexercise.BaseControlFlowHamsterGame;

import java.util.Optional;

public class PrimaryPickOrMoveGame extends BaseControlFlowHamsterGame {

    public PrimaryPickOrMoveGame() {
        super("/territories/territoryExample05-4.1.ter" , Optional.empty(), Optional.empty());
    }

    /**
     * Starts the game with a predetermined territory and lets Paule walk through a short test scenario.
     */
    @Override
    protected void run() {
       pickGrainOrMove();
    }
}
