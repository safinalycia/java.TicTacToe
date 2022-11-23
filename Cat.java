package Zadanie6;

public class Cat extends Animal {

    private int runCat;
    private int swimCat;


    public Cat(String name, int doRun, int doSwim, int runCat, int swimCat) {
        super(name, doRun, doSwim, "кошка");
        this.runCat = 200;
        this.swimCat = 0;
    }


    public int getRunCat() {
        return runCat;
    }

    public void setRunCat(int runCat) {
        this.runCat = runCat;
    }

    public int getSwimCat() {
        return swimCat;
    }

    public void setSwimCat(int swimCat) {
        this.swimCat = swimCat;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("пробежала %s и проплыла %s, не умеет плавать%n", runCat, swimCat);
    }

    @Override
    public void Animalcounting() {
        System.out.printf("в дистанциях бег и плавание учавствуют: %s%n", getName());

    }
}
