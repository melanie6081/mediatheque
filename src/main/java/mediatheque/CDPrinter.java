package mediatheque;

public class CDPrinter extends CatalogPrinter{
    public CDPrinter(){

    }

    public void visit(CD cd){
        System.out.println(cd);
    }

    public void visit(Book book){
    }
}
