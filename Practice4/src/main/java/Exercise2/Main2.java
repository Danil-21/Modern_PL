package Exercise2;

public class Main2 {

    public static void main(String[] args) {

        Task task1 = new StudyTask(
                "Практическая работа",
                "Изучить ООП",
                1,
                "10.11.2026",
                "Не выполнено",
                "Java"
        );

        Task task2 = new WorkTask(
                "Подготовить отчёт",
                "Составить отчёт за месяц",
                2,
                "05.11.2026",
                "В процессе",
                "Компания А"
        );

        Task task3 = new PersonalTask(
                "Купить продукты",
                "Молоко, хлеб, яйца",
                3,
                "01.11.2026",
                "Не выполнено",
                "Покупки"
        );

        System.out.println("ОПИСАНИЯ ЗАДАЧ");
        System.out.println(task1.getDescription());
        System.out.println(task2.getDescription());
        System.out.println(task3.getDescription());

        System.out.println("\nПОЛНАЯ ИНФОРМАЦИЯ");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        Task task4 = new StudyTask(
                "Практическая работа",
                "Изучить ООП",
                1,
                "10.11.2026",
                "Не выполнено",
                "Java"
        );

        System.out.println("\nСРАВНЕНИЕ ЗАДАЧ");
        System.out.println("task1 == task4: " + (task1 == task4));
        System.out.println("task1.equals(task4): " + task1.equals(task4));

        System.out.println("\nХЕШ-КОДЫ");
        System.out.println("Равны ли хеш-коды: "
                + (task1.hashCode() == task4.hashCode()));
    }
}
