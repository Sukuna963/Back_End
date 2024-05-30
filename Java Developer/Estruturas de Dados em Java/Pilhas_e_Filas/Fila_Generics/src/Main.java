public class Main {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.enqueue(new No(1));
        fila.enqueue(new No(2));
        fila.enqueue(new No(3));
        fila.enqueue(new No(4));
        System.out.println(fila);

        System.out.println("----");
        System.out.println(fila.dequeue());


        System.out.println("----");
        System.out.println(fila);


        System.out.println("----");
        fila.enqueue(new No(5));
        System.out.println(fila);

        
        System.out.println("----");
        System.out.println(fila.first());


        System.out.println("----");
        System.out.println(fila);
    }
}
