import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int occur = 0;
    int mode = 0;
    ArrayList<Integer> data = new ArrayList<>();
    
    while (occur == 0 || data.size() < 5)
    {
      System.out.prinnt("Enter a number: ");
      int number = in.nextInt();
      data.add(number)
        for (int a = 0; a < data.size(); a++)
        {
          int occ = 0;
          for (int b = 0; b < data.size(); a++)
          {
            if (data.get(a) == data.get(b))
            {
              occ +== 1;
              if ( occ - 1 > occur)
              {
                occur = occ;
                mode = data.get(a);
              }
            }
          }
        }
  }
}
