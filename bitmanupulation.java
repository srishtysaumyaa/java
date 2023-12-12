import java.util.Scanner;

public class bitmanupulation {
    public static void oddeven(int n){
        int bitMask =1;
        if((n & bitMask) == 0){  //even number
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static int getIthbit(int n,int i){
        int bitMask =1 <<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else {
            return 1;
        }
        
    }
        public static int setIthbit(int n,int i){
            int bitMask =1<<i;
            return n|bitMask;
        }

  public static int clearIthbit(int n,int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
  }
  public static int clearlastithbits(int n ,int i){
    int bitmask = (~0)<<i;
    return n&bitmask;

  }
  public static int clearrangeofithbits(int n,int i , int j){
    int b= (~0)<<j+1;
    int a = (1<<i)-1;
    int bitmask = a|b;
    return n&bitmask;
  }
  public static boolean ischeckpoweroftwo(int n){
    return (n&(n-1)) ==0;
  }

  public static int countsetbits(int n){
    int count=0;
    while(n>0){
        if((n&1) != 0 ){
            count++;
        }
        n=n>>1;
    }
    return count;
}

public static int fastexp(int a,int n){
    int ans=1;
    while(n>0){
        if((n&1) !=0){
            ans = ans *a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   // System.out.println(20>>2);
 //System.out.println(getIthbit(10, 2));
//System.out.println(setIthbit(10, 2));
//System.out.println(clearIthbit(10, 2));
//System.out.print(clearlastithbits(15, 2));
//System.out.println(clearrangeofithbits(10, 2, 4));
//System.out.println(ischeckpoweroftwo(64));
//System.out.println(countsetbits(16));
System.out.println(fastexp(3, 5));
}    
}
