import java.util.Scanner;

public class Teme extends Main {


    public class Square {


        public class Circle {
            private int radius;

            public Circle(int radius) {
                this.radius = radius;
            }

            public double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }

            public double calculateArea() {
                return Math.PI * Math.pow(radius, 2);
            }
        }


        public class Rectangle {
            private int length;
            private int width;

            public Rectangle(int length, int width) {
                this.length = length;
                this.width = width;
            }
            // metoda pentru calcularea perimetrului

            public int calculatePerimeter() {
                return 2 * length + 2 * width;
            }

            public class Main {
                public static void main(String[] args) {
                }
            }
        }
    }
}
