package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задание 3: ");
        System.out.println(" ");
        int []array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        System.out.println(sum);

        System.out.println("---");
        int []array1 = {1, 2, 3, 4, 5};
        int sum1 = 0;
        int i1 = 0;
        while (i1 < array1.length)
        {
            sum1 = sum1 + array1[i1];
            i1 = i1 + 1;
        }
        System.out.println(sum1);

        System.out.println("---");
        int []array2 = {1, 2, 3, 4, 5};
        int sum2 = 0;
        int i2 = 0;
        do
        {
            sum2 = sum2 + array2[i2];
            i2 = i2 + 1;
        }
        while (i2 < array2.length);
        System.out.println(sum2);

        System.out.println("-----");
        System.out.println("Задание 4: ");
        System.out.println(" ");
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("Количество аргументов - " + args[i]);
        }

        System.out.println("-----");
        System.out.println("Задание 5: ");
        System.out.println(" ");
        double x;
        for(double i4 = 1; i4 < 10; i4++)
        {
            x = 1 / i4;
            System.out.format("Число - %5f%n", x);
        }

        System.out.println("-----");
        System.out.println("Задание 6: ");
        System.out.println(" ");
        int[] array5 = new int[10];
        for (int i5 = 0; i5 < 10; i5++)
        {
            array5[i5] = 0 + (int) (Math.random() * 100);
        }
        for (int i6 = 0; i6 < 10; i6++)
        {
            System.out.println(array5[i6]);
        }
        System.out.println("---");
        for (int i7 = array5.length-1; i7 > 0; i7--)
        {
            for (int j = 0; j < i7; j++)
            {
                if (array5[j] > array5[j+1])
                {
                    int tmp = array5[j];
                    array5[j] = array5[j+1];
                    array5[j+1] = tmp;
                }
            }
        }
        for (int i8 = 0; i8 < 10; i8++)
        {
            System.out.println(array5[i8]);
        }

        System.out.println("-----");
        System.out.println("Задание 7: ");
        System.out.println(" ");
    }
    static int factorial(int n)
    {
        int res = 1;
        for (int i = 2; i < n + 1; i++) {
            res = res * i;
        }
        return res;
    }
}
