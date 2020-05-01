public class fibonacciJ {
    public static void main(String[] args){

        int arg = 0;
        int m = 1;
        int n = 1;
        int fibonacci = 0;
        int temp = 0;
        boolean error = false;
        boolean menu = false;

        if (args.length == 0) {
            menu = true;
        }

        if (!menu) {
            try {
                arg = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException nfe) {
                System.out.println("The first argument must be an integer.");
                error = true;
                System.exit(1);
            }

            if (arg < 0) {
                System.out.println("Please enter a positive number");
                error = true;
                System.exit(1);
            }
        }

        if (!error && !menu) {
            switch (arg) {
                case 1:
                    fibonacci = m;
                    System.out.println("The fibonacci number at position " + arg + " is: " + fibonacci);
                    break;
                case 2:
                    fibonacci = n;
                    System.out.println("The fibonacci number at position " + arg + " is: " + fibonacci);
                    break;
                default:
                    for (int i = 3; i <= arg; i++) {
                        fibonacci = m + n;
                        m = n;
                        n = fibonacci;
                    }
                    System.out.println("The fibonacci number at position " + arg + " is: " + fibonacci);
            }
        }

        if (menu) {
            System.out.println("Menu");
        }
    }
}
