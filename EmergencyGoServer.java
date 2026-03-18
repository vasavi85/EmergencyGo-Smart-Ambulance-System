import java.util.Scanner;

class Ambulance {
    String ambulanceId;
    String driverName;
    String location;
    boolean available;

    Ambulance(String ambulanceId, String driverName, String location, boolean available) {
        this.ambulanceId = ambulanceId;
        this.driverName = driverName;
        this.location = location;
        this.available = available;
    }
}

public class EmergencyGoServer {

    public static Ambulance findNearestAvailableAmbulance(Ambulance[] ambulances) {
        for (Ambulance a : ambulances) {
            if (a.available) {
                return a;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ambulance[] ambulances = {
            new Ambulance("AMB101", "Ravi Kumar", "Guntur", true),
            new Ambulance("AMB102", "Suresh", "Vijayawada", false),
            new Ambulance("AMB103", "Mahesh", "Tenali", true)
        };

        System.out.println("===== EmergencyGo Smart Ambulance System =====");
        System.out.print("Enter patient name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter emergency location: ");
        String emergencyLocation = sc.nextLine();

        System.out.println("\nSearching for nearest available ambulance...");

        Ambulance assigned = findNearestAvailableAmbulance(ambulances);

        if (assigned != null) {
            assigned.available = false;

            System.out.println("\n🚑 Ambulance Booked Successfully!");
            System.out.println("Patient Name      : " + patientName);
            System.out.println("Emergency Location: " + emergencyLocation);
            System.out.println("Assigned Ambulance: " + assigned.ambulanceId);
            System.out.println("Driver Name       : " + assigned.driverName);
            System.out.println("Current Location  : " + assigned.location);
            System.out.println("ETA               : 8 minutes");
            System.out.println("Nearest Hospital  : City Care Hospital");
        } else {
            System.out.println("\n❌ No ambulance available at the moment.");
        }

        sc.close();
    }
}