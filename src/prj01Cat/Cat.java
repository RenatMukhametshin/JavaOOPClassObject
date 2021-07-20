package prj01Cat;

public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double foodEaten;

    public static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodEaten = 0.0;
        count++;
    }

    public static int getCount()
    {
        return count;
    }

    public void meow()
    {
        if(isAlive()) {
            weight = weight - 1;
            System.out.print("Meow ");
        } else {
            System.out.println("Cat cannot meow - " + getStatus());
        }
    }

    public void feed(Double amount)
    {
        if(isAlive()) {
            weight = weight + amount;
            foodEaten = foodEaten + amount;
        }else{
            System.out.println("Cat cannot eat - " + getStatus());
        }
    }

    public void drink(Double amount)
    {
        if(isAlive()) {
            weight = weight + amount;
        } else {
            System.out.println("Cat cannot drink - " + getStatus());
        }
    }

    public void pee()
    {
        if(isAlive()) {
            weight = weight - 0.5; //had the toilet
            System.out.println("mmm...the cat went to the toilet.");
        } else {
            System.out.println("Cat cannot pee - " + getStatus());
        }
    }

    public double getFoodEaten(){ return foodEaten; }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public boolean isAlive()
    {
        if(this.getStatus().equals("Dead") || this.getStatus().equals("Exploded")){
            return false;
        } else {
            return true;
        }
    }
}