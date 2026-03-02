import com.bredy.deliverySystem.model.Client;
import com.bredy.deliverySystem.model.Restaurant;
import com.bredy.deliverySystem.model.DeliverySystem;

public class Main {
    static void main(String[] args) {
        Restaurant pizzaOne = new Restaurant("Pizza 1", "Street London, 12", "PIZZA");
        //pizzaOne.showRestaurantInfo();

        Restaurant mcDonald = new Restaurant("MCDonald", "Street Paries", "HAMBURGER");
        //mcDonald.showRestaurantInfo();

        Client clientOne = new Client("Fernando", "(12) 983838383");
        //clientOne.showClientInfo();

        Client clientTwo = new Client("Marta", "(12) 9757575755");
        //clientTwo.showClientInfo();

        DeliverySystem system = new DeliverySystem();

        system.createOrder(clientOne, pizzaOne, 59.90);
        system.createOrder(clientTwo, mcDonald, 35.50);

        system.orderList();
    }
}