import java.util.Scanner;
//import java.util.math;
class prog_20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            //System.out.println(a[i]);\
        }
        for(int i=0;i<n;i++){
            //a[i]=sc.nextInt();
            System.out.println(a[i]);\
        }

        /*int[] a={10,20,30};
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        
    }
}