class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
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
    
  dblSideA = readDouble ("Enter the side length of A in cm: ");
  dblSideB = readDouble ("Enter the side length of B in cm: ");
  AngleC = readDouble ("Enter the value for angle C in degrees: ");


  dblCosAngle = (AngleC/57.2958);
  dblCosAngleP2 = (Math.cos(dblCosAngle));

  



  dblSideCP1 = (Math.pow(dblSideA, 2) + (Math.pow(dblSideB, 2)));

  dblSideCP2 = (-2*dblSideA*dblSideB);



  dblSideCP3 = (dblSideCP2*dblCosAngleP2);

  dblSideCP4 = (dblSideCP1 + dblSideCP3);

  dblSideCP5 = (Math.sqrt(dblSideCP4));

    
  
 

  System.out.println("The length of side C is about " + dblSideCP5 + " cm");





    
  }
}