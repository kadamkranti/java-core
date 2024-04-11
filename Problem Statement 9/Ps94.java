package practice;

public class Ps94 {
    private int capacity;
    private int[] queue;
    private int front;
    private int rear;
    private int size;
 
    public Ps94(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
 
    public void enqueue(int item) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            size++;
            System.out.println("Element added to queue: " + item);
        } else {
            System.out.println("Queue is full, cannot add element");
        }
    }
 
    public void dequeue() {
        if (!isEmpty()) {
            int removedElement = queue[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println("Element removed from queue: " + removedElement);
        } else {
            System.out.println("Queue is empty, cannot remove element");
        }
    }
 
    public void display() {
        if (!isEmpty()) {
            System.out.print("Elements in queue: ");
            int count = size;
            int i = front;
            while (count > 0) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % capacity;
                count--;
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty");
        }
    }
 
    public boolean isEmpty() {
        return size == 0;
    }
 
    public boolean isFull() {
        return size == capacity;
    }
 
    public static void main(String[] args) {
        Ps94 q = new Ps94(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.display();
    }
}
