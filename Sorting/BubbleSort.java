//Bubble Sort 
public class BubbleSort{
    public static void main (String args[]){
        int arr[]={99,8,4,55,33,24,65};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}


//Selection sort
// public  class array{
//     public static void main(String [] args){
//         int arr[] = {12,35,64,47,9}; 
//         for(int i=0; i<arr.length-1; i++){
//         int minI = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if (arr[j]<arr[minI]) {
//                     minI = j;                    
//                 }
//             }
//             int temp = arr[minI];
//             arr[minI] = arr[i];
//             arr[i] = temp;
//         }
//          for(int a: arr){
//         System.out.print(a);
//     }
//     }
   
// }



