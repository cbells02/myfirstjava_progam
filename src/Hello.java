public class Hello {
    String name;
    int age;

    public Hello(String name1, int ageNum){
        age = ageNum;
        name = name1;



    }


    public static void main (String[] args){

        System.out.println("Hello World");
        System.out.println("Why is this so hard");
        System.out.println("I will be a programmer");
        System.out.println("this is gonna be good");

        int age = 35;
        System.out.println(age);

        String name = "yo";
        System.out.println(name);

        Hello Student1 = new Hello("Charles", 55);
        System.out.println(Student1.age);


    }
}
