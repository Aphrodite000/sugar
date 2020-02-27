import java.util.Arrays;
import java.util.Scanner;

//输入数字A-B,B-C,A+B,B+C，空格分开，
// 求A,B,C，空格分开，最多只有一组A,B,C满足题目所有要求
public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        String[] a=string.split(" ");
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            //该方法是字符串数组转数字，String转int
            b[i]=Integer.parseInt(a[i]);
        }
        float A=(b[0]+b[2])/2;
        float B=(b[1]+b[3])/2;
        float C=b[3]-B;
        if(A<0||B<0||C<0){
            System.out.println("No");
        }else {
            if(A-B==b[0]&&B-C==b[1]&&A+B==b[2]&&B+C==b[3]){
                System.out.println((int) A + " " + (int) B + " " + (int) C);
            }
        }
        }
}
