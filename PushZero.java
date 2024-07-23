import java.io.*;

class PushZero
{
    static void pushZerosToEnd(int[] arr, int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n)
            arr[count++] = 0;
    }
    public static void main (String[] args)
    {
        int[] arr = {0, 1, 3, 0, 4, 5, 0, 7};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int j : arr)
            System.out.print(j + " ");
    }
}


