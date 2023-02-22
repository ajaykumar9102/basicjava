public class Ajay {
    
    public static void main(String arfs []){
        int n=15;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n/2+2||j-i==n/2||i==4&&j>5&&j<=11){System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }System.out.print(" ");
         for(int j=1;j<=n;j++){
            if(j==n/2+1&&i<n/2+2||i==j&&i<n/2+2&&j<n/2+2&&i>3&&j>3){System.out.print("*");}
        else{
            System.out.print(" ");
        }
    } System.out.print(" ");
    for(int j=1;j<=n;j++){
        if(i+j==n/2+2||j-i==n/2||i==4&&j>5&&j<=11){System.out.print("*");}
    else{
        System.out.print(" ");
    }
}  System.out.print("  ");
for(int j=1;j<=n;j++){
    if(i==j&&i<n/2+2&&j<(n/2+1)||i+j==n+1&&i<n-2){System.out.print("*");}
else{
    System.out.print(" ");
}
}
        System.out.println();
    } }}
        

