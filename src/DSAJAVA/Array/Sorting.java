package DSAJAVA.Array;

public class Sorting<T extends Number> {//sorting of number using generic
    public T[] selectionSortGeneric(T[] array){//T ---> Integer,Double,Float and Long
        T temp;
        for (int i=0;i< array.length-1;i++){
            for (int j=i+1;j< array.length;j++){
                temp=array[i];
                if (array[i].doubleValue()>array[j].doubleValue()){
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    public int[] selectionSort(int[] array){
        int temp;
        for (int i=0;i< array.length-1;i++){
            for (int j=i+1;j< array.length;j++){
                temp=array[i];
                if (array[i]>array[j]){
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    public int[] bubbleSort(int[] array){
        int a=0;
        int temp;
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-a;j++){
                temp=array[j];
                if (array[j]>array[j+1]){
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            a++;
        }
        return array;
    }
}
