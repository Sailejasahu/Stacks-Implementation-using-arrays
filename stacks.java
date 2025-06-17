class Stack{
   int a[]=new int[5];
    int top = -1;

    public void push(int coachID) {
        if (top == a.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        if (isDuplicate(coachID)) {
            System.out.println("Coach ID " + coachID + " already exists in the stack");
            return;
        }
         if (top != -1 && isFreightCoach(a[top]) && isPassengerCoach(coachID)) {
        System.out.println("Cannot add passenger coach " + coachID + " on top of freight coach " + a[top]);
        return;
    }


    a[++top] = coachID;
    System.out.println("Pushed coach ID: " + coachID);


       
        
        
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped coach ID: " + a[top--]);
    }
    public boolean isDuplicate(int coachID) {
        for (int i = 0; i <= top; i++) {
            if (a[i] == coachID) {
                return true;
            }
        }
        return false;
    }
    public  boolean isFreightCoach(int coachID) {
        return coachID==2||coachID==4||coachID==6;

    } 
    public boolean isPriority(int coachID){
        return coachID==1||coachID==3||coachID==5;
    }
    public boolean isPassengerCoach(int coachID) {
        if (top==2||top==4||top==6) {
            return true;
        } 
        return false;

    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top coach ID: " + a[top]);
    }

    public boolean isFull() {
        return top == a.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements from top to bottom:");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }



}
public class stacks{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(9);
        stack.display();
        stack.peek();
        stack.pop();
        stack.display();
    }
}