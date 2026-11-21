package Exercise;

import java.util.Objects;

public abstract class Figure implements Comparable<Figure> {

    private String name;

    public Figure(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }

        this.name = name;
    }

    public abstract double calculateArea();

    public abstract FigureType getType();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return "Фигура: " + name;
    }

    @Override
    public int compareTo(Figure other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public String toString() {
        return "Название: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Figure other = (Figure) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
