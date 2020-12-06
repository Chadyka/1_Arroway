package yoda;

public class Main {

    public static void main(String[] args) {
        
        String myString = null;

        /*
        *   Az első esetben nem használjuk a yoda
        *   conditions-t, az equals ezesetben hamis lesz
        *   és az else ág lefut
        */

        if ("yoda".equals(myString)) {
            System.out.println("exception is thrown is it not?");
        } else {
            System.out.println("exception it is not");
        }

        /*
        *    Amennyiben null az érték amivel szemben tesztelünk
        *    ebben az esetben exceptiont kapunk
        *    ahelyett, hogy szimplán hamist adna vissza
        *    emiatt megúszhatunk egy NullPtr exception-t később
        */
        if (myString.equals("yoda")) {
            System.out.println("exception is thrown is it not?");
        } else {
            System.out.println("exception it is not");
        }
    }
}
