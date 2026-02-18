import com.bredy.deliverySystem.model.Client;
import com.bredy.deliverySystem.model.Restaurant;
import com.bredy.deliverySystem.model.DeliverySystem;

public class Main {
    static void main(String[] args) {
        Restaurant pizzaOne = new Restaurant();
        pizzaOne.setName("Pizza 1");
        pizzaOne.setAddress("Street London, 12 ");
        pizzaOne.setCategory("PIZZA");
        //pizzaOne.showRestaurantInfo();

        Restaurant mcDonald = new Restaurant();
        mcDonald.setName("mcDonald");
        mcDonald.setAddress("Street Paries");
        mcDonald.setCategory("HAMBURGER");
        //mcDonald.showRestaurantInfo();

        Client clientOne = new Client();
        clientOne.setName("Fernando");
        clientOne.setPhone("(12) 983838383");
        //clientOne.showClientInfo();

        Client clientTwo = new Client();
        clientTwo.setName("Marta");
        clientTwo.setPhone("(12) 9757575755");
        //clientTwo.showClientInfo();

        DeliverySystem system = new DeliverySystem();

        system.createOrder(clientOne, pizzaOne, 59.90);
        system.createOrder(clientTwo, mcDonald, 35.50);

        system.orderList();
    }
}