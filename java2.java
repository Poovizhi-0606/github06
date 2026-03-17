class demo{
    public static void main (String args[]){
        for(int i=1;i<=10;i++){
        System.out.println(i);
        }
    }
}
import java.util.Scanner;
class demo{
    public static void main (String args[]){
        for(int i=5;i<=10;i++){
            System.out.println(i);
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("no.1:");
        int a=scan.nextInt();
        System.out.println("no.2:");
        int b=scan.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}

class demo{
    public static void main(String args[]){
        
    int oddcount=0;
        for(int i=1;i<=10;i++){
           // System.out.println(i);
        
        if(i % 2==0){
          // System.out.println("even number:"+i);
        }
        else{
            
            oddcount=oddcount+1;
          //  System.out.println("odd number:"+i);
            // System.out.println(oddcount);
        }
        }
        System.out.println(oddcount);

    }
}

class demo{
    public static void main(String args[]){
        System.out.println("NUmbers which are divisble by 3 and 5");
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
// }