import java.util.Random;
public class MinMaxArr {
    public static void main(String[] args){
        int[] nums = new int[10];
        int max = 0;
        int min = 100;
        Random r = new Random();

        for(int i=0; i<10; i++){
            nums[i] = r.nextInt(100);
        }

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }

        for(int num : nums){
            if(num < min){
                min = num;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
