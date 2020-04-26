import java.util.Scanner;

public class Question2
{
  
  public static void main(String[] args)
  { 
    Scanner in = new Scanner(System.in);
    double height,weight,bmi;
    System.out.print("Enter your height in metres: ");
    height = in.nextDouble();
    System.out.println("Height is: "+ height);
    System.out.print("Enter your weight in kilograms: ");
    weight = in.nextDouble();
    System.out.println("Weight is: "+ weight);

    bmi = (weight)/(height*height);

    System.out.println("Your BMI is:" + bmi);
    
  }
}
