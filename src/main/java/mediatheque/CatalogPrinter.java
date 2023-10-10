package mediatheque;

public class CatalogPrinter implements ItemVisitor{
    public CatalogPrinter(){}

    public void visit(CD cd){
        System.out.println(cd);
    }

    public void visit(Book book){
        System.out.println(book);
    }
}
