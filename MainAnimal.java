package Zadanie6;

public class MainAnimal {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat("Чика", 1000, 1000, 200, 200);
        Dog dog = new Dog("Рекс", 1500, 1500, 500, 500);
        Cat cat1 = new Cat("Тишка", 1000, 1000, 100, 5);


        //animal.printInfo();
        //cat.printInfo();
        //dog.printInfo();

        //cat.Animalcounting();
        //dog.Animalcounting();

        Animal animals[] = {cat, dog, cat1};
        for (Animal animal : animals) {
            animal.printInfo();
            animal.Animalcounting();
            if (animal instanceof Cat cat2) {
                cat2.getRunCat();

            }
        }


    }
}
