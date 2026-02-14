import com.bredy.deliverySystem.model.Restaurant;

public class Main {
    static void main(String[] args) {
        Restaurant pizzaOne = new Restaurant();
        pizzaOne.setName("Pizza 1");
        pizzaOne.setAddress("Street London, 12 ");
        pizzaOne.setCategory("PIZZA");
        pizzaOne.showInfo();

        Restaurant mcDonald = new Restaurant();
        mcDonald.setName("mcDonald");
        mcDonald.setAddress("Street Paries");
        mcDonald.setCategory("HAMBURGER");
        mcDonald.showInfo();
    }
}