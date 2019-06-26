public class Generics<E> {
    private E element;
    private int priority;

    public Generics (){}
    public Generics (E element, int priority){
        this.element = element;
        this.priority = priority;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String toString (){
        return "Elemento: " + this.element + ", \tpriorità: " + this.priority;
    }
}
