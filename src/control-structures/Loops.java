public class Loops {
    public static void main(String[] args) {
        System.out.println("+-+-+-+");
        System.out.println("+-+-+-+");
        System.out.println("+-+-+-+");
        System.out.println("+-+-+-+");

        System.out.println("there's another way...");

        for(int i = 0; i <= 3; i++) {
            System.out.println("+-+-+-+");
        }

        // print a grid
        for (int i=0; i<=3; i++) {
            System.out.println("+---+---+---+");
            if (i < 3) {
                System.out.println("|---|---|---|");
            }
        }

        // nested loops
        for (int i = 0; i <= 2; i++) {
            System.out.println("Outer i = " + i);
            for (int j = 0; j <= 3; j++) {
                System.out.println("  Inner j = " + j);
            }
        }

        // prints matrix
        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= 4; col++) {
                if (row == col) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // while loop
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
