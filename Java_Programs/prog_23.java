import java.util.Scanner;
class prog_23{
    static void frequency(int[] a){
        for(int i=0;i<a.length-1;i++){
            int count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println(a[i]+":"+count);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int[] a=new int[];
        int[] a1={10,4,10,4,5,4};
        frequency(a1);
    }
}