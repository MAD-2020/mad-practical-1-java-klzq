import java.util.Scanner;

public class Question2
{
  
  public static void main(String[] args)
  { 
    Scanner in = new Scanner(System.in);
    double height,weight,bmi;
    System.out.print("Enter your height in metres: ");
    height = in.nextDouble();
    System.out.printIn("Height is: "+ height);
    System.out.print("Enter your weight in kilograms: ");
    weight = in.nextDouble();
    System.out.printIn("Weight is: "+ weight);

    bmi = (weight)/(height*height);

    System.out.printIn("Your BMI is:" + bmi);
    
  }
}
