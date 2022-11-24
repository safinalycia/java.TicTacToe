package Zadanie7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;
    public int fullness;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.fullness = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
    }



    public void info(){
        System.out.println();
    }
}
