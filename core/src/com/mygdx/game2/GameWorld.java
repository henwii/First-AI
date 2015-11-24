package com.mygdx.game2;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;

/**
 * Created by Besten on 2015-11-24.
 */
public class GameWorld {

    ArrayList<Boxes> box = new ArrayList<Boxes>();

    public GameWorld(){
        for(int i = 1; i < 20; i++) {
                box.add(new Boxes((int) (10 +  1850 * Math.random()), (int) (10 + 900 * Math.random())));
        }
    }

    public void render(ShapeRenderer shapeRenderer) {
        for(Boxes b: box){
            b.render(shapeRenderer);
        }
    }

    public void update(float delta) {
        for(Boxes b: box){
            b.update();
        }
    }
}
