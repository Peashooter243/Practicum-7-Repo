// Practicum 6 (Use of a Debugger)

// ----------------------------------------------------------
// This program will convert Fahrenheit to Celsius
// ----------------------------------------------------------
public class main {
    public static void main(String[] args) {
  
      int fahrenheit_temp;
      double celsius_temp;
      
      // init
      java.util.Scanner input = new java.util.Scanner(System.in);
      
      // program greeting
      System.out.println(
        "\nConverts temperatures in Fahrenheit to Celsius\n");
  
      // prompt for input
      System.out.println("Enter temperature (in Fahrenheit): ");
      fahrenheit_temp = input.nextInt();

      //Converts f to c
      celsius_temp = convertToCelsius((double)fahrenheit_temp);
  
      // display results
      System.out.printf("%d degrees Fahrenheit = %.1f degrees Celsius", fahrenheit_temp, celsius_temp);
    
    }
  
    public static double convertToCelsius(double f) {
      return (f - 32) * (5.0 / 9.0);
    }
    
  }