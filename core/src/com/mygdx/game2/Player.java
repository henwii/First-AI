package com.mygdx.game2;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;

/**
 * Created by Besten on 2015-11-24.
 */
public class Player {

    ArrayList<Boxes> box = new ArrayList<Boxes>();

    int x = 100;
    int y = 100;
    int width = 20;
    int height = 20;
    int vx = 2;
    int vy = 0;
    double v = 2;

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.RED);
        shapeRenderer.rect(x, y, width, height);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.line(x + width/2,y + height/2,(int)(x + 100 * Math.cos(v)),(int)( y + 100 * Math.sin(v)));
        shapeRenderer.end();
    }

    public void update() {
        x += vx;
        y += vy;
        v += 0.1;

        for(Boxes b: box){

        }
    }
}
