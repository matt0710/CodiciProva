import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack<E> {
    private LinkedList<E> linkedStack = new LinkedList<>();

    public LinkedStack(){}
    public LinkedStack(LinkedList<E> linkedStack){
        this.linkedStack = linkedStack;
    }

    public void push (E element){
        this.linkedStack.addFirst(element);
    }

    public E pop (){
        E removed = this.linkedStack.remove();
        return removed;
    }

    public E top (){
        return this.linkedStack.getFirst();
    }

    public int size(){return this.linkedStack.size();}

    public boolean isEmpty (){return size()==0;}

    public LinkedList<E> getLinkedStack() {
        return linkedStack;
    }

    public void setLinkedStack(LinkedList<E> linkedStack) {
        this.linkedStack = linkedStack;
    }

    public String toString(){
        Iterator<E> iter = this.linkedStack.iterator();
        StringBuilder s = new StringBuilder();

        while (iter.hasNext())
            s.append(iter.next() + "\n");
        return s.toString();
    }
}
