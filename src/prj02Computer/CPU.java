package prj02Computer;

public class CPU {
    public String model;
    public int speed;
    public int cores;

    public CPU (String model, int speed, int cores){
        this.model = model;
        this.speed = speed;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "CPU: " + model + " / " + speed + " GHz / " + cores + " cores";
    }
}
