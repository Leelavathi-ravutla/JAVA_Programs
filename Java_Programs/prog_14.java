// LCM of two natural numbers
import java.util.Scanner;
class prog_14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i;
        if(n1>n2){
            i=n1;
        }
        else{
            i=n2;
        }
        for(;;i++){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
            }
        }

    }
}