public class Progm3 {
    public static void main(String[] args) {
        int n=1234;
        int count =0;
        // for(int i=n;i>0;i=i/10){
        //     count++;
        // }
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    
}
