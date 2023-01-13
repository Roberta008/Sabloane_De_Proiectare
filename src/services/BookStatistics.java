package services;

import models.*;

public class BookStatistics implements Visitor {
    private int nrimagini;
    private int nrparagrafe;
    private int nrtabela;
    @Override
    public void visitBook(Book b) {

    }

    @Override
    public void visitSection(Section s) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tc) {

    }

    @Override
    public void visitParagraph(Paragraph p) {
        this.nrparagrafe=nrparagrafe+1;
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
    this.nrimagini=nrimagini+1;
    }

    @Override
    public void visitImage(Image i) {
    this.nrimagini=nrimagini+1;
    }

    @Override
    public void visitTable(Table t) {
    this.nrtabela=nrtabela+1;
    }
    public void printStatistics()
    {
        System.out.println("models.Book Statistics:");
        System.out.println("* * * Number of images: "+this.nrimagini);
        System.out.println("* * * Number of tables: "+this.nrtabela);
        System.out.println("* * * Number of paragraphs: "+this.nrparagrafe);
    }
}
