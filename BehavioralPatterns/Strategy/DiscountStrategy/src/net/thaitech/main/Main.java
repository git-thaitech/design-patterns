package net.thaitech.main;

public class Main {
    public static void main(String[] args) {
        Ticket studentTicket = new Ticket(10.0, new StudentDiscountStrategy());
        System.out.println("Student Ticket Price: " + studentTicket.getPrice());

        Ticket seniorTicket = new Ticket(10.0, new SeniorDiscountStrategy());
        System.out.println("Senior Ticket Price: " + seniorTicket.getPrice());

        Ticket regularTicket = new Ticket(10.0, new NoDiscountStrategy());
        System.out.println("Regular Ticket Price: " + regularTicket.getPrice());
    }
}
