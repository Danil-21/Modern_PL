package Exercise;

import java.util.Arrays;

public class FigureService {

    public static FigureReport createReport(Figure figure) {

        String formula;

        switch (figure.getType()) {
            case TRIANGLE:
                formula = "Формула Герона";
                break;

            case RECTANGLE:
                formula = "Ширина * Высота";
                break;

            default:
                throw new IllegalArgumentException("Неизвестный тип фигуры");
        }

        return new FigureReport(
                figure.getType(),
                figure.getDescription(),
                formula,
                figure.calculateArea()
        );
    }

    public static void printReports(Figure[] figures) {

        FigureReport[] reports = new FigureReport[figures.length];

        for (int i = 0; i < figures.length; i++) {
            reports[i] = createReport(figures[i]);
        }

        Arrays.sort(reports);

        System.out.println("Отчет по фигурам");

        for (FigureReport report : reports) {
            System.out.println("\nТип: " + report.type().getTitle());
            System.out.println(report.description());
            System.out.println("Формула: " + report.formula());
            System.out.printf("Площадь: %.2f%n", report.area());
        }

        if (reports.length > 0) {
            System.out.println("\nПример toString():");
            System.out.println(reports[0]);
        }
    }
}
