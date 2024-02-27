class Cos3rd extends ConsoleProgram {

  /**
  * A program that asks the user for sides A and B of a triangle, and the value for angle C.  It uses the inputs to find side length C
  * @author: T.Chu
  */
  
  public void run() {
  


  //setting variables
  double dblSideA;
  double dblSideB;
  double AngleC;
  double dblSideCP1;
  double dblSideCP2;
  double dblSideCP3;
  double dblSideCP4;
  double dblSideCP5;
  double dblCosAngle;
  double dblCosAngleP2;
    

  //asking for side lengths and the angle
  dblSideA = readDouble ("Enter the side length of A in cm: ");
  dblSideB = readDouble ("Enter the side length of B in cm: ");
  AngleC = readDouble ("Enter the value for angle C in degrees: ");

  //calculating
  dblCosAngle = (AngleC/57.2958);
  
  dblCosAngleP2 = (Math.cos(dblCosAngle));

  dblSideCP1 = (Math.pow(dblSideA, 2) + (Math.pow(dblSideB, 2)));

  dblSideCP2 = (-2*dblSideA*dblSideB);

  dblSideCP3 = (dblSideCP2*dblCosAngleP2);

  dblSideCP4 = (dblSideCP1 + dblSideCP3);

  dblSideCP5 = (Math.sqrt(dblSideCP4));

    
  
 
  //printing result
  System.out.println("The length of side C is about " + dblSideCP5 + " cm");





    
  }
}