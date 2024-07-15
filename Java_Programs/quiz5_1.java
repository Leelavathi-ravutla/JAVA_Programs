//count the number of prime numbers within the range
import java.util.Scanner;
class quiz5_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=2,count=0;
        for(int i=m;i<=n;i++){
            for(int j=2;j<=n/2;j++){
                if(i%j==0){
                    d++;
                    //break;
                }
            }
            if(d==2){
                count=count+1;
                //System.out.println(n);
            }
        }
        System.out.println(count);
    }
    
}