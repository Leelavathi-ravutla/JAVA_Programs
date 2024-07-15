// Symmetric Power NUmber
// Number with even number of digits & divide into two equal halfs 
// sum those two equal halfs and square the result , it should be 
// equal to original number
// 2025 -- Symmetric power number
// 2468 -- Not Symmetric
// 13123 -- Invalid 
import java.util.Scanner;
class prog_19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n,nn=n,count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        int n1=0,d,n2=0,n21=0;
        if(count%2==0){
            for(int i=1;i<=count/2;i++){
                d=nn%10;
                n21=n21*10+d;
                nn=nn/10;
            }
            n1=nn;
            //System.out.println(n1);
            int d1;
            while(n21!=0){
                d1=n21%10;
                n2=n2*10+d1;
                n21=n21/10;
            }
            //System.out.println(n2);
            int sum,result;
            sum=n1+n2;
            result=sum*sum;
            //System.out.println(result);
            if(original==result){
                System.out.println("Symmetric Power Number");
            }
            else{
                System.out.println("Not-Symmetric Power Number");
            }
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}