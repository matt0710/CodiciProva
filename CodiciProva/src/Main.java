import java.io.*;
import java.util.Scanner;

public class Main {

    public static String[] getDataFromFile (String path) throws FileNotFoundException, IOException {
        File file = new File(path);

        if (file.exists() && file.isFile()){
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String[] arrayFile = new String[3];
            String s = reader.readLine();
            String[] str = s.split(",");

            for (int i=0; i<arrayFile.length; i++){
                arrayFile[i] = str[i];
                //s = reader.readLine();
            }
            reader.close();
            return arrayFile;
        }
        else if (file.exists() && file.isDirectory()){

            File fileDaScrivere = new File(path + "out.txt");
            String[] directory = file.list();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileDaScrivere));

            for (String s : directory)
                writer.write(s + "\n");
            writer.close();
            return null;
        }
        else
            throw new FileNotFoundException();
    }

    public static void main (String args[]){
        LinkedStack<String> stack = new LinkedStack<>();

        LinkedQueue<String> queue = new LinkedQueue<>();
        Generics<String> gen1 = new Generics<>("serpente", 5);
        Generics<String> gen2 = new Generics<>("cobra", 2);
        Generics<String> gen3 = new Generics<>("candela", 8);
        Generics<String> gen4 = new Generics<>("ciola", 10);
        Generics<String> gen5 = new Generics<>("biscotto", 1);

        CircolarArrayQueue<String> arrayQueue = new CircolarArrayQueue<>(5);


        stack.push("hei");
        stack.push("amore");
        stack.push("mio");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println("___________________________");
        System.out.println(stack);

        System.out.println("______________________________________________________________________");

        queue.orederedEnqueue(gen1);
        queue.orederedEnqueue(gen2);
        queue.orederedEnqueue(gen3);

        System.out.println(queue);

        System.out.println("element dequeued: " + queue.dequeue());
        System.out.println("\n\nthe new queue is: \n" + queue);

        queue.orederedEnqueue(gen4);
        queue.orederedEnqueue(gen5);

        System.out.println("\n\nthe stack now is: \n" + queue);

        System.out.println("__________________________________________________________________");

        arrayQueue.enqueue("hei");
        arrayQueue.enqueue("sono");
        arrayQueue.enqueue("bello");
        System.out.println(arrayQueue);

        System.out.println(arrayQueue.dequeue());
        System.out.println("\n\n\n the new circular queue is: \n" + arrayQueue);

        arrayQueue.enqueue("MIAOOOOO");
        arrayQueue.enqueue("BAYUUYYYYY");
        arrayQueue.enqueue("ESKEREEEEEEE");
        System.out.println(arrayQueue);

        System.out.println("_________________________________________________");

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la path: ");
        String path = sc.nextLine();

        LinkedStack<String> listaDaFile = new LinkedStack<>();
        try{
            String[] stringheDaFile = getDataFromFile(path);

            if (stringheDaFile !=null)
                for (String str : stringheDaFile){
                    listaDaFile.push(str);
                }

            System.out.println("LA PILA E': ");
            System.out.println(listaDaFile);
        }catch(FileNotFoundException fnf){
            System.err.println("fnf");
        }catch(IOException io) {
            System.err.println("io");
        }
    }


}
