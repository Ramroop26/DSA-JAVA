class TImpl{
    int data;
    TImpl left;
    TImpl Right;
    int C;
    int R;

    TImpl(int data){
        this.data = data;
        left = null;
        Right = null;
    }

}

class First{
    public static void main(String[] args) {
        TImpl obj = new TImpl(10);
        obj.left = new TImpl(20);
        obj.Right = new TImpl(30);
        obj.left.left = new TImpl(40);
        obj.left.Right = new TImpl(50);
        obj.Right.left = new TImpl(60);
        obj.Right.Right = new TImpl(70);


        System.out.println(obj.data); //                                   10
        System.out.println(obj.left.data); //                             /   \
        System.out.println(obj.Right.data);//                          20     30
        System.out.println(obj.left.left.data);//                    /  \     / \
        System.out.println(obj.left.Right.data);//                 40    50  60  70
        System.out.println(obj.Right.left.data);//
        System.out.println(obj.Right.Right.data);//

        

    }
}
