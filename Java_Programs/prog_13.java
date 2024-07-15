//GCD OR HCF of two natural numbers
import java.util.Scanner;
class prog_13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int l,hcf=1;
        if(n1>n2){
            l=n1;
        }
        else{
            l=n2;
        }
        for(int i=l/2;i>=2;i--){
            if(n1%i==0 && n2%i==0){
                hcf=i;
                break;
            }
        }
        System.out.println(hcf);
        
    }
}