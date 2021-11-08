package javaexample73mainprogargs2;

public class JavaExample73MainProgArgs2 {

    public static void main(String[] args) {

        int[] numbers=StringArray2IntArray(args);
        PrintIntArray(numbers);
    }

    private static int[] StringArray2IntArray(String[] array)
    {
         int counter = ValidNumbersCounter(array);

        int[] numbers = new int[counter];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (IsNumber(array[i])) {
                numbers[j] = Integer.parseInt(array[i]);
                j++;
            }
        }
        return numbers;
    }
    private static int ValidNumbersCounter(String[] array) {
        int count = 0; // counter for valid numbers

        for (int i = 0; i < array.length; i++) {
            if (IsNumber(array[i])) {
                count++;
            }
        }
        return count;
    }

    private static void PrintIntArray(int[] array) {
        System.out.print("Int array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static boolean IsNumber(String str) {
        int a;
        try {
            a = Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static int String2Int(String str) {
        int a = 0;
        try {
            a = Integer.parseInt(str);
            return a;
        } catch (Exception e) {
            System.out.println(e.toString() + '\n' + e.getMessage());
            return a;
        }
    }
}
