package chapters.chapter_13;

import chapters.chapter_11.MyStack;

import java.util.ArrayList;

public class MyStackCloneable extends ArrayList implements Cloneable {

    private ArrayList<Object> stack ;

    public MyStackCloneable() {
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
    public Object clone() {
        MyStackCloneable newStack = (MyStackCloneable) super.clone();
        newStack.stack = cloneList();
        return newStack;
    }
    private ArrayList<Object> cloneList(){
            ArrayList<Object> cloneList = new ArrayList<>();
            for (int i = 0; i < stack.size(); i++)
                cloneList.add(stack.get(i));
            return cloneList;
        }

    @Override
    public String toString() {
        return stack.toString();
    }
}
