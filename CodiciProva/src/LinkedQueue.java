import java.util.LinkedList;

public class LinkedQueue<E> {
    private LinkedList<Generics<E>> queue = new LinkedList<>();

    public LinkedQueue(){}

    public void orederedEnqueue(Generics generics){

        for (int i=0; i<this.queue.size(); i++){
            if (this.queue.get(i).getPriority() > generics.getPriority()) {
                this.queue.add(i, generics);
                return;
            }
        }
        this.queue.add(generics);
    }

    public Generics dequeue(){
        return this.queue.remove();
    }

    public Generics first(){
        return this.queue.getFirst();
    }

    public int size(){
        return this.queue.size();
    }
    public boolean isEmpty(){
        return size()==0;
    }

    public LinkedList<Generics<E>> getQueue() {
        return queue;
    }

    public void setQueue(LinkedList<Generics<E>> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (Generics generics : this.queue)
            s.append(generics + "\n");
        return s.toString();
    }
}
