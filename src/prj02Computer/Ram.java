package prj02Computer;

public class Ram {
    public String model;
    public int size;
    public String type;

    public Ram(String model, int size, String type){
        this.model = model;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ram: " + model + " / " + size + " GBs / " + type;
    }
}
