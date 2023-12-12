import java.util.*;
public class arraylist {
    public static boolean pairsum(ArrayList<Integer> list,int target){
        int lpp=0; // 2 PINTER APPROACH
        int rpp=list.size()-1;
        while(lpp<rpp){
            if(list.get(lpp)+list.get(rpp) == target){
                return true;
            }
            if(list.get(lpp)+list.get(rpp) < target){
                lpp++;
            }
            if(list.get(lpp)+list.get(rpp) > target){
                rpp--;
            }
        }
        return false;
      
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
   int temp = list.get(idx1);
   list.set(idx1, list.get(idx2));
   list.set(idx2, temp);
   for(int i =0;i<list.size();i++){
    System.out.print(list.get(i)+" ");

}

    }
    public static int storewater(ArrayList<Integer> height){
        // brute force 0(n2d )
        int max =0;
      //  for(int i =0;i<height.size();i++){
      //      for(int j =i+1;j<height.size();j++){
             //   int ht = Math.min(height.get(i),height.get(j));
              //  int width = j-i;
           //     int storrewater = ht*width;
              //  max = Math.max(max, storrewater);
         //   }
       // }
        // two pointer approach
        int maxwater =0;
        int lp=0;
        int rp = height.size()-1;
        while(lp<rp){
            int htt= Math.min(height.get(lp),height.get(rp));
            int w = rp-lp;
            int currwater =  htt*w;
            maxwater =Math.max(maxwater, currwater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
         ArrayList<Integer> list= new ArrayList<>();
  //  ArrayList<String> list1= new ArrayList<>();
  //  ArrayList<Float> list2= new ArrayList<>();
    list.add(1);
    list.add(21);
    list.add(3);
        list.add(-1);
            list.add(5);
list.add(5, 20);

  //  System.out.println(list);
    //GET OPERATION O(1);
    int element = list.get(2);
    System.out.println(element);
    // REMOVE ELEMENT 0(n)
    list.remove(3);
  // System.out.println(list);
   // list.set(2, 0);
//System.out.println(list);
//SIZE
int size = list.size();
//System.out.println(size);
//CONTAINS
//System.out.println(list.contains(2));
// PRINT ARRAYLIST
//for(int i =0;i<list.size();i++){
 //   System.out.print(list.get(i)+" ");
//}
//System.out.println();
//PRINT REVERSE
//for(int i =list.size()-1;i>= 0;i--){                                                                                                                                                                                                             
 //   System.out.print(list.get(i)+" ");}

// MAXIMUM ELEMENT
int max= Integer.MIN_VALUE;
for(int i=0;i<list.size();i++){    // 0(n)
    //if(max<list.get(i)){
      //  max = list.get(i);}
    
 //   max = Math.max(max, list.get(i));
}
//System.out.println("maximum element is  " +max);
//swap(list, 2, 3);
//SORTING
// Ascending order sort
Collections.sort(list);
//descending order sort
//Collections.sort(list, Collections.reverseOrder());
System.out.println(list);
//MULTI DIMENSIONAL ARRAYLIST
ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(); 
list3.add(12);list3.add(17);list3.add(2);
mainList.add( list3);
ArrayList<Integer> list4 = new ArrayList<>();
//list4.add(16);
//list4.add(6);
//list4.add(9);
mainList.add( list4);
for(int i=0;i<mainList.size();i++){
    ArrayList<Integer> currlist = mainList.get(i);

for(int j=0;j<currlist.size();j++){
//System.out.print(currlist.get(j)+" ");
}
//System.out.println();
}
//System.out.println(mainList);
ArrayList<Integer> height = new ArrayList<>();
// 1 8 6 2 5 4  8 3 7       
// MOST WATER FILLED INT THE CONTAINER
height.add(1);
//height.add(8);
height.add(2);
height.add(3);
height.add(4);
height.add(5);
height.add(6);
height.add(7);
height.add(8);
//System.out.println(storewater(height));
System.out.println(pairsum(height, 16));

}

    }
   