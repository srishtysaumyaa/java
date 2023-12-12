public class prefixsubarray {
    public static void printsubaaray(int number[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]= new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]= prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=i;
        for(int j=i;j<number.length;j++){
            int end=j;
            currsum= start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
            if(currsum>max){
                max=currsum;
            }
            }
        }
    System.out.println("max sum is =" +max);
    }
    public static void main(String[] args) {
        int number[] ={2,4,6,8,10};
        printsubaaray(number);
    }
}
