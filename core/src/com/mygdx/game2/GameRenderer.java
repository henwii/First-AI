package com.mygdx.game2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;

/**
 * Created by Besten on 2015-11-24.
 */
public class GameRenderer {

    GameWorld world = new GameWorld();
    Player player = new Player();
    ArrayList<Bots> bot = new ArrayList<Bots>();

    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    public GameRenderer(){
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 1920, 1080);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
        for(int i = 10; i < 1900; i+=930){
            bot.add(new Bots(i, (int) (1000*Math.random())));
        }
    }

    public void render() {
        Gdx.gl.glClearColor(255, 255, 255, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        world.render(shapeRenderer);
        player.render(shapeRenderer);
        for(Bots bots: bot){
            bots.render(shapeRenderer);
        }
    }

    public void update(float delta) {
        world.update(delta);
        player.update();
        for(Bots bots: bot){
            bots.update();
        }
    }
}
