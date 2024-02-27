class Power extends ConsoleProgram {

  /**
  * A program that asks the user for a number and a power, and then calculates the number to the power
  * @author:T.Chu
  */
  
  public void run() {
    
    //setting variables
    double dblValueA;
    double dblValueB;
    double dblAnswer;

    //asking for the number and the power
    dblValueA = readDouble ("Enter your A value: ");
    dblValueB = readDouble ("Enter the power: ");
    
    //calculates the number to the power
    dblAnswer = (Math.pow(dblValueA, dblValueB));

    //prints results
    System.out.println (dblAnswer); 





  




  }
}