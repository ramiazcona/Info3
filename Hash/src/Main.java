public class Main {
    public static void main(String[] args){

        HashMap<Integer,String> hm = new HashMap<>(10);

        hm.put(4,"Hola");
        hm.put(20,"Como");
        hm.put(53,"Estas?");
        hm.put(21,"Me");
        hm.put(32,"Llamo");
        hm.put(38,"Ramiro");
        hm.put(5,"Azcona");

        System.out.println("La tabla hash contiene " + hm.esVacia() + " elemntos");
    }
}
