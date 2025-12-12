public class Prog4 {
    public static void main(String[] args) {
        int year=2005;
        if(year%4==0 && year%100!=0) 
        {
            System.out.println("the given year is leap year");
        }
        else{
            System.out.println("The year is not leap year");
        }
    }
    
}
