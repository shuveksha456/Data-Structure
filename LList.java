public class LList {
    Node head;

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        return ; 
    }

    Node currNode = head;

    while(currNode.next != null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return ;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }



  public void removeFirst() {
if(head == null) {
    System.out.println("Empty List, nothing to delete");
    return;
}


head = this.head.next;
}


    public static void main(String[] args) {
        LList linklist = new LList();
        linklist.addFirst("a");
        linklist.addFirst("is");
        linklist.addFirst("This");
        linklist.addLast("car");

        linklist.printList();
}
}

