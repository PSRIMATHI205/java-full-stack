import java.util.Scanner;//armstrong
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dup=n;
        int sum=0;
        while(dup!=0){
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,3);
            dup=dup/10;

        }
        if(sum==n){
            System.out.println("The given number is armstrong");
        }
        else{
            System.out.println("The given number is not armstrong");
        }
    }
    
}
