import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setLowRadiostationTest() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.setRadiostation(0));
    }

    @Test
    public void setHighRadiostationTest() {
        Radio radio = new Radio();

        Assertions.assertEquals(9, radio.setRadiostation(9));
    }

    @Test
    public void setWrongRadiostationTest() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(9, radio.setRadiostation(10));
    }

    @Test
    public void prevRadiostationZeroTest() {
        Radio radio = new Radio();

        radio.setRadiostation(0);

        Assertions.assertEquals(9, radio.prevRadiostation());
    }

    @Test
    public void prevRadiostationTest() {
        Radio radio = new Radio();

        radio.setRadiostation(9);

        Assertions.assertEquals(8, radio.prevRadiostation());
    }

    @Test
    public void nextRadiostationTest() {
        Radio radio = new Radio();

        radio.setRadiostation(1);

        Assertions.assertEquals(2, radio.nextRadiostation());
    }

    @Test
    public void nextRadiostationNineTest() {
        Radio radio = new Radio();

        radio.setRadiostation(9);

        Assertions.assertEquals(0, radio.nextRadiostation());
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        Assertions.assertEquals(51, radio.increaseVolume());
    }

    @Test
    public void increaseVolumeHighTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.increaseVolume());
    }

    @Test
    public void decreaseLowVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.decreaseVolume());
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(99, radio.decreaseVolume());
    }
    @Test
    public void setWrongVolumeTest() {
        Radio radio = new Radio();

        Assertions.assertEquals(100, radio.setCurrentVolume(101));
    }
}
