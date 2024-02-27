class Minutes extends ConsoleProgram {

  /**
  * A program that asks the user for an amount of minutes, then prints the value of days, hours and remanining minutes
  * @author:T.Chu
  */
  
  public void run() {
    
    //setting variables
    int intMinutes;
    int intDays;
    int intHours;

    int intLeftOverMinutes;
    
    // Get the amount of minutes 
    intMinutes = readInt("Enter number of minutes: ");

    //calculate the days hours and remaining minutes
    intDays = intMinutes/(1440);
    intLeftOverMinutes = intMinutes % 1440;

    intHours  = intLeftOverMinutes/60;
    intLeftOverMinutes = intLeftOverMinutes % 60;
   
    // print result
    System.out.println (intDays + " day(s) " + intHours + " hour(s) " + intLeftOverMinutes + " minute(s).");
  }
}