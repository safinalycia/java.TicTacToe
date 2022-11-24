package Zadanie7;


public class Plate {
    private int food; //кол-во еде в терелке

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }



    public void decreaseFood(int n){
        food -= n;
    }

    public void increaseFood(int m){
        food += m;
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

    public void info(){
        System.out.println("в тарелке: " + getFood());
    }


}
