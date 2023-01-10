import java.util.Scanner;

public class TicketApp {

    public static void main1(String[] args) {
        Customer c = new Customer();
        Scanner scr = new Scanner(System.in);

        String name = scr.next();
        String contactNum = scr.next();
        c.login(name, contactNum);

        //menu
        //1 d 2 g 3 s 
        //choice 
        //qty 
        c.buyTicket(1, 3);


    }
    
    public static void main(String[] args) {
        Customer c = new Customer();
        Scanner scr = new Scanner(System.in);

        String name = scr.next();
        String contactNum = scr.next();
        c.login(name, contactNum);

        //menu
        //1 d 2 g 3 s 
        //choice 
        //qty 
        c.buyTicket(1, 3);


    }

}

class CineMax {

    int goldPrice = 200;
    int diamondPrice = 300;
    int silverPrice = 100;
    static int totalTickets = 100;
    int goldQty = 30;
}

class Customer {
    String name;
    String contactNum;
    int goldQty; // 2
    int silverQty;// 3
    int diamondQty;// 4

    void login(String n, String c) {
        name = n;
        contactNum = c;
    }

    void printTickets() {
        System.out.println("Diamond Qty : " + diamondQty);
        System.out.println("Gold Qty : " + goldQty);
        System.out.println("Silver Qty : " + silverQty);
    }

    void buyTicket(int choice, int qty) {
        if (choice == 1) {
            diamondQty = diamondQty + qty;
        } else if (choice == 2) {
            goldQty = goldQty + qty;
        } else if (choice == 3) {
            silverQty = silverQty + qty;
        }
    }
}
