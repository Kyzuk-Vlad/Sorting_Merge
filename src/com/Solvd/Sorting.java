package com.Solvd;

public class Sorting
{
    void Merge(int[] array, int p, int q, int r)
    {

        int n1 = q - p + 1;
        int n2 = r - q;
        int[] Left = new int[n1];
        int[] Right = new int[n2];

        for (int i = 0; i < n1; i++)
            Left[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            Right[j] = array[q + 1 + j];
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        while (i < n1 && j < n2)
        {
            if (Left[i] <= Right[j])
            {
                array[k] = Left[i];
                i++;
            }
            else
            {
                array[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            array[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            array[k] = Right[j];
            j++;
            k++;
        }
    }

    void MergeSort(int[] array, int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            MergeSort(array, left, mid);
            MergeSort(array, mid + 1, right);
            Merge(array, left, mid, right);
        }
    }
}