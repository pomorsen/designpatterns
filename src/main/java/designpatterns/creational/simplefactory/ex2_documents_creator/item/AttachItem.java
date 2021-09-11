package designpatterns.creational.simplefactory.ex2_documents_creator.item;

public class AttachItem extends Item {
    @Override
    public void fillTemplates() {
        templates.put("name", "");
        templates.put("extension", "");
        templates.put("fullName", "");
    }
}
