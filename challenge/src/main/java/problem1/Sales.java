package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        /*6) */
        Scanner scan = new Scanner(System.in);
        System.out.println("what is the number of people you have :");
        int salesperson = scan.nextInt();
        int[] sales = new int[salesperson];
        int sum;

        System.out.print("Enter sales for salesperson " + 0 + ": ");
        int firstSales = scan.nextInt();
        int max = firstSales;
        int maxId = 0;
        int minId = firstSales;
        int min = 0;

        for (int i=1; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();

            if (max < sales[i]){
                max = sales[i];
                maxId = i;
            }
            if (min > sales[i]){
                min = sales[i];
                minId = i;
            }
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        /*average */
        double avg  = sum/sales.length;

        System.out.println("average is :" + avg);

        /*max and max Id*/
        System.out.println("max id : "+ maxId + " and maximum sale is: " + max);
        /**/

        /*min and min Id*/
        System.out.println("min id : "+ minId + " and minimum sale is: " + min);
        /**/

        /* 4)*/
        int value = scan.nextInt();
        if (value == max) {
            System.out.println("the value "+value + " is the maximum "+ max +" of id "+ maxId);
        }
        else {
            if (value > max) {
                System.out.println("no value exceeds the value "+value);
            }
            else {
                System.out.println("values that exceeds the value " + value);
                int counter = 0;
                for (int i = 0; i<sales.length;i++){
                    if (sales[i] > value){
                        System.out.print(" ," + value);
                        counter ++;
                    }
                }
                System.out.println("and the cardinal of this set is " + counter);
            }
        }


        /* 5) */
        System.out.println("------------------------------");
        System.out.println("Adding 1 to the ids of salesman :");
        for (int i=0; i<sales.length;i++){
            System.out.println("salesperson "+ (i+1) +" soled "+sales[i]);
        }


    }
}