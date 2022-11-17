package chapters.chapter_11;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    private ArrayList<Object> stack ;

    public MyStack() {
        stack = new ArrayList<>();
    }
    public boolean empty(){
        return stack.isEmpty();
    }
    public Object peek(){
        return stack.get(0);
    }

    public void push(Object ob){
        stack.add(0, ob);
    }
    public Object pop(){
        Object obj = stack.get(0);
        stack.remove(0);
        return obj;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
