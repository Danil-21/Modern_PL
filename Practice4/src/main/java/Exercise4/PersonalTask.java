package Exercise4;

import java.util.Objects;

public class PersonalTask extends Task {

    private String category;

    public PersonalTask(String title, String description, int priority,
                        String deadline, String status, String category) {

        super(title, description, priority, deadline, status);
        this.category = category;
    }

    @Override
    public String getDescription() {
        return "Личная задача (" + category + "): "
                + super.getDescription();
    }

    @Override
    public String toString() {
        return super.toString() + ", Категория: "
                + category;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        PersonalTask other = (PersonalTask) obj;
        return Objects.equals(category, other.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }
}
