/**
 * Created by hipoo on 2016-04-13.
 * Refactor it to solid... and test
 */
public class Regulator {

    private static final int THERMOMETR = 0x86;
    private static final int GRZALKA = 0x87;
    private static final int ON = 0x1;
    private static final int OFF = 0x0;


    public void regulate(double minTemp, double maxTemp) throws InterruptedException {
        for (; ;) {
            while(readIn(THERMOMETR)>minTemp)
                Thread.sleep(1000);
            writeOut(GRZALKA,ON);
            while(readIn(THERMOMETR)<maxTemp)
                Thread.sleep(1000);
            writeOut(GRZALKA,OFF);
        }
    }

    private void writeOut(int grzalka, int off) {
        //steruje wyjsciem logicznym
    }

    private double readIn(int thermometr) {
        //Odczytuje fizyczny termometr
        return 10;
    }
}
