class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
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