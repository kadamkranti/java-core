package practice;

public class Ps91 {
    private int maxSize;
    private String[] stackArray;
    private int top;
 
    public Ps91(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }
 
    public void push(String value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
            System.out.println("Stack overflow!");
        }
    }
 
    public String pop() {
        if (top >= 0) {
            String value = stackArray[top];
            top--;
            return value;
        } else {
            System.out.println("Stack underflow!");
            return null;
        }
    }
 
    public static void main(String[] args) {
        Ps91 stack = new Ps91(5);
 
        // Pushing elements into the stack
        stack.push("Programming");
        stack.push("java");
        stack.push("world");
        stack.push("Hello");
 
        System.out.print("After Pushing 4 Elements: ");
while (stack.top >= 0) {
            System.out.print(stack.pop() + " ");
        }
 
        // Pop one element
        stack.push("java");
        stack.push("wolrd");
        stack.push("Hello");
        System.out.println("\nAfter a Pop: " + stack.pop() + " " +  stack.pop() + " " + stack.pop());
        
        
        
    }
}
