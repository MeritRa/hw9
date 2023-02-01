public class Radio {
    private int stationsCount;
    private int lastRadiostation = stationsCount - 1;
    private int radiostation = lastRadiostation;
    private int currentVolume;

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
        this.lastRadiostation = stationsCount - 1;
    }

    public Radio() {
        this.stationsCount = 10;
        this.lastRadiostation = stationsCount - 1;
    }

    public int setRadiostation(int newRadiostation) {
        if (newRadiostation <= 0) {
            return radiostation = 0;
        }
        if (newRadiostation > lastRadiostation) {
            return radiostation = lastRadiostation;
        }
        return radiostation = newRadiostation;
    }

    public int nextRadiostation() {
        if (radiostation >= lastRadiostation) {
            return radiostation = 0;
        }
        return radiostation = radiostation + 1;
    }

    public int prevRadiostation() {
        if (radiostation <= 0) {
            return radiostation = lastRadiostation;
        }
        return radiostation = radiostation - 1;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 100) {
            return currentVolume = 100;
        }
        if (newCurrentVolume <= 0) {
            return currentVolume = 0;
        }
        return currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            return currentVolume = currentVolume + 1;
        }
        return currentVolume = 100;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            return currentVolume = currentVolume - 1;
        }
        return currentVolume = 0;
    }
}
