import Stereo.Component.CDPlayer;
import Stereo.Component.MP3;
import Stereo.Component.Radio;
import Stereo.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    MP3 mp3;
    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "CDP-XE510");
        radio = new Radio("Sony", "ICF-780L");
        stereo = new Stereo(radio, cdPlayer, "Living Room");
        mp3 = new MP3("iPod", "Generation 3");

    }

    @Test
    public void canConnectToStereo(){
        assertEquals("Playing on... Living Room", mp3.connect(stereo));
    }

    @Test
    public void canPlayMP3(){
        assertEquals("I am playing Busted - Airhostess", mp3.play("Busted - Airhostess"));
    }

    @Test
    public void canPauseMP3(){
        assertEquals("Mp3 Player is paused", mp3.pause());
    }
}
