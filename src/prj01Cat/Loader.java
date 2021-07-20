package prj01Cat;

public class Loader
{
    public static void main(String[] args)
    {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

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
        while(!cat2.getStatus().equals("Exploded")){
            cat2.feed(1.0);
            countFeed++;
        }
        System.out.println("Cat2 " + cat2.getStatus() + " after " + countFeed + " feeds.");

        System.out.println();
        System.out.println("Cat3 weight :" + cat3.getWeight());
        int countMeow = 0;
        while(!cat3.getStatus().equals("Dead")){
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

        System.out.println("Cat 1 eaten: " +cat1.getFoodEaten());
        System.out.println("Cat 2 eaten: " +cat2.getFoodEaten());
        System.out.println("Cat 3 eaten: " +cat3.getFoodEaten());

    }
}