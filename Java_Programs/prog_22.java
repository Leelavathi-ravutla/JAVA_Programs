//maximum value from an array
import java.util.Scanner;
class prog_22{
    public static int max_value(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println(max_value(a1));

    }
}