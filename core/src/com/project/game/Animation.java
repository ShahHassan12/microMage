package com.project.game;

import com.badlogic.gdx.graphics.Texture;

public class Animation {
    Texture[] frames;
    int frameCount;
    int currentFrame;
    float frameTimeDelta;
    float frameTimeLength;

    public Animation(Texture[] frames, float speed){
        this.frames = frames;
        frameCount = frames.length;
        currentFrame = 0;
        frameTimeDelta = 0;
        frameTimeLength = speed;
    }

    public int getCurrentFrame(){
        return currentFrame;
    }

    public void update(float dt){
        frameTimeDelta += dt;
        if(frameTimeDelta > frameTimeLength){
            currentFrame++;
            frameTimeDelta = 0;
        }
        if(currentFrame >= frameCount)
            currentFrame = 0;

    }
    public Texture getTexture(){
        return frames[currentFrame];
    }
    public void resetFrames(){
        currentFrame = 0;
    }
}