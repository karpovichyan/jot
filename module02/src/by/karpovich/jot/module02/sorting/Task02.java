package by.karpovich.jot.module02.sorting;

/*
2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
Примечание. Дополнительный массив не использовать.
 */
public class Task02 {
    public static void main(String[] args) {

        int[] firstArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] seconArr = new int[]{1, 5, 7, 8, 9,};

        int sumLengthOfArrays = firstArr.length + seconArr.length;
        int[] resultArr = new int[sumLengthOfArrays];

        printSequence("first", firstArr);
        printSequence("second", seconArr);
        newSequence(firstArr, seconArr, resultArr);
        sortSequence(resultArr);
        printSequence("result", resultArr);
    }

    public static void newSequence(int[] firstArr, int[] seconArr, int[] resultArr) {
        for (int i = 0; i < firstArr.length; i++) {
            resultArr[i] = firstArr[i];
        }

        int j = 0;
        for (int i = firstArr.length; i < resultArr.length; i++) {
            resultArr[i] = seconArr[j];
            j++;
        }
    }

    public static void sortSequence (int[] resultArr) {
        int min;
        int indexMin;
        for (int i = 0; i < resultArr.length; i++) {
            min = resultArr[i];
            indexMin = i;
            for (int k = i + 1; k < resultArr.length; k++) {
                if (min > resultArr[k]) {
                    min = resultArr[k];
                    indexMin = k;
                }
            }
            resultArr[indexMin] = resultArr[i];
            resultArr[i] = min;
        }
    }

    public static void printSequence (String str, int[] arr) {
        System.out.println(str + " sequence: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

