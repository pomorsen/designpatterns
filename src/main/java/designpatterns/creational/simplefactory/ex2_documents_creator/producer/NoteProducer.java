package designpatterns.creational.simplefactory.ex2_documents_creator.producer;

import designpatterns.creational.simplefactory.ex2_documents_creator.item.Item;
import designpatterns.creational.simplefactory.ex2_documents_creator.item.NoteItem;

public class NoteProducer implements ItemProducer {
    @Override
    public Item createItem() {
        NoteItem noteItem = new NoteItem();
        noteItem.fillTemplates();
        return noteItem;
    }
}
