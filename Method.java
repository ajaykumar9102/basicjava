class Element{
    static int add(int num []){int count =0;
        int sum=0;
        for(int n:num){count++;
            sum +=n;

        }//System.out.println(count);
       // System.out.println(sum);
      // return sum;
      return count;
       
       

    }
}
public class Method {
    public static void main(String args[]){
        int result=Element.add(new int [] {1,3,4,6,7,5});
        System.out.println(result);

    }
    
}
