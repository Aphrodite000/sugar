import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        String[] a=string.split(" ");
        int [] b=new int[a.length];
        for(int i=0;i<=a.length-1;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        Arrays.sort(b);
        int mid=(b.length-1)/2;
        System.out.println(b[mid]);
    }
}
