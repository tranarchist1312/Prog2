public class randarray {
    public static void main(String[] args){

        int[] randoms = new int[1000];
        int rand = 0;
        int[] Occs = new int[1000];

        for(int i=0;i<1000;i++){
            rand = (int)(Math.random() * 999);
            randoms[i] = rand;
            Occs[i] = 0;
        }
        for(int num : randoms){
           Occs[num]++;
        }
        for(int i=0; i<1000; i++){
            if(Occs[i] == 3){
                System.out.println(i);
            }
        }
    }
}
