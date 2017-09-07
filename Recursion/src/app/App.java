package app;

import presentation.Presentation;

public class App {

    public static void main(String[] args){

        Presentation pres = new Presentation();
        try {
            pres.presentation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
