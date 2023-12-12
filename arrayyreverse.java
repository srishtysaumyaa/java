public class arrayyreverse{
    public static void reverse(int number[]){
        int start=0,end=number.length-1;
        while(start<end){
            int temp;
            temp=number[start];
           number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,5,8,10};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+ " ");
        }
    }
}