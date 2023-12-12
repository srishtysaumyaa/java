import java.util.*;
public class bintodecimal{
    public static void binarytodecimal(int n){
        int decimal =0;
        int pow =0;
        while(n>0){
        int lastdigit = n%10;
        decimal = decimal +(lastdigit * (int)Math.pow(2, pow));
        pow++;
       n= n/10;//number ko chota krna
        }
        System.out.print("decimal of binary number is " +decimal);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        binarytodecimal(111);
    }
}