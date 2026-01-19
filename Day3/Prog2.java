public class Prog2 {// fibonacci
    public static int main(String[] args) {
        // int a=0,b=1;
        // int n=6;
        // System.out.print(a+" "+b+" ");
        // for(int i=1;i<=n;i++){
        // int c=a+b;
        // System.out.print(c+" ");
        // a=b;
        // b=c;

        // }
        int a[] = { 1, 2, 3, 1, 4, 6 };
        int n=6;
        int count=0;
        for(int i=0;i<n;i++){
            count++;
        }
        int repeat =-1;
        int missing=-1;
        for(int j=1;j<=n;j++){
            if(count==2){
                repeat=j;
            }
            else if(count==0){
                 missing=j;
            }
            if(repeat!=-1 && missing!=-1  ){
                break;
            }
        }
        return{repeat,missing};
}
