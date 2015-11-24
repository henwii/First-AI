package com.mygdx.game2;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Besten on 2015-11-24.
 */
public class Boxes {
    int x,y;
    int width = 100;
    int height = 100;

    Boxes(int x0, int y0){
        x = x0;
        y = y0;
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.rect(x,y,width,height);
        shapeRenderer.end();
    }

    public void update() {

    }
}
