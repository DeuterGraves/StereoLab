import Stereo.Component.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "CDP-XE510");
    }


    @Test
    public void cdPlayerStartedEmpty(){
        assertEquals(0, cdPlayer.countCDs());
    }

    @Test
    public void canLoadCd(){
        cdPlayer.loadCD("Stereolab - Peng!");
        cdPlayer.loadCD("Busted - A Present for Everyone");
        assertEquals(2, cdPlayer.countCDs());
    }

    @Test
    public void canEjectCDs(){
        cdPlayer.loadCD("Stereolab - Peng!");
        cdPlayer.loadCD("Busted - A Present for Everyone");
        cdPlayer.ejectCD("Busted - A Present for Everyone");
        assertEquals(1, cdPlayer.countCDs());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("CDP-XE510", cdPlayer.getModel());
    }

    @Test
    public void canPlaySong(){
        assertEquals("I am playing Stereolab - Peng!", cdPlayer.play("Stereolab - Peng!"));
    }

    @Test
    public void canPauseSong(){
        assertEquals("CD Player has paused", cdPlayer.pause());
    }

}
