public class Radio {
    private int radiostation;

    public int setRadiostation(int newRadiostation) {
        if (newRadiostation < 1) {
            return radiostation = 1;
        }
        if (newRadiostation > 9) {
            return radiostation = 9;
        }
        return radiostation = newRadiostation;
    }

    public int nextRadiostation() {
        if (radiostation >= 9) {
            return radiostation = 1;
        } else {
            return radiostation = radiostation + 1;
        }
    }

    public int prevRadiostation() {
        if (radiostation <= 1) {
            return radiostation = 9;
        } else {
            return radiostation = radiostation - 1;
        }
    }

    private int currentVolume;

    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 10) {
            return currentVolume = 10;
        }
        if (newCurrentVolume <= 0) {
            return currentVolume = 0;
        }
        return currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            return currentVolume = currentVolume + 1;
        } else {
            return currentVolume = 10;
        }
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            return currentVolume = currentVolume - 1;
        } else {
            return currentVolume = 0;
        }
    }
}
