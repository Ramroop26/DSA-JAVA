public class slidingWindow {

static int SubMaxSum(int arr[], int size){
    int n = arr.length;
    if(n<size) return  -1;
    
    int windowSum =0;

    for(int i=0; i<size; i++){
        windowSum = windowSum+arr[i];
    }
    int MaxSum = windowSum;
    
    for(int i=size; i<n; i++){
        windowSum = windowSum+arr[i]-arr[i-size];
      MaxSum =  Math.min(MaxSum, windowSum);

    }
    return MaxSum;
}

    public static void main(String [] args){
        int size = 3;
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(SubMaxSum(arr, size));
    }
    
}
