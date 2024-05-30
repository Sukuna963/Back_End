public class Main {

    public static void main(String args[]){

        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
        
        listaEncadeada.add("teste1");
        listaEncadeada.add("teste2");
        listaEncadeada.add("teste3");
        listaEncadeada.add("teste4");

        System.out.println(listaEncadeada.get(0));
        System.out.println(listaEncadeada.get(1));
        System.out.println(listaEncadeada.get(2));
        System.out.println(listaEncadeada.get(3));

        System.out.println(listaEncadeada);
        
        listaEncadeada.remove(3);

        System.out.println(listaEncadeada);
    }

}