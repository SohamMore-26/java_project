import java.util.Scanner;

class test
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = obj.nextInt();
        int y = obj.nextInt();

        System.out.println("The sum is: " + (x+y));
    }
}

