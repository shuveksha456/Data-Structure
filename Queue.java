class Queue {
    int front, rear, size;
    int[] queue;

    Queue(int queueSize) {
        queue = new int[queueSize]; 
        front = 0;
        rear = 0;
        size = queueSize;
    }

  
    public void enQueue(int data) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data; 
    }

    
    public int dequeue() throws Exception {
        if (front == rear) { 
            System.out.println("Queue is empty");
            throw new Exception("Queue is empty");
        }
        return queue[front++];
    }

  
    public void print() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        try {
            Queue q = new Queue(5);
            q.enQueue(10);
            q.enQueue(11);
            q.enQueue(30);
            q.print();
            System.out.println("Dequeued: " + q.dequeue());
            q.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
