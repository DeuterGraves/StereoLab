package Stereo.Component;

import Stereo.Stereo;

public class MP3 extends Component implements IConnect, IPlayPause {

    public MP3(String make, String model){
        super(make, model);

    }

    public String connect(Stereo stereo){
        return "Playing on... " + stereo.getName();
    }

    public String play(String song){
        return "I am playing " + song;
    }

    public String pause(){
        return "Mp3 Player is paused";
    }
}
