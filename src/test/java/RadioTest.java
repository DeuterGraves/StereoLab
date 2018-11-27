import Stereo.Component.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "ICF-780L");
    }

    @Test
    public void radioCanTune(){
        assertEquals("Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("ICF-780L", radio.getModel());
    }
}
