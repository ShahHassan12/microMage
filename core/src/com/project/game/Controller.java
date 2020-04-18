package com.project.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.project.game.entities.Player;

public class Controller extends InputAdapter {
    Player player;
    public Controller(Player player){

        this.player = player;
    }
    @Override
    public boolean keyDown (int keycode) {
        switch(keycode){
            case Input.Keys.W:
                player.moveUp(true);
                break;
            case Input.Keys.A:
                player.moveLeft(true);
                break;
            case Input.Keys.S:
                player.moveDown(true);
                break;
            case Input.Keys.D:
                player.moveRight(true);
                break;

        }
        return true;
    }

    @Override
    public boolean keyUp (int keycode) {
        switch(keycode){
            case Input.Keys.W:
                player.moveUp(false);
                break;
            case Input.Keys.A:
                player.moveLeft(false);
                break;
            case Input.Keys.S:
                player.moveDown(false);
                break;
            case Input.Keys.D:
                player.moveRight(false);
                break;

        }
        return true;
    }

    @Override
    public boolean touchDown (int x, int y, int pointer, int button) {
        if(button == 0){ // 0 is left click
            player.shoot(x, y);
        }
        return false;
    }
}