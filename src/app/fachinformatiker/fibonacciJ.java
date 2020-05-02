package app.fachinformatiker;

import app.fachinformatiker.Utility.Debug;
import app.fachinformatiker.constants.constants;
import app.fachinformatiker.Model.Fiboloop;

public class fibonacciJ {

    public static void main(String[] args){

        Fiboloop fiboloop = new Fiboloop();
        fiboloop.initialize();
        Debug.setDebug(true);

        if (args.length == 0) {
            Fiboloop.MENU = true;
        }

        if (!Fiboloop.MENU) {
            try {
                Fiboloop.ARG = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException nfe) {
                System.out.println(constants.NFE_ERROR);
                Fiboloop.ERROR = true;
                System.exit(1);
            }

            if (Fiboloop.ARG < 0) {
                System.out.println(constants.ENTER_POSITIVE_NUMBER);
                Fiboloop.ERROR = true;
                System.exit(1);
            }
        }

        if (!Fiboloop.ERROR && !Fiboloop.MENU) {
            fiboloop.startFibonacci(Fiboloop.ARG);
        }

        if (Fiboloop.MENU) {
            fiboloop.showMenu();
        }
    }
}