package TrainTicketBooking;

import java.util.Scanner;

class InvalidInputException extends Exception {
    InvalidInputException(String message) {
        super(message);
    }
}

class OutOfBoundsException extends Exception {
    OutOfBoundsException(String message) {
        super(message);
    }
}

class NetworkException extends Exception {
    NetworkException(String message) {
        super(message);
    }
}

class SecurityException extends Exception {
    SecurityException(String message) {
        super(message);
    }
}

class PaymentException extends Exception {
    PaymentException(String message) {
        super(message);
    }
}

class TrainTicketBooking {
    private static int[] seats = new int[50];
    private static boolean[] booked = new boolean[50];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            bookTicket();
        } catch (InvalidInputException | OutOfBoundsException | NetworkException | SecurityException | PaymentException e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static void bookTicket() throws InvalidInputException, OutOfBoundsException, NetworkException, SecurityException, PaymentException {
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        if (name.trim().isEmpty()) {
            throw new InvalidInputException("Invalid name, please try again.");
        }

        System.out.print("Enter date of travel (DD/MM/YYYY): ");
        String date = input.nextLine();
        if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new InvalidInputException("Invalid date format, please try again.");
        }

        System.out.print("Enter number of tickets to book: ");
        int numTickets = input.nextInt();
        input.nextLine();
        if (numTickets <= 0 || numTickets > 5) {
            throw new OutOfBoundsException("Invalid number of tickets, please try again.");
        }

        System.out.print("Enter seat number (1-50): ");
        int seatNum = input.nextInt();
        input.nextLine();
        if (seatNum < 1 || seatNum > 50) {
            throw new OutOfBoundsException("Invalid seat number, please try again.");
        }

        for (int i = seatNum - 1; i < seatNum + numTickets - 1; i++) {
            if (i >= seats.length || booked[i]) {
                throw new OutOfBoundsException("Seat(s) not available, please try again.");
            }
        }

        System.out.print("Enter credit card number: ");
        String creditCard = input.nextLine();
        if (!creditCard.matches("\\d{16}")) {
            throw new PaymentException("Invalid credit card number, please try again.");
        }

        System.out.println("Booking successful!");
        for (int i = seatNum - 1; i < seatNum + numTickets - 1; i++) {
            seats[i] = i + 1;
            booked[i] = true;
        }
    }
}

