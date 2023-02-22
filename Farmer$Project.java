import java.util.*;
class Farmerr{
    static float ri;
    static{ri=8.5f;}
   // float ri=8.5f;
int pa;float td;float si;float amt;


    void input(){
        Scanner scan =new Scanner(System.in);
        System.out.println("please mention the principal required");
         pa=scan.nextInt();
        System.out.println("please mention the time duration");
         td=scan.nextInt();
        


    }void compute(){
        si=(pa*td*ri)/100;
        amt=si+pa;

        

    
    }void display(){
        System.out.println("si is="+si);
        System.out.println("amount is="+amt);

    }public class FarmerProject{
        public static void main(String args []){
            Farmerr f1= new Farmerr();
            Farmerr f2= new Farmerr();
            f1.input();
            f1.compute();
            f1.display();
            f2.input();
            f2.compute();
            f2.display();
           // scan.close();


        }
    }
}