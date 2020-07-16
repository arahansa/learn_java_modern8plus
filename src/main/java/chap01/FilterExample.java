package chap01;

import java.util.ArrayList;
import java.util.List;

import static chap01.AppleColor.GREEN;

public class FilterExample {

    static class Apple {
        AppleColor color = GREEN;

        public AppleColor getColor() {
            return color;
        }
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return  result;
    }
}
