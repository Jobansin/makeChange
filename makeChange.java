import java.util.*;

public class makeChange
{
    public static int[] coins = {1, 5, 10, 25};
    public static void main(String[] args)
    {
    int n = Integer.parseInt(args[0]);
    System.out.println((chaching(n, 0)) + " ways:");
        for (int quarters = 0; quarters <= n ; quarters++)
    { 
        for (int dimes = 0; dimes <= n; dimes++)
    {
        for (int nickels = 0; nickels <= n; nickels++)
    {
        for (int pennies = 0; pennies <= n; pennies++)
    {
    if (n == (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 1))
    {
    System.out.println(quarters + " quarters" + " " + dimes + " dimes" + " " + nickels + " nickels" + " " + pennies + " pennies");
    }
    }
    }
    }
    }
    }
    public static int chaching(int n, int placeHolder)
    {
        if (n<=0)
            return 0;
        else return change( n, placeHolder);
    }
    public static int change(int n, int placeHolder)
    {
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
        int amountOfWays = 0;
        for(int index = placeHolder; index < coins.length; index++)
        {
            amountOfWays = amountOfWays + change(n - coins[index], index);
        }
        return amountOfWays;
    }
    }

