class SelectionSort{
    public static void main(String args[]){
        int arr[]={96,88,45,109,39};
        int length=arr.length;

        for(int i=0;i<length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}