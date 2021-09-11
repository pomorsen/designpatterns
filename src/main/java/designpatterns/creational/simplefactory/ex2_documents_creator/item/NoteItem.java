package designpatterns.creational.simplefactory.ex2_documents_creator.item;

public class NoteItem extends Item {
    @Override
    public void fillTemplates() {
        templates.put("content", "<<Please write your notes here>>");
    }
}
