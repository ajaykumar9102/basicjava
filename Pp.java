class Studenttt{
    private int age;
    private String name;
    Studenttt (){    //non-argument constructor//
      
        this.age=15;
        this.name="ajay";
       
    }
   
    
    void display(){
        System.out.println(age);
        System.out.println(name);
    }


}
public class Pp {
    public static void main(String args[]){
        Studenttt st=new Studenttt();
        
        st.display();
        


    }}

