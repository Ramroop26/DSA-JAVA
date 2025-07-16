class Impl{

    int arr[];
    int front ;
    int rear ;

    Impl(int n){
        arr = new int[n];
         front = 0;
         rear = -1;

    }
}

   public class Queue{

        public static void main(String[] args) 
        {
            Impl obj = new Impl(3);
            obj.arr[++obj.rear]  = 11;
            obj.arr[++obj.rear] = 12;
            obj.arr[++obj.rear] = 13;

            for(int i=obj.front;i<=obj.rear;i++)
            {
            System.out.println(obj.arr[i]);

      }

        }
    }


