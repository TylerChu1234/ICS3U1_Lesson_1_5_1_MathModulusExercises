class FtoC extends ConsoleProgram {

  /**
  * Asks user for degrees fahrenheight and converts it to degrees celcius
  * @author:T.Chu
  */
  
  public void run() {
    
    //setting variables
    double dblCelcius;
    double dblFahrenheit;

    //asking for the fahrenheit 
    dblFahrenheit = readDouble("enter the unit in fahrenheits: ");

    // finding celcius
    dblCelcius = ((dblFahrenheit-32) * (5.0/9.0));

    // printing result
    System.out.println(dblFahrenheit + " degrees in ceclius is " + dblCelcius + ("degrees celcius."));

    
  }
}