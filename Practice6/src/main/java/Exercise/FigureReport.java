package Exercise;

public record FigureReport(
        FigureType type,
        String description,
        String formula,
        double area
) implements Comparable<FigureReport> {

    public FigureReport {
        if (type == null || description == null
                || formula == null || !Double.isFinite(area)
                || area < 0) {
            throw new IllegalArgumentException("Некорректные данные отчёта");
        }
    }

    @Override
    public int compareTo(FigureReport other) {
        return Double.compare(this.area, other.area);
    }
}
