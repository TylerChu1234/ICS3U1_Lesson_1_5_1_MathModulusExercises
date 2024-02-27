class Rads extends ConsoleProgram {

  /**
  * A program that asks the user for an angle in degrees and then converts it to radians
  * @author:T.Chu
  */
  
  public void run() {
    
    // setting variables
    double dblDegrees;
    double dblRadians;
    
    // Get degrees 
    dblDegrees = readDouble("Enter the angle in degrees: ");

    // Converting to radians
    dblRadians  = Math.toRadians(dblDegrees);
    
    // prints results
    System.out.println(dblDegrees + " degrees = " + dblRadians + " radians");
    
  }
}
