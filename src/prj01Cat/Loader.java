package prj01Cat;

public class Loader {
    public static void main(String[] args) {

        Cat cat1 = new Cat(Color.BROWN, 1750.0);
        Cat cat2 = new Cat(Color.RED, 1230.0);
        Cat cat3 = new Cat(Color.BLACK, 1057.0);

        System.out.println("Count cats : " + Cat.getCount());

        System.out.println("Cat1");
        System.out.println("Weight : " + cat1.getWeight());
        System.out.println("Status : " + cat1.getStatus());
        cat1.meow();
        System.out.println("Weight : " + cat1.getWeight());
        cat1.drink(3.0);
        System.out.println("Weight : " + cat1.getWeight());

        System.out.println();
        System.out.println("Cat2 weight :" + cat2.getWeight());
        int countFeed = 0;
        while (!cat2.getStatus().equals("Exploded")) {
            cat2.feed(1.0);
            countFeed++;
        }
        System.out.println("Cat2 " + cat2.getStatus() + " after " + countFeed + " feeds.");

        System.out.println();
        System.out.println("Cat3 weight :" + cat3.getWeight());
        int countMeow = 0;
        while (!cat3.getStatus().equals("Dead")) {
            cat3.meow();
            countMeow++;
        }
        System.out.println("\nCat3 " + cat3.getStatus() + " after " + countMeow + " meows.");

        cat1.feed(150.0);
        cat2.feed(120.0);
        cat3.feed(110.0);

        cat1.pee();
        cat2.pee();
        cat3.pee();

        System.out.println("Cat 1 eaten: " + cat1.getFoodEaten());
        System.out.println("Cat 2 eaten: " + cat2.getFoodEaten());
        System.out.println("Cat 3 eaten: " + cat3.getFoodEaten());

        System.out.println("Cat 1 color: " + cat1.getColor());
        System.out.println("Cat 2 color: " + cat2.getColor());
        System.out.println("Cat 3 color: " + cat3.getColor());

        System.out.println("Count cats : " + Cat.getCount());

        Cat kitten1 = getKitten(Color.WHITE);
        Cat kitten2 = getKitten(Color.GRAY);
        Cat kitten3 = getKitten(Color.RED);
        System.out.println("Kitten 1: " + kitten1.getColor() + " " + kitten1.getWeight() + " " + kitten1.getStatus() + " " + kitten1.getOriginWeight());
        kitten1.setColor(Color.BLACK);
        System.out.println("Kitten 1: " + kitten1.getColor() + " " + kitten1.getWeight() + " " + kitten1.getStatus() + " " + kitten1.getOriginWeight());
        System.out.println("Kitten 2: " + kitten2.getColor() + " " + kitten2.getWeight() + " " + kitten2.getStatus() + " " + kitten2.getOriginWeight());
        System.out.println("Kitten 3: " + kitten3.getColor() + " " + kitten3.getWeight() + " " + kitten3.getStatus() + " " + kitten3.getOriginWeight());

        System.out.println();
        System.out.println("Test copy objects");
        Cat cat10 = new Cat(Color.RED, 1300);
        cat10.setName("Maxik");
        System.out.println(cat10);
        Cat cat10Copy = cat10.getCopyCat();
        cat10Copy.setName("Maxik copy");
        System.out.println(cat10Copy);
        System.out.println("set Black color to cat 10");
        cat10.setColor(Color.BLACK);
        System.out.println(cat10);
        System.out.println(cat10Copy);

        System.out.println(cat1);
        Cat cat1Copy = cat1.getCopyCat();
        System.out.println(cat1Copy);



    }
    public static Cat getKitten(Color color){
        return new Cat(color, 1100.0);
    }
}