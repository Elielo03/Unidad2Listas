public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SinglyLinkedList lista=new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();
        lista.eliminar(30);
        lista.mostrar();
      

    }
}
