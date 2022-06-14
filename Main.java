//add import statements
import java.text.DecimalFormat;

/***************************************************************
 Filename: Circle1
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment:  calculate the diameter, circumference and area using the Math.PI for π
 and the Math function for squaring a number.
 ***************************************************************/
class Main 
{
  public static void main(String[] args) 
  {
        DecimalFormat df = new DecimalFormat("0.00");
        float radius = 4.50f; //declares and the radius of a circle
        double diameter, circumference, area;
        double pi = Math.PI;
        
        diameter=2*radius;
        circumference=2*pi*radius;
        area = pi * Math.pow(radius,2);
        
        System.out.println("The radius is " + df.format(radius) +" units");
        System.out.println("The diameter is " + df.format(diameter)+ " units");
        System.out.println("The circumference is " + df.format(circumference) + " units");
        System.out.println("The area is " + df.format(area) + " units squared");

   
  }//main
}//class