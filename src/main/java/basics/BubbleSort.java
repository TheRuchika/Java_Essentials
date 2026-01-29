package basics;

import java.util.Arrays;

public class BubbleSort {

    public static void main (String[] args) {


        int a[] = {2, 7, 1, 5, 6, 3};

        int n = a.length;

        System.out.println("Before sorting : " + Arrays.toString(a));

        for(int i=0; i<n-1; i++){
            for(int y=0; y<n-1; y++){
                if(a[y]>a[y+1]){
                    int temp = a[y];
                    a[y] = a[y+1];
                    a[y+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting :" + Arrays.toString(a));

    }
}
