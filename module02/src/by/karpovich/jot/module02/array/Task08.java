package by.karpovich.jot.module02.array;

/*
8. Дана последовательность целых чисел  a1, a2,...,an. Образовать новую последовательность, выбросив из
   исходной те члены, которые равны min(a1, a2,...,an).
 */
public class Task08 {
    public static void main(String[] args) {

        int[] arr = new int[]{300, 2, 3, 4, 5, -1, 1, -1, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int countArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                countArr++;
            }
        }

        System.out.println(countArr);
        System.out.println(min);

        int[] newArr = new int[arr.length - countArr];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                newArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

