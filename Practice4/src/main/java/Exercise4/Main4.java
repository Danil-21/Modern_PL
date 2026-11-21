package Exercise4;

public class Main4 {

    public static void main(String[] args) {

        Task[] tasks = {
                new StudyTask(
                        "Практическая работа",
                        "Решить задачи по Java",
                        1,
                        "15.11.2026",
                        "В процессе",
                        "Java"
                ),

                new StudyTask(
                        "Подготовка к экзамену",
                        "Повторить ООП",
                        2,
                        "10.12.2026",
                        "Не выполнено",
                        "Программирование"
                ),

                new WorkTask(
                        "Отчёт",
                        "Подготовить отчёт",
                        2,
                        "17.11.2026",
                        "В процессе",
                        "Компания А"
                ),

                new WorkTask(
                        "Совещание",
                        "Подготовить презентацию",
                        1,
                        "16.11.2026",
                        "Не выполнено",
                        "Компания Б"
                ),

                new PersonalTask(
                        "Покупки",
                        "Купить продукты",
                        3,
                        "23.11.2026",
                        "Не выполнено",
                        "Дом"
                ),

                new PersonalTask(
                        "Тренировка",
                        "Пробежать 5 км",
                        2,
                        "14.11.2026",
                        "Не выполнено",
                        "Спорт"
                )
        };

        System.out.println("Учет задач");
        System.out.println("Средний приоритет = сумма приоритетов / количество задач");

        int sumPriority = 0;

        System.out.println("\nСписок задач");

        for (int i = 0; i < tasks.length; i++) {
            System.out.println("\nЗадача №" + (i + 1));

            System.out.println(tasks[i].getDescription());
            System.out.println(tasks[i].toString());

            sumPriority += tasks[i].getPriority();
        }

        double avgPriority = (double) sumPriority / tasks.length;

        System.out.println("\nОбщий результат");
        System.out.println("Всего задач: " + tasks.length);
        System.out.printf("Средний приоритет: %.2f%n", avgPriority);
    }
}
