public class CircolarArrayQueue<E> {
    private E[] array;
    private int n;
    private int sz;
    private int f;

    public CircolarArrayQueue (){}
    public CircolarArrayQueue (E[] array){
        this.array = array;
    }
    public CircolarArrayQueue (int capacity){
        this.array = (E[]) new Object[capacity];
        this.n = capacity;
    }

    public int size(){
        return this.sz;
    }

    public boolean isEmpty (){
        return size()==0;
    }

    public void enqueue (E element) throws IllegalStateException{

        if (size() == this.n)
            throw new IllegalStateException("queue is full!");
        this.n = this.array.length;

        int r = (f + sz)%n;
        this.array[r] = element;
        this.sz++;

    }

    public E dequeue (){
        if (isEmpty())
            return null;
        E removed = this.array[f];
        this.array[f] = null;
        this.f = (f+1)%n;
        this.sz--;
        return removed;
    }

    public E first (){
        return this.array[f];
    }

    public String toString(){
        String s = "";

        for (E element : this.array)
            s += element + "\n";

        return s;
    }
}
