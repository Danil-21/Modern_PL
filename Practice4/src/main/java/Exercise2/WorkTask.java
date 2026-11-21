package Exercise2;

import java.util.Objects;

public class WorkTask extends Task {

    private String company;

    public WorkTask(String title, String description, int priority,
                    String deadline, String status, String company) {

        super(title, description, priority, deadline, status);
        this.company = company;
    }

    @Override
    public String getDescription() {
        return "Рабочая задача (" + company + "): "
                + super.getDescription();
    }

    @Override
    public String toString() {
        return super.toString() + ", Компания: " + company;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        WorkTask other = (WorkTask) obj;
        return Objects.equals(company, other.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company);
    }
}
