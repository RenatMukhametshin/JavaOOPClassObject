package prj01Cat;

public class Cat
{
    public static int count;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;
    public static final int eyes = 4;

    private String name;

    private double originWeight;
    private double weight;

    private double foodEaten;
    private boolean flagDeath;
    private Color color;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        foodEaten = 0.0;
        flagDeath = false;
        name = "murka";
        count++;
    }

    public Cat(Color color, double weight){
        this();
        this.weight = weight;
        originWeight = weight;
        this.color = color;
    }

    public Cat getCopyCat(){
        Cat copy = new Cat();
        copy.setFlagDeath(this.isFlagDeath());
        copy.setName(this.getName());
        copy.setFoodEaten(this.getFoodEaten());
        copy.setWeight(this.getWeight());
        copy.setOriginWeight(this.getOriginWeight());
        copy.setColor(this.getColor());
        return copy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFoodEaten(double foodEaten) {
        this.foodEaten = foodEaten;
    }

    public void setFlagDeath(boolean flagDeath) {
        this.flagDeath = flagDeath;
    }

    public static int getCount()
    {
        return count;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
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

    public boolean isFlagDeath() {
        return flagDeath;
    }

    public String getName() {
        return name;
    }

    public double getOriginWeight()
    {
        return originWeight;
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

    @Override
    public String toString() {
        String catToStr = "";
        catToStr += "name = " + this.getName();
        catToStr += " / weight = " + this.getWeight();
        catToStr += " / originWeight = " + this.getOriginWeight();
        catToStr += " / flagDeath = " + this.isFlagDeath();
        catToStr += "/ foodEaten = " + this.getFoodEaten();
        catToStr += "/ color = " + this.getColor();
        return catToStr;
    }
}