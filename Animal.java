package Zadanie6;

public abstract class Animal {
    private String name;
    private int doRun;
    private int doSwim;
    private final String typeAnimal;

    public Animal(String name, int doRun, int doSwim, String typeAnimal) {
        this.name = name;
        this.doRun = doRun;
        this.doSwim = doSwim;
        this.typeAnimal = typeAnimal;
    }

    //public Animal() {
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoRun() {
        return doRun;
    }

    public void setDoRun(int doRun) {
        this.doRun = doRun;
    }

    public int getDoSwim() {
        return doSwim;
    }

    public void setDoSwim(int doSwim) {
        this.doSwim = doSwim;
    }

    public void printInfo() {
        System.out.printf("%s %s должен пробежать %s, должен проплыть %s%n", typeAnimal, name, doRun, doSwim);
    }

    public abstract void Animalcounting();
}
