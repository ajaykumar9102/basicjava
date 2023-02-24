public class IncrementDecrement {
    public static void main(String args[]){
        int a=5;
        int b=(a++)+(++a)+(++a)+(a++)+(--a)+(--a);//a++ means first use then increment.
                                                  //++a means first increment then use.
        System.out.println(b);
    }
}
