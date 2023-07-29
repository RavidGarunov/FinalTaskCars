package OOP_Lesson_8;

public class Main {

    public static void main(String[] args) {

//        User user = new User();
//
//        user.name = "Ravid Garunov";
//
//        User user1 = new User();
//
//        user1.name = "Davud Garunov";
//
//
//        System.out.println(user.name);
//        System.out.println(user1.name);

        Encapsulation encap = new Encapsulation();

       encap.setName("Ravid");
       encap.setSurName("Garunov");
       encap.setAge(28);
        System.out.println(encap.getName());

        Encapsulation encap1 = new Encapsulation();

        encap1.setName("Davud");
        encap1.setSurName("Garunov");
        encap1.setAge(1);

        System.out.println(encap.getName());
        System.out.println(encap1.getName());


        System.out.println(encap1);
        System.out.println(encap);


}
}
