public class Prog7 {//lcm and gcd (LCM=a*b/gcd(a,b));GCD=a|b|r and the swap b to a r to b

    public static void main(String[] args) {
        int a=12,b=18;
        int n=a*b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("gcd= "+a);
        System.out.print("Lcm= "+n/a);
    }
}