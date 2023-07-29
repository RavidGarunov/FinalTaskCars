package Lesson11_Inheritance;

public class Teacher extends Person {

    private Double salary ;



    public Teacher(Double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
