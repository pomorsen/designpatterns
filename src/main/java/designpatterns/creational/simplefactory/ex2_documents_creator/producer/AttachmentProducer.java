package designpatterns.creational.simplefactory.ex2_documents_creator.producer;

import designpatterns.creational.simplefactory.ex2_documents_creator.item.AttachItem;
import designpatterns.creational.simplefactory.ex2_documents_creator.item.Item;

public class AttachmentProducer implements ItemProducer {
    @Override
    public Item createItem() {
        AttachItem attachItem = new AttachItem();
        attachItem.fillTemplates();
        return attachItem;
    }
}
