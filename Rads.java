class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
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
