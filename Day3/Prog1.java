// public class Prog1{//Swapping
//     public static void main(String[] args) {
//         int a=20;
//         int b=30;
//         int temp=0;
//         temp=a;
//         a=b;
//         b=temp;
//         System.out.println("a value:"+a +" b value:"+b);
//     }
// }
public class Prog1{
    public static void main(String[] args) {
        int temp=0;
        int a=20;
        int b=30;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value:" +a +" b value:"+b);
    }
}