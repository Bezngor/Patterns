package basepatterns.creational.singleton;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderLogistic {
    private static OrderLogistic orderLogistic;
    private static LocalDate date;
    private static List<String> loadingPoints;

    private OrderLogistic() {
        date = LocalDate.now();
        loadingPoints = new ArrayList<>();
    }

    public static synchronized OrderLogistic getOrderLogistic() {
        if (orderLogistic == null || !date.equals(LocalDate.now())) {
            orderLogistic = new OrderLogistic();
        }
        return orderLogistic;
    }

    public void addLoadingPoint(String point) {
        loadingPoints.add(point);
    }

    public void showLoadingPoints() {
        System.out.println(date.toString());
        loadingPoints.forEach(System.out::println);
    }
}
