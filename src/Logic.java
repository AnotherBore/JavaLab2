import java.util.ArrayList;

public class Logic {
    public static void moreOrLessThan(int[] array, String[] condition) {
        boolean lessThan = condition[0].equals("<");
        ArrayList newList = new ArrayList<Integer>();
        int number = Integer.parseInt(condition[1]);
        if (lessThan) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < number) {
                    newList.add(array[i]);
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > number) {
                    newList.add(array[i]);
                }
            }
        }
        if (newList.isEmpty()) System.out.println("Таких чисел в массиве нет");
        else System.out.println(newList);
    }

    public static void isEqual(int[] array, String[] condition) {
        boolean isEqual = condition[0].equals("=");
        ArrayList newList = new ArrayList<Integer>();
        int number = Integer.parseInt(condition[1]);
        if (isEqual) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    newList.add(array[i]);
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != number) {
                    newList.add(array[i]);
                }
            }
        }
        if (newList.isEmpty()) System.out.println("Таких чисел в массиве нет");
        else System.out.println(newList);
    }

    public static int[] deleteDublicates(int[] array){
        int unique = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){
                unique++;
            }
        }
        int[] newArray = new int[unique];
        int k = 0;
        if (newArray.length > 0){
            newArray[k++] = array[0];
        }
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){ newArray[k++] = array[i];
            }
        }
        return newArray;
    }

    public static byte isSorted(int[] array){
        byte mode = 0;
        if (array. length > 1){
            for(int i = 0; i < (array.length - 1); i++){
                if(array[i] < array[i+1])
                    mode = 1;
                else{
                    mode = 0;
                    break;
                }
            }
            if (mode == 0){
                for(int i = 0; i < (array.length - 1); i++){
                    if(array[i] > array[i+1])
                        mode = 2;
                    else{
                        mode = 0;
                        break;
                    }
                }
            }
        }
        else mode = 3;
        return mode;
    }
}
