package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        //mediatheque.printCatalog();
        //mediatheque.printOnlyBooks();
        //mediatheque.printOnlyCDs();
        ItemVisitor v= new CatalogPrinter();
        ItemVisitor vCD= new CDPrinter();
        ItemVisitor vBook= new BookPrinter();

        for (Item i : mediatheque.liste()){
            i.accept(v);
        }

        for (Item i : mediatheque.liste()){
            i.accept(vCD);
        }

        for (Item i : mediatheque.liste()){
            i.accept(vBook);
        }

    }
}
