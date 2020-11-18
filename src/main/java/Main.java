import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    static Pojazdy p1 = new Pojazdy();
    static Scanner in = new Scanner(System.in);
    static Boolean running = true;
    static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        while (running) {
            logger.info("Type:" + "\ncars" +
                    "\nships" +
                    "\nplanes" +
                    "\nbicycles" +
                    "\nall" +
                    "\nexit");

            String answer = in.nextLine();
            switch (answer) {
                case "cars":
                    logger.info("Wybrano Samochody");
                    p1.addCars();
                    break;
                case "ships":
                    logger.info("Wybrano Statki");
                    p1.addShips();
                    break;
                case "planes":
                    logger.info("Wybrano Samoloty");
                    p1.addPlanes();
                    break;
                case "bicycles":
                    logger.info("Wybrano Rowery");
                    p1.addBicycles();
                    break;
                case "all":
                    logger.info("Pokaż wszystko");
                    p1.displayAll();
                    break;
                case "exit":
                    logger.info("Zamykanie programu");
                    System.exit(0);
                default:
                    logger.error("Podaj prawidłową opcję!");

            }
        }
    }

}
