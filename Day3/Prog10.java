import java.util.Arrays;
public class Prog10 {
    public static void main(String[] args) {
        int a[]={2,3,7,6,8,5};
        Arrays.sort(a);
        boolean isFound=false;
        int k=8;
        int low=0,high =a.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            
            if(a[mid]==k){
                isFound=true;
                break;
            }
            else if(a[mid]<k){
                low=mid+1;
            }

            else{
                high=mid-1;
            }
        }
        if(isFound){
            System.out.println(mid);
        }

    }
    
}
