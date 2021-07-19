package prj02Computer;

public class Hdd {
    public String model;
    public int size;

    public Hdd(String model, int size){
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hdd: " + model + " / " + size + " GBs";
    }
}
