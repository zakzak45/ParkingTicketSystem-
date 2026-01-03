import java.util.Scanner;

class ParkingTicket {

    private String plateNumber;
    private int hoursParked;
    private double ratePerHour;

    // Constructor
    public ParkingTicket(String plateNumber, int hoursParked, double ratePerHour) {
        this.plateNumber = plateNumber;
        this.hoursParked = hoursParked;
        this.ratePerHour = ratePerHour;
    }

    // Calculates total fine
    public double calculateFine() {
        return hoursParked * ratePerHour;
    }

    // Displays ticket information
    public void displayTicket() {
        System.out.println("\n--- Parking Ticket ---");
        System.out.println("Plate Number : " + plateNumber);
        System.out.println("Hours Parked : " + hoursParked);
        System.out.println("Rate per Hour: R" + ratePerHour);
        System.out.println("Total Fine  : R" + calculateFine());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plate number: ");
        String plateNumber = scanner.nextLine();

        System.out.print("Enter hours parked: ");
        int hoursParked = scanner.nextInt();

        // Fixed rate per hour (can be changed)
        double ratePerHour = 25.0;

        ParkingTicket ticket = new ParkingTicket(plateNumber, hoursParked, ratePerHour);
        ticket.displayTicket();

        scanner.close();
    }
}
