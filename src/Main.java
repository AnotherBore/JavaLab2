public class Main {
    public static void main(String[] args){
        int exit = 0;
        int choice = 0;
        while (exit != 100){
            System.out.println("Какое задание выполнить (1-4)?");
            choice = Input.integer();
            switch (choice) {
                case 1: {
                    UI.task1();
                    break;
                }
                case 2: {
                    UI.task2();
                    break;}
                case 3: {
                    UI.task3();
                    break;
                }
                case 4: {
                    UI.task4();
                    break;
                }
            }
            System.out.println("Для выхода из программы введите 100");
            exit = Input.integer();
        }
    }
}
