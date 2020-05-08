package app.fachinformatiker;

import app.fachinformatiker.Utility.Debug;
import app.fachinformatiker.Utility.FileHandler;
import app.fachinformatiker.constants.constants;
import app.fachinformatiker.Model.Fiboloop;

public class fibonacciJ {

    public static void main(String[] args){

        Fiboloop fiboloop = new Fiboloop();
        fiboloop.initialize();
        Debug.setDebug(false);
        Debug.setLog(true);

        if (args.length == 0) {
            Fiboloop.MENU = true;
        }

        if (!Fiboloop.MENU) {
            try {
                Fiboloop.ARG = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException nfe) {
                Debug.inform(constants.NFE_ERROR);
                //FileHandler.writeToFile(constants.NFE_ERROR);
                Fiboloop.ERROR = true;
                System.exit(1);
            }

            if (Fiboloop.ARG < 0) {
                Debug.inform(constants.ENTER_POSITIVE_NUMBER);
                //FileHandler.writeToFile(constants.ENTER_POSITIVE_NUMBER);
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
