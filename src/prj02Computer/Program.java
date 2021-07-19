package prj02Computer;

public class Program {
    public static void main(String[] args) {
        PC pc1 = new PC(new CPU("Intel", 3, 4), new Ram("Kingstone", 16, "DDR4"), new Hdd("Seagete", 2000));
        PC pc2 = new PC(new CPU("Amd", 4, 8), new Ram("AData", 32, "DDR3"), new Hdd("Fujitsu", 3000));

        System.out.println("PC1:");
        System.out.println(pc1);

        System.out.println("==================");

        System.out.println("PC2:");
        System.out.println(pc2);

    }
}
