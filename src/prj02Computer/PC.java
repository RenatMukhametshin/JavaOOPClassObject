package prj02Computer;

public class PC {
    public CPU cpu;
    public Ram ram;
    public Hdd hdd;

    public PC(CPU cpu, Ram ram, Hdd hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return cpu + "\n" + ram + "\n" + hdd;
    }
}
