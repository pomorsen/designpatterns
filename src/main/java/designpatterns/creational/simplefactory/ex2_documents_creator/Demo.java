package designpatterns.creational.simplefactory.ex2_documents_creator;

import designpatterns.creational.simplefactory.ex2_documents_creator.item.Item;
import designpatterns.creational.simplefactory.ex2_documents_creator.producer.AttachmentProducer;
import designpatterns.creational.simplefactory.ex2_documents_creator.producer.DocumentProducer;
import designpatterns.creational.simplefactory.ex2_documents_creator.producer.NoteProducer;

public class Demo {
    public static void main(String[] args) {

        DocumentProducer documentProducer = new DocumentProducer();
        Item document = documentProducer.createItem();

        AttachmentProducer attachmentItemProducer = new AttachmentProducer();
        Item attachment = attachmentItemProducer.createItem();

        NoteProducer noteItemProducer = new NoteProducer();
        Item note = noteItemProducer.createItem();
    }
}
