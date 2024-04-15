package JOBSHEET6.Percobaan3;

public class MergeSortMain21 {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting21 mSort = new MergeSorting21();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setetah diurutkan");
        mSort.printArray(data);
    }
}
