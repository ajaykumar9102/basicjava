class Student{
    private int age;
    private String name;
    Student (int age,String name){
        this.name=name;
        this.age=age;
    }Student (){

    }
    
    
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Constructormedium {
    public static void main(String args []){
        Student st=new Student(18,"ajay");
        //Student st2=new Student();//here constructor call with zero parametrized.
      
        
        st.display();
     //st2.display();//output willl be Null and 0.//
    }
}
