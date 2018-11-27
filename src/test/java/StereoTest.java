import Stereo.Component.CDPlayer;
import Stereo.Component.Radio;
import Stereo.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "CDP-XE510");
        radio = new Radio("Sony", "ICF-780L");
        stereo = new Stereo(radio, cdPlayer, "Living Room");
    }

    @Test
    public void canGetRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void canGetCDPlayer(){
        assertEquals(cdPlayer, stereo.getCdPlayer());
    }

    @Test
    public void canGetName(){
        assertEquals("Living Room", stereo.getName());
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canIncreaseVolume(){
        stereo.volumeUp();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void cantIncreaseVolumePast11(){
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        stereo.volumeUp();
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void canDecreaseVolume(){
        stereo.volumeDown();
        assertEquals(4, stereo.getVolume());
    }

    @Test
    public void cantDecreaseVolumePast0(){
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        stereo.volumeDown();
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canSetVolume(){
        stereo.setVolume(11);
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void canMute(){
        stereo.mute();
        assertEquals(0, stereo.getVolume());
    }
}
