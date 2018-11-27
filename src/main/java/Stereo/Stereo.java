package Stereo;

import Stereo.Component.CDPlayer;
import Stereo.Component.Radio;

public class Stereo {

    private Radio radio;
    private CDPlayer cdPlayer;
    private String name;
    private int volume;
//    private boolean power;

    public Stereo(Radio radio, CDPlayer cdPlayer, String name){
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.name = name;
        this.volume = 5;
//        this.power = false;
    }

    public Radio getRadio(){
        return this.radio;
    }

    public CDPlayer getCdPlayer(){
        return this.cdPlayer;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }

    public void volumeUp(){
        if (this.volume < 11){
            this.volume ++;
        }
    }

    public void volumeDown(){
        if (this.volume > 0){
            this.volume --;
        }
    }

    public void setVolume(int volume){
        this.volume = volume;

    }

    public void mute(){
        this.setVolume(0);
    }
}
