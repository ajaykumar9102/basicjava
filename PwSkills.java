public class PwSkills {
    

    public static void main(String arfs []){
        int n=15;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==1&&j<n/2+2||j==n/2+1&&i<n/2+2||i==n/2+1&&j<n/2+2){System.out.print("*");}
            else{
                System.out.print(" ");
            }
        } System.out.print("  ");
         for(int j=1;j<=n;j++){
            if(j==1||j==n||i+j==n+1&&i>n/2&&j<n/2+2||i==j&&i>n/2&&j>n/2){System.out.print("*");}
        else{
            System.out.print(" ");
        }
    }System.out.print("  ");
     for(int j=1;j<=n;j++){
        if(j==1&&i<n/2+2||i==1&&j<n/2+2||i==n/2+1&&j<n/2+2||j==n/2+1&&i>n/2||i==n&&j<n/2+2){System.out.print("*");}
    else{
        System.out.print(" ");
    }
}System.out.print("  ");
 for(int j=1;j<=n;j++){
    if(j==1||i+j==n/2+2||i-j==n/2){System.out.print("*");}
else{
    System.out.print(" ");
}
} System.out.print("  ");
for(int j=1;j<=n;j++){
    if(i==1||i==n||j==(n/2+1)){System.out.print("*");}
else{
    System.out.print(" ");
}
} System.out.print("  ");
for(int j=1;j<=n;j++){
    if(j==1||i==n){System.out.print("*");}
else{
    System.out.print(" ");
}
}System.out.print("  ");
for(int j=1;j<=n;j++){
    if(j==1||i==n){System.out.print("*");}
else{
    System.out.print(" ");
}
} System.out.print("  ");
for(int j=1;j<=n;j++){
    if(j==1&&i<n/2+2||i==1&&j<n/2+2||i==n/2+1&&j<n/2+2||j==n/2+1&&i>n/2||i==n&&j<n/2+2){System.out.print("*");}
else{
    System.out.print(" ");
}
}
        System.out.println();
    } }}
         

