import java.util.Random;

public class Main {
    public static void main(String[] args){

        HashMap<Integer,Integer> hm = new HashMap<>(20);
        int n;
        Random rand = new Random();
        //

        for(int i = 0; i < 20; i++){
            n = rand.nextInt(100) + 10;
            hm.put(n,n);
        }


        System.out.println("La tabla hash contiene " + hm.isEmpty() + " elementos");

        HashMapL<Integer,Integer> hml = new HashMapL<>(10);
    }
}
