import java.util.*;
public class ClassMarksP{



    public static void main(String args []){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("enter total student");
        int student=scan.nextInt();
    int array []=new int[student];
        for(int i=0;i<student;i++){
            System.out.println("enter marks of each student ");
            array[i]=scan.nextInt();

        }System.out.println("each student get some marks which are");
        for(int j=0;j<student;j++){
            System.out.print(array[j]);
        }
    
      
}}