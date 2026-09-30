
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Main {
    Node head;
    public void insert(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void display(){
        Node temp=head;
        while (temp.next!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Main list=new Main();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
    }
}
