package mediatheque;

public class BookPrinter extends CatalogPrinter{
    public BookPrinter(){

    }

    public void visit(Book book){
        System.out.println(book);
    }

    public void visit(CD cd){
    }
}
