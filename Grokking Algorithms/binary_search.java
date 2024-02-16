
public class binary_search {
    private static Integer binarySearch(
        int []list, int item
    ){
        int low =0;
        int hight = list.length -1;
        while (low <=hight){
            int mid = (low+ hight)/2;
            int guess =list[mid];
            if(guess == item){
                return mid;
            }else if(guess < item){
                low =mid+1;
            }else{
                hight = mid-1;
            }
        }
        return null;

    }
    
}