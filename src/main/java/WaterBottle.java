public class WaterBottle {
    private int volume = 100;

    public WaterBottle() {
        this.volume = volume;
    }

    public int getVolume() { return volume;}

    public void drink() {
        volume -= 10;
    }

    public void empty() {
        volume = 0;
    }

    public void fill() {
        volume = 100;
    }
}
