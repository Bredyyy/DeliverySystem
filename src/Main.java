import com.bredy.deliverySystem.model.*;
import com.bredy.deliverySystem.service.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static DeliverySystem system = new DeliverySystem();

    private static List<Client> clients = new ArrayList<>();
    private static List<Restaurant> restaurants = new ArrayList<>();
    private static List<Deliverable> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        int option = -1;

        while (option != 0) {
            System.out.println("\n--- BREDY DELIVERY SYSTEM ---");
            System.out.println("1. Register Client");
            System.out.println("2. Register Restaurant");
            System.out.println("3. Register Delivery Vehicle (Bike/Moto)");
            System.out.println("4. Create New Order");
            System.out.println("5. List All Orders");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            try {
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1 -> registerClient();
                    case 2 -> registerRestaurant();
                    case 3 -> registerVehicle();
                    case 4 -> createOrder();
                    case 5 -> system.orderList();
                    case 0 -> System.out.println("Exiting system...");
                    default -> System.out.println("Invalid option!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void registerClient() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        clients.add(new Client(name, email, phone));
        System.out.println("Client registered successfully!");
    }

    private static void registerRestaurant() {
        System.out.print("Restaurant Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Category: ");
        String category = scanner.nextLine();

        restaurants.add(new Restaurant(name, address, category));
        System.out.println("Restaurant registered!");
    }

    private static void registerVehicle() {
        System.out.println("1. Bicycle | 2. Motorcycle");
        int type = Integer.parseInt(scanner.nextLine());
        System.out.print("Rider Name/Plate: ");
        String info = scanner.nextLine();

        if (type == 1) vehicles.add(new DeliveryBicycle(info));
        else vehicles.add(new DeliveryMotorcycle(info));

        System.out.println("Vehicle registered!");
    }

    private static void createOrder() {
        if (clients.isEmpty() || restaurants.isEmpty()) {
            System.out.println("Error: You need at least one client and one restaurant registered!");
            return;
        }

        System.out.println("\nSelect Client:");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + ". " + clients.get(i).getName());
        }
        int clientIdx = Integer.parseInt(scanner.nextLine());

        System.out.println("\nSelect Restaurant:");
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i).getName());
        }
        int restIdx = Integer.parseInt(scanner.nextLine());

        System.out.print("Total Value: R$ ");
        double value = Double.parseDouble(scanner.nextLine());

        system.createOrder(clients.get(clientIdx), restaurants.get(restIdx), value);
        System.out.println("Order created successfully!");
    }
}
