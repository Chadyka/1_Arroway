package yoda;

public class Main {

    public static void main(String[] args) {
        
        /*
            Amennyiben null az érték amivel szemben tesztelünk
            ebben az esetben helytelenül exceptiont kapunk
            ahelyett, hogy szimplán hamist adna vissza.
        */
        String myString = null;
        if (myString.equals("yoda")) {
            System.out.println("exception is thrown is it not?");
        } else {
            System.out.println("exception it is not");
        }
    }
}
