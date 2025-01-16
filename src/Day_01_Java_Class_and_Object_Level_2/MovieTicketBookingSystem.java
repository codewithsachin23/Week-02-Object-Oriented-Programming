package Day_01_Java_Class_and_Object_Level_2;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int price;
    int seatNumber;
    boolean isBooked;


    public MovieTicket(String movieName,int price){
        this.movieName=movieName;
        this.price=price;
        this.isBooked=false;
        this.seatNumber=-1;
    }

    public void bookTicked(int seatNumber){
        if(!isBooked){
            this.seatNumber=seatNumber;
            this.isBooked=true;
            System.out.println("Your Movie ticket is Booked");
        }else {
            System.out.println("Ticket is already booked");
        }
    }
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Ticket not booked yet!");
        }
    }


}


public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter movie Name: ");
        String movieName=input.nextLine();
        System.out.print("Enter price: ");
        int price = input.nextInt();



        MovieTicket ticket = new MovieTicket (movieName, price);



        while (true){
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");

            System.out.print("Select an option: ");
            int option = input.nextInt();


            switch (option){
                case 1:
                    System.out.println("Enter the SeatNumber");
                    int seatNumber=input.nextInt();
                    ticket.bookTicked(seatNumber);
                    break;
                case 2:
                   ticket.displayTicketDetails();
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Thank you for using the Ticket Booking System!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
