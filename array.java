package Zadanie5;

public class array {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Alex", "director", "alex@mail.ru", 1818, 1000, 41);
        persArray[1] = new Employee("Nick", "worker", "nick@mail.ru", 1819, 500, 35);
        persArray[2] = new Employee("Maria Ivanova", "worker", "maria@mail.ru", 1820, 500, 30);
        persArray[3] = new Employee("Boris", "master", "boris@mail.ru", 1821, 800, 45);
        persArray[4] = new Employee("Viki Sidorova", "worker", "viki@mail.ru", 1822, 500, 52);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40 ){
                System.out.println("Сотрудники старше 40 лет:\t" + "Возраст:" + persArray[i].getAge() +'\t' + "ФИО: " + persArray[i].getnSnLn() +'\t' +  "Должность:" + persArray[i].getJobTitle() + '\t' + "Эл.адрес: " + persArray[i].getEmail() + '\t' + "Номер телефона: " + persArray[i].getTelNumber()+ '\t'  + "Зарплата: " + persArray[i].getSalary());
            }


        }
    }
}