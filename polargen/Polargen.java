package polargen;

public class Polargen {

    private boolean nincsTarolt;
    private double tarolt;

    public Polargen() {
        nincsTarolt = true;
    }

    public double kovetkezo() {
        if (nincsTarolt) {
            double u1, u2, v1, v2, w;
            do {
                u1 = Math.random();
                u2 = Math.random();
                v1 = 2 * u1 - 1;
                v2 = 2 * u2 - 1;
                w = v1 * v1 + v2 * v2;
            } while (w > 1);

            double r = Math.sqrt((-2 * Math.log(w)) / w);

            tarolt = r * v2;
            nincsTarolt = !nincsTarolt;

            return r * v1;
        } else {
            nincsTarolt = true;
            return tarolt;
        }
    }
}