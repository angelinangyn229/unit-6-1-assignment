import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 - Create a scanner and an array of size 3
    Scanner sc = new Scanner(System.in);
    double[] arr = new double [3]; // all 3 values are 0.0 currently
    System.out.println("Enter 3 numbers");
    arr[0] = sc.nextDouble();
    arr[1] = sc.nextDouble();
    arr[2] = sc.nextDouble();
    double sum = arr[0] + arr[1] + arr[2];

    System.out.println("\nYou entered:");
    System.out.println(arr[0] + ", " arr[1] "," arr[2]);
    System.out.println("The sum is: " + sum;

    // Problem 2
    // Use the scanner to get user input and give it to the method
    
    System.out.println("Give me a positive number");
    int N = sc.nextInt();
    int[] output = sumsOfNums(N); // what u r inputting into method
  
  }

  public static int[] sumsOfNums(int input)
  {
    // Implement Problem 2 here
  int[] output = new int[input];
   for (int arr_index = -; arr_index < output.length; arr_index++)
   {
    int sum;
   for (int num = 0; num <= arr_index; num++)
    {
      sum += num;
    }
    output[arr_index] = sum;
   }
    return 0;
  }
}
