package StackAndQueues;


public class Dstack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    public void push(int data)
    {
        if(size()==capacity)
            expand();
        stack[top]= data;
        top++;

    }
    private void expand() {

    }
    public int pop()
    {
        top--;
        int data;
        if(isEmpty())
        {
            System.out.println("stack is empty");
        }
        data = stack[top];
        stack[top] = 0;
        return data;
    }
    public int peek()
    {

        int data;
        data = stack[top-1];
        return data;
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top < 0;
    }
    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n +" ");
        }
    }
}

