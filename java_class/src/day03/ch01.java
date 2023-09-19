package day03;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ch01 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish(120),
                new Dish(300),
                new Dish(350),
                new Dish(400),
                new Dish(530));

        List<Dish> filterMenu
                = menu.stream()
                .filter(dish -> dish.getCal() < 320)
                .collect(toList());

        for(Dish d: filterMenu) {
            System.out.println(d.getCal());
        }
    }

    static class Dish {
        private int cal;
        Dish(int cal) {
            this.cal = cal;
        }

        public int getCal() {
            return cal;
        }
    }
}
