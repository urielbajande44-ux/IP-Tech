import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
     //Triangle
        System.out.println(" Triangle");
        System.out.print(" Enter base: ");
        Double b = sc.nextDouble();
        System.out.print(" Enter height: ");
        Double h = sc.nextDouble();

        Double ta = (b*h)/2;
        System.out.println(" Area: "+ ta);
        
        System.out.print(" input a side: ");
        Double s1= sc.nextDouble();
        System.out.print(" Enter b side: ");
        Double s2 = sc.nextDouble();
        System.out.print(" Enter c side: ");
        Double s3 = sc.nextDouble();

        Double tp = s1+s2+s3;
        System.out.println(" Perimeter: "+ tp);

    //Parallelogram
        System.out.println("Parallelogram ");
        System.out.print("Enter base: ");
        Double paraB = sc.nextDouble();
        System.out.print("Enter height: ");
        Double paraH = sc.nextDouble();

        Double areaParallelogram = paraB*paraH;
        System.out.println("Area : "+ areaParallelogram);

        System.out.print("Enter DE: ");
        Double DE= sc.nextDouble();
        System.out.print("Enter EF: ");
        Double EF= sc.nextDouble();
        System.out.print("Enter FG: ");
        Double FG= sc.nextDouble();
        System.out.print("Enter GD: ");
        Double GD= sc.nextDouble();

        Double pp = DE+EF+FG+GD;
        System.out.println("Perimeter: "+ pp);
      
    //RHOMBUS
        System.out.println("Rhombus ");
        System.out.print("Enter Base: ");
        Double rhB = sc.nextDouble();
        System.out.print("Enter Height: ");
        Double rhH = sc.nextDouble();

        Double areaRhombus = (rhB*rhH)/2;
        System.out.println("Area: "+ areaRhombus);

        System.out.print("Enter Base for Perimeter: ");
        Double b2= sc.nextDouble();
        Double perimeterRhombus = 4*b2;
        System.out.println("Perimeter: "+ perimeterRhombus);
    
        //Rectangle
        System.out.println("Rectangle: ");
        System.out.print("Enter Length: ");
        Double l = sc.nextDouble();
        System.out.print("Enter Weight: ");
        Double w = sc.nextDouble();
        
        Double areaRectangle = l*w;
        System.out.println("Area: "+ areaRectangle);

        System.out.print("Enter Length for Perimeter: ");
        Double L= sc.nextDouble();
        System.out.print("Enter W: ");
        Double W= sc.nextDouble();
        Double perimeterRectangle = (2*L)+(2*W);
        System.out.println("Perimeter: "+ perimeterRectangle);

    // Square
        System.out.println("Square: ");
        System.out.print("Enter Length: ");
        Double l2= sc.nextDouble();

        Double squareArea = l2*l2;
        System.out.println("Area: "+ squareArea);

        System.out.print("Enter Length for Perimeter: ");
        Double sl= sc.nextDouble();
        Double squarePerimeter = 4*sl;
        System.out.println("square: "+ squarePerimeter);

    // Trapezoid
          System.out.println("Trapezoid: ");
          System.out.print("Enter Base1: ");
          Double b1= sc.nextDouble();
          System.out.print("Enter Base2: ");
          Double b3= sc.nextDouble();
          System.out.print("Enter Height: ");
          Double h2= sc.nextDouble();
          Double trapezoidArea = ((b1+b3)*h2)/2;
          System.out.println("Area: "+ trapezoidArea);

          System.out.print("Enter the MN for perimeter: ");
          Double MN= sc.nextDouble();
          System.out.print("Enter NP for perimeter: ");
          Double NP= sc.nextDouble();
          System.out.print("Enter the PR for perimeter: ");
          Double PR= sc.nextDouble();
          System.out.print("Enter the RM for perimeter ");
          Double RM= sc.nextDouble();
          Double trapezoidPerimeter = MN+NP+PR+RM;
          System.out.println("Trapezoid: "+ trapezoidPerimeter);
    
    //Circle
            System.out.println("Circle: ");
            System.out.print("Enter Radius: ");
            Double R1= sc.nextDouble();
            Double areaCircle = Math.PI * R1 * R1;
            System.out.println("Circle: "+ areaCircle);

            System.out.print("Enter Radius for Perimeter: ");
            Double R2= sc.nextDouble();
            Double perimeterCircle = 2* Math.PI * R2;
            System.out.println("Perimeter: "+ perimeterCircle);


        sc.close();
    }
}
