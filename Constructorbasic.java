class Student{
    private int age;
    private String name;
    Student (int age,String name){//construvctor with non-zero parametrized.
        this.name=name;
        this.age=age;
    }void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Constructorbasic {
    public static void main(String args []){
        Student st=new Student(18,"ajay");//we initialise the value of instance varible 
                                                         //  at a time of object creation.//
        st.display();

    }
}