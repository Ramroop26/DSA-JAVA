public class array {
    public static void main(String [] args){
        int arr [] = {12,64,35,47,9};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(arr[i]);
                
            }
            
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



