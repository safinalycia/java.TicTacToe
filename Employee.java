package Zadanie5;

public class Employee {
    private String nSnLn;
    private String jobTitle;
    private String email;
    private int telNumber;
    private int salary;
    private int age;

    public Employee(String nSnLn, String jobTitle, String email, int telNumber, int salary, int age) {
        setnSnLn(nSnLn);
        this.jobTitle = jobTitle;
        this.email = email;
        this.telNumber = telNumber;
        setSalary(salary);
        setAge(age);


    }

    public Employee(String nSnLn) {
        this(nSnLn, "director", "alex@mail.ru", 1818, 1000, 40);
    }

    public Employee() {
        this("Alex");
    }

    //public Employee() { //пустой конструктор должен быть всегда

    //}

    //public Employee(String nSnLn) {
        //this.nSnLn = nSnLn;
    //}


     public void printInfo() {
        System.out.println(String.format("ФИО: %s Должность: %s email: %s номер телефона: %d зарплата: %d возраст: %d ", nSnLn, jobTitle, email, telNumber, salary, age));
    }


    //методы access, методы доступа getter/setter




    public void setnSnLn(String nSnLn) {
        this.nSnLn = nSnLn;
    }

    public String getnSnLn() {
        return nSnLn;
    }

    public String getJobTitle() {
        return jobTitle;
    }


    public String getEmail() {
        return email;
    }


    public int getTelNumber() {
        return telNumber;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
