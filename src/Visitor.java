public interface Visitor {
    void visitBook(Book a);
    void visitSection(Section a);
    void visitTableOfContents(TableOfContents a);
    void visitParagraph(Paragraph a);
    void visitImageProxy(ImageProxy a);
    void visitImage(Image a);
    void visitTable(Table a);
}
