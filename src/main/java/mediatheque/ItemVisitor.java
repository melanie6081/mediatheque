package mediatheque;

public interface ItemVisitor {
    void visit(Book m);
    void visit(CD m);
}
