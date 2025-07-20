// public class first {
//     class node{
//         int value;
//         node address;
//         node obj4 = null;

//         while(obj4!=null){


//         node (int data){
//             this.value = data;
//             this.address = null;
//         }
//     }
//     }

//     public static void main(String[] args) {
//         node obj = new  node(10);
//         node obj1 = new  node(20);
//         node obj2 = new  node(30);

//         obj.address = obj1.address;
//         obj1.address = obj2.address;
//         obj2.address = null;
    
//     }
    
// }


public class Node {
 int data;
 Node next;

 public Node(int data) {
 this.data = data;
 next = null;
 
 }
public void display(Node head){
 Node temp=head;
 while(temp!=null){
 System.out.print(temp.data);//10--->20--->30--->40
 temp=temp.next;
 }
}
 public static void main(String[] args) {
 Node first = new Node(10);
 Node second = new Node(20);
 Node third = new Node(30);
 Node forth = new Node(40);
 //Head point the first node of singly Linked List
 Node head=first;
 first.next=second;
 second.next=third;
 third.next=forth;
 System.out.println(head.data);
 System.out.println(head.next.data);
 System.out.println(head.next.next.data);
 System.out.println(head.next.next.next.data);
 head.display(head);

 }
}