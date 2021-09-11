package designpatterns.creational.simplefactory.ex2_documents_creator.producer;

import designpatterns.creational.simplefactory.ex2_documents_creator.item.DocumentItem;
import designpatterns.creational.simplefactory.ex2_documents_creator.item.Item;

public class DocumentProducer implements ItemProducer {

    @Override
    public Item createItem() {
        DocumentItem documentItem = new DocumentItem();
        documentItem.fillTemplates();
        return documentItem;
    }
}
