import java.util.Scanner;
class prog_11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=1;
        for(int i=2;i<=a;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}