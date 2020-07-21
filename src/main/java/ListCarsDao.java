import java.util.ArrayList;
import java.util.List;

public class ListCarsDao implements Cars {
    private List<Car> cars;

    public List<Car> all() {
        if (cars == null) {
            cars = generateCars();
        }
        return cars;
    }

        private List<Car> generateCars() {
            List<Car> cars = new ArrayList<>();
            cars.add(new Car(
                    1,
                    "Toyota",
                    "Camry",
                    2006
            ));
            cars.add(new Car(
                    2,
                    "Hummer",
                    "H3",
                    2008
            ));
            cars.add(new Car(
                    3,
                    "Saturn",
                    "Vue",
                    2005
            ));
            cars.add(new Car(
                    4,
                    "Honda",
                    "Accord",
                    2008

            ));
            return cars;
        }
    }

