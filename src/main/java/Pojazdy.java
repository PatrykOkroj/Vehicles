
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class Pojazdy {

    private String vehicle1, vehicle2;
    private int maxSpeed1, maxSpeed2;
    static Map<String, Integer> car = new HashMap<String, Integer>();
    static Logger logger = LogManager.getLogger(Main.class);

    public static void addCars(){
        String vehicle1 = "BMW", vehicle2 = "Audi";
        int maxSpeed1 = 210, maxSpeed2 = 180;
        car.put(vehicle1, maxSpeed1);
        car.put(vehicle2, maxSpeed2);
        logger.info("Cars: " + car);

        if(maxSpeed1 > maxSpeed2){
            logger.info("Samochod producenta " + vehicle1 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed1);
        } else if(maxSpeed2 > maxSpeed1){
            logger.info("Samochod producenta " + vehicle2 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed2);
        } else
            logger.info("Predkość maksymalna obu samochodow jest rowna");

    }
    public static void addShips(){
        Map<String, Integer> ship = new HashMap<String, Integer>();
        String vehicle1 = "Caroline", vehicle2 = "Maria";
        int maxSpeed1 = 30, maxSpeed2 = 50;
        ship.put(vehicle1, maxSpeed1);
        ship.put(vehicle2, maxSpeed2);
        logger.info("Ships: " + ship);

        if(maxSpeed1 > maxSpeed2){
            logger.info("Pojazd producenta " + vehicle1 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed1);
        } else if(maxSpeed2 > maxSpeed1){
            logger.info("Pojazd producenta " + vehicle2 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed2);
        } else
            logger.info("Predkość maksymalna obu pojazdow jest rowna");
    }
    public static void addPlanes(){
        Map<String, Integer> plane = new HashMap<String, Integer>();
        String vehicle1 = "Boeing", vehicle2 = "Airbus";
        int maxSpeed1 = 900, maxSpeed2 = 980;
        plane.put(vehicle1, maxSpeed1);
        plane.put(vehicle2, maxSpeed2);
        logger.info("Planes: " + plane);

        if(maxSpeed1 > maxSpeed2){
            logger.info("Pojazd producenta " + vehicle1 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed1);
        } else if(maxSpeed2 > maxSpeed1){
            logger.info("Pojazd producenta " + vehicle2 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed2);
        } else
            logger.info("Predkość maksymalna obu pojazdow jest rowna");
    }

    public static void addBicycles(){
        Map<String, Integer> bicycle = new HashMap<String, Integer>();
        String vehicle1 = "Eurobike", vehicle2 = "Folta";
        int maxSpeed1 = 30, maxSpeed2 = 40;
        bicycle.put(vehicle1, maxSpeed1);
        bicycle.put(vehicle2, maxSpeed2);
        logger.info("Bicycles: " + bicycle);

        if(maxSpeed1 > maxSpeed2){
            logger.info("Pojazd producenta " + vehicle1 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed1);
        } else if(maxSpeed2 > maxSpeed1){
            logger.info("Pojazd producenta " + vehicle2 + " jest najszybszy - jego maksymalna predkosc to: " + maxSpeed2);
        } else
            logger.info("Predkość maksymalna obu pojazdow jest rowna");
    }

    public static void displayAll(){
        addCars();
        addShips();
        addPlanes();
        addBicycles();
    }
}
