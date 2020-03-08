package belosqueues.game.stages;

import belosqueues.game.GameEngine;
import belosqueues.game.components.Position;
import belosqueues.game.components.TupperWare;

public abstract class Stage {

    protected TupperWare container;

    public Stage(){
        container = new TupperWare();
        populateContainer();
    }

    protected void populateContainer(){

        for (int col = 0; col < GameEngine.WIDTH; col++){
            for (int row = 0; row < GameEngine.HEIGHT; row++){
                Position pos = new Position(col, row);
                container.addCell(pos);
            }
        }
    }



}
