public class KalleA {
    public static void main(String[] args){
        int age = 30;
        int dagar = 165;
        float realAge = (float) dagar / 365 + age;
        String name = "Kalle Anka";
        String adress = "Ankeborg";
        System.out.println(name + " bor i " + adress + " och är " + age + " år och " + dagar + " dagar gammal. Detta motsvarar " + realAge + "år");
    }
}
