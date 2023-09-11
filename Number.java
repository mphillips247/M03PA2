import java.math.BigInteger;
import java.util.Scanner;

public class Number {
    public static void main(String args[]) {
        String n = "", d = "", str;
        Scanner in = new Scanner(System.in);

        //prompt for number
        System.out.print("Enter the first rational number : ");
        str = in.nextLine();
        int i;

        //get user inmput
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') break;
            n += str.charAt(i);
        }
        for (i++; i < str.length(); i++) {
            d += str.charAt(i);
        }

        //create objects 
        BigInteger num1 = new BigInteger(n);
        BigInteger deno1 = new BigInteger(d);

        //prompt for second number
        System.out.print("Enter the second rational number : ");
        str = in.nextLine();
        n = "";
        d = "";

        //get numerator and denominator 
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') break;
            n += str.charAt(i);
        }
        for (i++; i < str.length(); i++) {
            d += str.charAt(i);
        }

        //create object for second number
        BigInteger num2 = new BigInteger(n);
        BigInteger deno2 = new BigInteger(d);

        //preform math
        System.out.println(num1 + "/" + deno1 + " + " + num2 + "/" + deno2 + " = " +
                (num1.multiply(deno2).add(num2.multiply(deno1))) + "/" + (deno1.multiply(deno2)));

        System.out.println(num1 + "/" + deno1 + " - " + num2 + "/" + deno2 + " = " +
                (num1.multiply(deno2).subtract(num2.multiply(deno1))) + "/" + (deno1.multiply(deno2)));

        System.out.println(num1 + "/" + deno1 + " * " + num2 + "/" + deno2 + " = " +
                num1.multiply(num2) + "/" + deno1.multiply(deno2));

        System.out.println(num1 + "/" + deno1 + " / " + num2 + "/" + deno2 + " = " +
                num1.multiply(deno2) + "/" + deno1.multiply(num2));

        System.out.println(num2 + "/" + deno2 + " is " + num2.doubleValue() / deno2.doubleValue());

    
        in.close();
    }
}
