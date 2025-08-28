public class QuickSort {
    static void QS(int arr[], int low, int high){
        if(low<high){
            int pivotindex = partition(arr, low, high);
            QS(arr,low,pivotindex-1);
            QS(arr,pivotindex+1,high);
        }

    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i=low;
        for(int j=low; j<high; ++j){
            if(arr[j]<pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                ++i;
            }

        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }
    public static void main(String []args){
        int arr[] = {10,5,7,8,1,2,6,3,4,9};
        int low=0;
        int n = arr.length;
        QS(arr, low, n-1);

        for(int i: arr){
            System.out.println(i);
        }

    }
    
}
