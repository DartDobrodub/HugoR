package com.densoft.hugoracing.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.densoft.hugoracing.model.Hugo;

public class GameScreen implements Screen {

    private Texture hugoTexture;
    private SpriteBatch batch;
    private Hugo hugo;

    @Override
    public void show() {
        batch = new SpriteBatch();
        hugoTexture = new Texture(Gdx.files.internal("logo.png"));
        hugo = new Hugo(hugoTexture, 0, 0, 168, 210);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        hugo.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        hugoTexture.dispose();
    }
}
