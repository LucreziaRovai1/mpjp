package ex;

public class S57 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {//anche se io voglio un floating point ma gli do un intero nel test, java fa un widening automatico

        return distance / time;
    }

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
        // TODO          //mi ricorda che ci sono cose da fare
        double a = (x1-x0);
        double b = (y1-y0);
        
    	return Math.sqrt(a*a) + (b*b);
    }

    /**
     * Engine capacity
     * 
     * @param bore in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
    	
        return (bore * bore * stroke * Math.PI) /1000;
    }

    // somma delle cifre in un numero
    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
        
        int counter = 0;
        value = Math.abs(value); //ho bisogno di far diventare positivo un eventuale numero negativo dato dal cliente.
      
        while (value!= 0) { //metto while perché non so quando far smettere il loop
        	counter += value %10;
        	value /= 10; //come dire value = value /10
        }
        return counter;
    }
}
