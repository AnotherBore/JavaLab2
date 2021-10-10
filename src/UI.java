import java.util.Arrays;

public class UI {
    public static void task1(){
        int[] array = Input.chooseHowFillArray();
        String[] condition = Input.withCondition(1);
        Logic.moreOrLessThan(array, condition);
    }

    public static void task2(){
        int[] array = Input.chooseHowFillArray();
        String[] condition = Input.withCondition(2);
        Logic.isEqual(array, condition);
    }

    public static void task3(){
        int[] array = Input.stringWithNumbers();
        Arrays.sort(array);
        int[] newArray = Logic.deleteDublicates(array);
        writeArray(newArray);
    }

    public static void task4(){
        int[] array = Input.chooseHowFillArray();
        int mode = Logic.isSorted(array);
        writeHowSorted(mode);
    }

    public static void writeArray(int[] array){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static void writeHowSorted(int mode){
        switch (mode){
            case 0: {
                System.out.println("Данный массив не упорядочен.");
                break;
            }
            case 1: {
                System.out.println("Данный массив упорядочен по возрастанию.");
                break;
            }
            case 2: {
                System.out.println("Данный массив упорядочен по убыванию.");
                break;
            }
            case 3: {
                System.out.println("Данный массив состоит из одного элемента.");
                break;
            }
        }
    }
}
