package Lesson10;

public class Constructor {

    private String name ;
    private String surName ;

    private Integer age ;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Constructor () {

        System.out.println(" Parametrsiz constructor ishe dusdu");

    }


    public Constructor (String name ) {

        System.out.println("1 parametrli constructor ishe dushdu");
    }

    public Constructor(String name, String surName, Integer age) {
        this.name = name;
        this.surName = surName;
        this.age = age;

        System.out.println("All args constructor ishe dusdhu");
    }

    public String getName() {
        return name;
    }



    public String getSurName() {
        return surName;
    }




    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}

