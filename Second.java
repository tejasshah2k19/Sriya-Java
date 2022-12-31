import java.util.Scanner;

public class Second {

    // instance varibale
    int abc;// instance variable

    Scanner scr = new Scanner(System.in);    

    void add() {
        // variable
        // datatype
        System.out.println("Enter two numbers");
        int a = scr.nextInt(); // local
        int b = scr.nextInt(); // local
        int c = a + b;
        System.out.println("Add => " + c);
    }

    public static void main(String[] args) {
        Second s = new Second(); // declaration - no actual memory - null object
        s.add(); // dot operator is used to invoke property using object

        Scanner scr = new Scanner(System.in);    

        System.out.println("Enter your name");
        String name = scr.next();
        System.out.println("name => "+name);
    }
}

// encapsulation -> class -> main method must inside class
//
