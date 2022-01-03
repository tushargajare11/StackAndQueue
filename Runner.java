package StackAndQueues;

public class Runner {

    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(15);
        st.show();
        st.push(2);
        st.push(11);
        st.show();
        st.push(8);
        st.show();
        st.push(89);
        st.show();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println("the size is"+st.size());
        System.out.println("the size is"+st.isEmpty());
        st.show();
    }
}

