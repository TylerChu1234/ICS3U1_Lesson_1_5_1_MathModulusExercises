class Circumference extends ConsoleProgram {

  /**
  * A program that asks the user for the radius of a circle, and then calculates the circumfrence and prints it
  * @author:T.Chu
  */
  
  public void run() {
    
    // declaring variables
    double dblRadius;
    double dblCircumfrence;

    //asking the user for the radius
    dblRadius = readDouble("what is the radius of the circle? ");

    //calculating circumfrence
    dblCircumfrence = (Math.PI*(2*dblRadius));

    //printing results
    System.out.println (dblCircumfrence);











































    
  }
}