package designpatterns.creational.simplefactory.ex2_documents_creator.producer;

import designpatterns.creational.simplefactory.ex2_documents_creator.item.Item;

public interface ItemProducer {
    Item createItem();
}
