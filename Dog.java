package Zadanie6;

public class Dog extends Animal {

    private int runDog;
    private int swimDog;

    public Dog(String name, int doRun, int doSwim, int runDog, int swimDog) {
        super(name, doRun, doSwim, "собака");
        this.runDog = 500;
        this.swimDog = 10;
    }

    public int getRunDog() {
        return runDog;
    }

    public void setRunDog(int runDog) {
        this.runDog = runDog;
    }

    public int getSwimDog() {
        return swimDog;
    }

    public void setSwimDog(int swimDog) {
        this.swimDog = swimDog;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("пробежал %s, проплыл %s%n", runDog, swimDog);
    }

    @Override
    public void Animalcounting() {
        System.out.printf("в дистанциях бег и плавание учавствуют: %s%n", getName());

    }
}
