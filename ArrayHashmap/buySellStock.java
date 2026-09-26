package ArrayHashmap;
import java.util.Scanner;

import static java.lang.Math.*;

public class buySellStock {
        public static int maxProfit(int[] prices) {

            int buy = Integer.MAX_VALUE;
            int profit = 0;

            for (int i = 0; i < prices.length; i++) {

                // Step 1:
                // Is today's price cheaper than our previous minimum?
                if(prices[i]<buy){
                    buy = prices[i];
                }


                // Step 2:
                // If not, calculate today's possible profit.

                int currentProfit = prices[i] - buy;

                // Step 3:
                // Keep the maximum profit.

                profit = max(profit, currentProfit);

            }

            return profit;

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int profit = maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);


        sc.close();
    }
    }
