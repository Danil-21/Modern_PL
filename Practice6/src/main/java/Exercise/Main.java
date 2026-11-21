package Exercise;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle(2, 4),
                new Triangle(5, 5, 6),
                new Rectangle(3, 3),
                new Triangle(3, 4, 5)
        };

        FigureService.printReports(figures);
    }
}
