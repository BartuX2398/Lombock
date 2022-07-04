package pl.kurs;

import pl.kurs.model.Alcoholic;
import pl.kurs.model.Beer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Beer b1 = new Beer("despareados", 3.99, List.of("przenica", "chmiel"));
        Beer b2 = new Beer("Piast", 3.99, List.of("przenica", "chmiel"));

        Beer b3 = Beer.builder()
                .mark("Zywiec")
                .price(5.99)
                .components(List.of("cukier", "soda"))
                .build();

        Beer b4 = Beer.builder()
                .mark("Zywiec")
                .price(5.99)
                .components(List.of("cukier", "soda"))
                .build();



        Alcoholic a1 = new Alcoholic("Tomek", "Szczesny");

        System.out.println();
    }
}
