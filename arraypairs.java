public class arraypairs {
    public static void printpairs(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int current=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+number[i]+ "," +number[j]+")"+" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =" +tp);
    }
    public static void main(String[] args) {
        int number[]={2,4,5,7,8};
        printpairs(number);
    }
}
