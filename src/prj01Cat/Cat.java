package prj01Cat;

public class Cat
{
    public static int count;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;
    public static final int eyes = 4;

    private double originWeight;
    private double weight;

    private double foodEaten;
    private boolean flagDeath;
    private Color color;

    public Cat(Color color)
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        foodEaten = 0.0;
        flagDeath = false;
        this.color = color;
        count++;
    }

    public static int getCount()
    {
        return count;
    }

    public Color getColor(){
        return color;
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
        if(weight <MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
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
            if(!flagDeath){
                flagDeath = true;
                count--;
            }
            return false;
        } else {
            return true;
        }
    }
}