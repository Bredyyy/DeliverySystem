import com.bredy.deliverySystem.model.Client;
import com.bredy.deliverySystem.model.DeliveryMan;
import com.bredy.deliverySystem.model.Restaurant;
import com.bredy.deliverySystem.model.DeliverySystem;

public class Main {
    static void main(String[] args) {
        Restaurant pizzaOne = new Restaurant("Pizza 1", "Street London, 12", "PIZZA");
        //pizzaOne.showRestaurantInfo();

        Restaurant mcDonald = new Restaurant("MCDonald", "Street Paries", "Borgar");
        //mcDonald.showRestaurantInfo();

        Client clientOne = new Client("Fernando", "fernando@blabla.com", "(12) 983838383");
        System.out.println(clientOne.toString());
        System.out.println("=================================");
        DeliveryMan deliveryManOne = new DeliveryMan("Jackson", "Jackson@blabla.com", "(12) 94747474");
        System.out.println(deliveryManOne.toString());
        System.out.println("---------------------------------");

        Client clientTwo = new Client("Marta", "marta@blabla.com", "(12) 9757575755");
        System.out.println(clientTwo.toString());
        System.out.println("=================================");
        DeliveryMan deliveryManTwo = new DeliveryMan("Maicon", "Maicon@blabla.com", "(12) 94747474");
        System.out.println(deliveryManTwo.toString());
        System.out.println("---------------------------------");

        DeliverySystem system = new DeliverySystem();

        system.createOrder(clientOne, pizzaOne, 59.90);
        system.createOrder(clientTwo, mcDonald, 35.50);

        //system.orderList();
    }
}