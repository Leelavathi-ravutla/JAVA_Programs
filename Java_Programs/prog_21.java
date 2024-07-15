// Print even count from an array
import java.util.Scanner;
class prog_21{
    public static int even_count(int[] n1){
        int count=0;
        for(int i=0;i<n1.length;i++){
            if(n1[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //int[] a={10,6,3,7,9,8};
        System.out.println(even_count(a));
    }
}