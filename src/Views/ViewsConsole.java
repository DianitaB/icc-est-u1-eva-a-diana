package Views;
import.package Book;

public class ViewsConsole {
    public void printBooksArray (Book [] libros){
        for (Book libro : libros){
            System.out.println(libro);
        }
    }
    public void mostrarMensaje (Book [] libros, String message){
        System.out.println(message);
    }
}
