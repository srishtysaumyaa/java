import java.util.*;
public class primeinrange{
    public static boolean isprime(int n){
        boolean isprime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime = false;
                return false;
            }
        }
        return true;
    }
    public static void primerange(int n){
        for(int i=2;i<n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        primerange(30);
        
    }
}