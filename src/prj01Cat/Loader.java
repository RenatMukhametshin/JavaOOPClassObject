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
        System.out.println("Cat3 " + cat3.getStatus() + " after " + countMeow + " meows.");

        Cat cat = new Cat();
        System.out.println(cat.getStatus());

    }
}