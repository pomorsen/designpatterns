package designpatterns.creational.simplefactory.ex2_documents_creator.item;

public class DocumentItem extends Item {
    @Override
    public void fillTemplates() {
        templates.put("title", "<>");
        templates.put("content", "<>");
    }
}
