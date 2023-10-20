import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        CLASSES ABSTRATAS
        - são classes que não podem ser instanciadas
        - é uma forma de garantir herança total: somente subclasses não abstratas podem
        ser instanciadas, mas nunca a superclasse abstrata

        MÉTODOS ABSTRATOS
        - são métodos que não possuem implementação
                - métodos precisam ser abstratos quando a classe é genérica demais para conter sua
        implementação
                - se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Number of shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("Shape #%d data: \n", i);
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            if (shape == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(width, height, color));
            } else if (shape == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            } else {
                System.out.println("Invalid shape");
            }
        }

        System.out.println("SHAPE AREA(S): ");
        for(Shape sh : shapes){
            System.out.printf("%s: %.2f%n", sh.getName(), sh.area());
        }

    }
}