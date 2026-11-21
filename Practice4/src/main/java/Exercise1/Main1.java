package Exercise1;

public class Main1 {

    public static void main(String[] args) {

        Vector2D v1 = new Vector2D(1, 2, 4, 6);
        Vector2D v2 = new Vector2D(5, 1, 7, 4);

        System.out.print("Первый вектор: ");
        v1.print();

        System.out.print("Второй вектор: ");
        v2.print();

        Vector2D sum = v1.add(v2);
        System.out.print("Сумма векторов: ");
        sum.print();

        double product = v1.scalarMult(v2);
        System.out.println("Скалярное произведение: " + product);

        Vector2D multiplied = v1.multiply(2);
        System.out.print("Первый вектор, умноженный на 2: ");
        multiplied.print();

        System.out.println("Длина первого вектора: " + v1.length());
        System.out.println("Длина второго вектора: " + v2.length());

    }
}
