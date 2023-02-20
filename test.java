import java.util.Scanner;

class test
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner(System.in);
        arithmetic calc = new arithmetic();
        System.out.print("Enter two numbers: ");
        int x = obj.nextInt();
        int y = obj.nextInt();

        System.out.print("Enter the operation to be performed(+,-,*,/): ");
        char op = obj.next().charAt(0);

        switch(op)
        {
            case '+':
                System.out.println("The sum is: "+calc.add(x,y));
                break;
            case '-':
                System.out.println("The difference is: "+calc.sub(x,y));
                break;
            case '*':
                System.out.println("The product is: "+calc.mul(x,y));
                break;
            case '/':
                System.out.println("The quotient is: "+calc.div(x,y));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

//write a class with a function to do all arithmetic operations
class arithmetic
{
    public int add(int x, int y)
    {
        return x+y;
    }
    public int sub(int x, int y)
    {
        return x-y;
    }
    public int mul(int x, int y)
    {
        return x*y;
    }
    public int div(int x, int y)
    {
        return x/y;
    }
}


