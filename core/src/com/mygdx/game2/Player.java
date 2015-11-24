package com.mygdx.game2;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Besten on 2015-11-24.
 */
public class Player {

    int x = 100;
    int y = 100;
    int width = 20;
    int height = 20;
    int vx = 2;
    int vy = 0;

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.RED);
        shapeRenderer.rect(x,y ,width,height);
        shapeRenderer.end();
    }

    public void update() {
        x += vx;
        y += vy;
    }
}
