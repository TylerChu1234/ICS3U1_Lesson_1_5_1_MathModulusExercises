class Hours extends ConsoleProgram {

  /**
  * A program that asks the user for a number of hours and converts it into days and hours left over
  * @author:T.Chu
  */
  
  public void run() {
  
    
  //setting variables
  double dblHours;
  double dblDays;
  double dblMins;



  //asking for the hours
  dblHours = readDouble("enter the number of hours: ");


  //calculating the day value and hours left over
  dblDays = dblHours / 24;

  dblMins = dblHours % 24;
  //printing results
  System.out.println(dblHours + " = " + dblDays + " days and " + dblMins + " hours");
    
  }
}