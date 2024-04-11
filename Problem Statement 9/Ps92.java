package practice;

class Node {
    double data;
    Node next;
 
    Node(double data) {
        this.data = data;
        this.next = null;
    }
}
 
class Stack {
    private Node top;
 
    public Stack() {
this.top = null;
    }
 
    public boolean isEmpty() {
        return top == null;
    }
 
    public void push(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
 
    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            double poppedElement = top.data;
            top = top.next;
            return poppedElement;
        }
    }
 
    public double peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }
 
    public void printStack() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}
 
public class Ps92 {
    public static void main(String[] args) {
        String input = "10.0 20.0 30.0 40.0";
        String[] values = input.split(" ");
 
        Stack stack = new Stack();
 
        for (String value : values) {
            double num = Double.parseDouble(value);
            stack.push(num);
        }
 
        stack.printStack();
        stack.pop();
        stack.pop();
        System.out.print("After popping twice: ");
        stack.printStack();
    }
}

