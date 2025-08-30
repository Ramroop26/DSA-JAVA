class LenearSearch
{
static int linearSearch(int arr[],int target)
{
    for(int i=0;i<arr.length;++i)
    {
        if(arr[i]==target)
        {
            return 1;
        }
    }
return -1;

}

public static void main(String str[])
{

int arr[]={1,2,3,4,5,6};
int target=50;
System.out.println(linearSearch(arr,target));

}

}