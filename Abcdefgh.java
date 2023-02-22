public class Abcdefgh {
    
    public static void main(String arfs []){
        int n=15;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n/2+2||j-i==n/2||
                i==4&&j>5&&j<=11){System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }System.out.print("  ");
        for(int j=1;j<=15;j++){
            if(i==1&&j<n-(n/3-1)||j==1||i==n/2+1&&j<n-1||i==n&&j<n-(n/3-1)||
            j==n-1&&i>1&&i!=n/2+1&&i<n){System.out.print("*");}
        else{
            System.out.print(" ");
        }}System.out.print("  ");
        for(int j=1;j<=n;j++){
            if(i==1&&j>3||i==n&&j>3||j==1&&i>2&&i<n-1||j==2&&i==2||j==2&&i==n-1){System.out.print("*");}
        else{
            System.out.print(" ");
        }
    }System.out.print("  ");
     for(int j=1;j<=n;j++){
        if(i==1&&j<n-1||i==n&&j<n-1||j==n&&i>2&&i<n-1||j==n-1&&i==2||j==n-1&&i==n-1||j==4){System.out.print("*");}
    else{
        System.out.print(" ");
    }
     } System.out.print("  ");
      for(int j=1;j<=n;j++){
        if(i==1||i==n||i==n/2+1||j==1){System.out.print("*");}
    else{
        System.out.print(" ");
    }
    }System.out.print("   ");
    for( int j=1;j<=n;j++){
        if(j==1||i==1||i==4){System.out.print("*");}
    else{
        System.out.print(" ");
    }
     }System.out.print("  ");
    
     for(int j=1;j<=n;j++){
        if(j==1&&i>1||i==n&&j<(n/2+2)||j==n/2+1&&i>n/2||i==n/2+1&&j>n/2||
        j==n&&i>n/2){System.out.print("*");}
    else{
        System.out.print(" ");
    }
    }System.out.print("  ");
    for(int j=1;j<=n;j++){
        if(j==1||j==n||i==n/2+1){System.out.print("*");}
    else{
        System.out.print(" ");
    }
}
        System.out.println();
    } }}
        
    
   

