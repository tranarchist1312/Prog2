public class leapyear {
    public static void main(String[] args){
        int year = 9867;
        if (year % 4 == 0){
            if (year % 100 != 0){
                System.out.println("leapyear!");
            } else{
                System.out.println("not leapyear")
            }
        } else{
            System.out.println("not a leapyear");
        }
    }
}
