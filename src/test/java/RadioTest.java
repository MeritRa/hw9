import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setLowRadiostationTest() {
        Radio radio = new Radio();

        int expected = 1;
        int actual = radio.setRadiostation(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setHighRadiostationTest() {
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.setRadiostation(9);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setWrongRadiostationTest() {
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.setRadiostation(10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadiostationZeroTest() {
        Radio radio = new Radio();

        radio.setRadiostation(0);

        int expected = 9;
        int actual = radio.prevRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadiostationTest() {
        Radio radio = new Radio();

        radio.setRadiostation(9);

        int expected = 8;
        int actual = radio.prevRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadiostationTest() {
        Radio radio = new Radio();

        radio.setRadiostation(1);

        int expected = 2;
        int actual = radio.nextRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadiostationNineTest() {
        Radio radio = new Radio();

        radio.setRadiostation(9);

        int expected = 1;
        int actual = radio.nextRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeHighTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseLowVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 9;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}
