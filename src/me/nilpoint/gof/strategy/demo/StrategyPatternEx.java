package me.nilpoint.gof.strategy.demo;

import me.nilpoint.gof.strategy.choices.FirstChoice;
import me.nilpoint.gof.strategy.choices.IChoice;
import me.nilpoint.gof.strategy.choices.SecondChoice;
import me.nilpoint.gof.strategy.contextofchoice.Context;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class StrategyPatternEx {
  public static void main(String[] args) throws IOException {

    System.out.println("***Strategy Pattern Demo***");

    Scanner in = new Scanner(System.in);
    IChoice ic;
    Context context = new Context();
    String input1, input2;
    //Looping twice to test two different choices
    try {
      System.out.println("Input a integer: ");
      input1 = in.nextLine();
      System.out.println("Input another integer: ");
      input2 = in.nextLine();
      System.out.println("Enter your choice (1 or 2)");
      System.out.println("Press 1 for Addition, 2 for Concatenation");
      String c = in.nextLine();

      /*For Java old versions-use these lines to collect input from user
      BufferedReader br = new BufferedReader
          ( new InputStreamReader( System.in ));
      String c = br.readLine();*/

      if (c.equals("1")) {
        /* If user input is 1, create object of FirstChoice
          (Strategy 1)*/
        ic = new FirstChoice();
      } else {
        /* If user input is 2, create object of SecondChoice
          (Strategy 2)*/
        ic = new SecondChoice();
      }

      /*Associate the Strategy with Context*/
      context.SetChoice(ic);
      context.ShowChoice(input1, input2);


    } finally {
      in.close();
    }

    System.out.println("End of Strategy pattern");

  }
}
