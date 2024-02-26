class AreaSin extends ConsoleProgram {

  /**
  * A program that uses 2 sides of a triangle and the angle between them to calculate the area
  * @author:T.Chu
  */
  
  public void run() {
    
    // start coding here
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Getting the side and angle information
    dblSideA = readDouble("Enter side A of a triangle: ");
    dblSideB = readDouble("Enter side B of a triangle: ");
    dblAngleC = readDouble("Enter the angle between side A and B: ");

    // Finding the area 
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2.0;

    // Printing the answer
    System.out.println("The area is " + dblArea);
  }
}