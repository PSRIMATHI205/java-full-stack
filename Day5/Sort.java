import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class Sort {
    public static void main(String[] args) {
        int a[]={0,2,1,2,0,1};
        boolean []arr=new boolean[a.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==2){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                index++;   
            }
            else if(a[i]==1){
                index++;
            }                              
            else{
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                index++;   
            }


            }
            System.out.print(Arrays.toString(a));
        }
}
