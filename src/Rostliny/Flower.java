package Rostliny;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected boolean zavlazeno;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth, boolean zavlazeno) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
        this.zavlazeno = zavlazeno;
    }

    public double zavlazeni(){
        if (zavlazeno = true){
            return chanceOfGrowth +2;
        }else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public void setNeededArea(double neededArea) {
        this.neededArea = neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public boolean isZavlazeno() {
        return zavlazeno;
    }

    public void setZavlazeno(boolean zavlazeno) {
        this.zavlazeno = zavlazeno;
    }

    @Override
    public String toString() {
        return "Rostliny.Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
