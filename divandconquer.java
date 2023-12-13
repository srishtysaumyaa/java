public class divandconquer {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
   int mid = si+(ei-si)/2;
   mergesort(arr, si, mid); // left part
   mergesort(arr, mid+1, ei); //right part
   merge(arr, si, ei, mid);

    }
    public static void merge(int arr[],int si,int ei,int mid){
        
        int i= si;    //iteration for the left part
        int j = mid+1;  // iteration for the right part
        int k =0;      // itertaion for temp arr
        int temp[] = new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k]= arr[j];
                j++;
                k++;
            }
        }
        //LEFT PART
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //RIGHT PART
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // COPY TEMP TO ORIGINAL ARRAY
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];

        }

   }
   public static  void quicksort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
   int pividx = partition(arr,si,ei);
   quicksort(arr, si, pividx-1);
   quicksort(arr, pividx+1, ei);
   partition(arr, si, ei);

   }
   public static int partition(int arr[],int si,int ei){
    int pivot = arr[ei];
    int i =si-1;
    for(int j=si;j<ei;j++){
        if(arr[j]<pivot){
            //SWAP
            i++;
            int temp = arr[j];
            arr[j]= arr[i];
            arr[i]= temp;
        }
    }
    i++;
    int temp = pivot;
    arr[ei] =arr[i];
    arr[i]=temp;
    return i;
   }
   // ROTATED SORTED ARRAY SEARCH
    public static int search(int arr[],int target,int si,int ei){
        if(Si>ei){
            return -1;
        }
        int mid = si +(ei-si)/2;
        if(arr[mid] == target){
            return mid;
        }
        //MID ON L1
        if(arr[si]<=arr[mid]){
            //CASE A
            if(arr[si] <= target && target<=arr[mid]) {
           return search(arr, target, si, mid-1);   }
         else{
            //CASE B
            return search(arr, target, mid+1, ei);
         }
        }
        //MID ON L2
else{
    //CASE C
    if(arr[mid]<= target && target<=arr[ei]){
        return search(arr, target, mid+1, ei);
    }
    else{
        // CASE D
        return search(arr, target, si, mid-1);
    }
}
}
    public static void main(String[] args) {
        int arr[]= {4,5,6,1,2,3};
       // mergesort(arr, 0, arr.length-1);
     //  quicksort(arr, 0, arr.length-1);
    //    printarr(arr);
   int targetidx= search(arr, 6, 0, arr.length-1);
   System.out.println(targetidx);
    }
}
