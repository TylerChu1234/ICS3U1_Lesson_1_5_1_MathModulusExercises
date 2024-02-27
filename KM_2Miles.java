 class KM_2Miles extends ConsoleProgram {

/**
*A program that asks the user fora  number in kilometers and then converts it to miles
* @author: T.Chu
*/





public void run() {

    //setting variables
    double dblKilometers;
    double dblMiles;

    //asking for the amount of kilometers
    dblKilometers = readDouble ("Enter the amount of kilometers: ");


    //calculating kilometers to miles
    dblMiles = (dblKilometers * 0.621371);
    
    //printing result
    System.out.println (dblKilometers  + " in miles is " + dblMiles + " miles.");







    }

}