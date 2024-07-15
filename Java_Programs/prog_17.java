// ZigZag number ----> It takes one by one digit from left to right
// alternately takes digit from right to left in another number
// n1=743, n2=953  zigzag_no=734539
/*public static int length(int numb){
    int len=0,rev=0;
    while(numb!=0){
        rev=numb%10;
        if(rev!=0){
            len++;
        }
        numb=numb/10;
    }
    return len;
}*/
import java.util.Scanner;
class prog_17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n=0,r;
        //if(length(n1)==length(n2)){
            for(int i=n1;i!=0;i=i/10){
                r=i%10;
                n=n*10+r;
            }
            int num=0,r1,r2;
            while(n!=0 && n2!=0){
                r1=n%10;
                r2=n2%10;
                num=num*10+r1;
                num=num*10+r2;
                n=n/10;
                n2=n2/10;
            }
            System.out.println(num);
        //}
        /*else{
            System.out.println("Invalid");
        }*/
    }
}