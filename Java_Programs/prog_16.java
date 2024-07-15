import java.util.Scanner;
class prog_16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,r;
        for(int i=n;i!=0;i=i/10){
        //while(n!=0){
            r=i%10;
            if(r>max){
                max=r;
            }
        }
        System.out.println(max);
    }
}