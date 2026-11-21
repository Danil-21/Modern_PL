package Exercise;

public enum FigureType {

    TRIANGLE("Треугольник"),
    RECTANGLE("Прямоугольник");

    private final String title;

    FigureType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
