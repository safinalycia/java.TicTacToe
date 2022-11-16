package Zadanie5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", "director", "alex@mail.ru", 1818, 1000, 40);
        Employee employee2 = new Employee("Nick", "worker", "nick@mail.ru", 1819, 500, 35);
        Employee employee3 = new Employee("Maria Ivanova", "worker", "maria@mail.ru", 1820, 500, 30);
        Employee employee4 = new Employee("Boris", "master", "boris@mail.ru", 1821, 800, 45);
        Employee employee5 = new Employee("Viki Sidorova", "worker", "viki@mail.ru", 1822, 500, 25);

        //employee1.setSalary(1200);
        //employee3.setnSnLn("Maria Shwarts"); //вышла замуж, сменила фамилию
        //employee5.setSalary(550);
        //employee1.setAge(50);




        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
        employee4.printInfo();
        employee5.printInfo();
    }



    }

