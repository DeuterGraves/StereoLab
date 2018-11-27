package Stereo.Component;

import java.util.ArrayList;

public class CDPlayer extends Component implements IPlayPause{

    private ArrayList<String> cds;
    private int capacity;
//    private int loadedCDs

    public CDPlayer(String make, String model){
        super(make, model);
        this.capacity = 6;
        this.cds = new ArrayList<>();
//        this.loadedCDs = loadedCDs;

    }
//    count cds
    public int countCDs(){
        return this.cds.size();
    }

//    load cd
    public void loadCD(String cd){
        this.cds.add(cd);
    }

//    eject cds
    public void ejectCD(String cd){
        this.cds.remove(cd);
    }

    public String play(String song){
        return "I am playing " + song;
    }

    public String pause(){
        return "CD Player has paused";
    }

//    change cds


//    stop play

}
