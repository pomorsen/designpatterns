package designpatterns.creational.simplefactory.ex2_documents_creator.item;

import java.util.HashMap;
import java.util.Map;

public abstract class Item {
    Map<String,String> templates = new HashMap<>();

    abstract void fillTemplates();

    void initTemplates(){
        templates.put("whoCreated", "<<Your login>>");
        templates.put("whenCreated", "<<Creation date>>");
    }

    Map<String,String> getTemplates(){
        return templates;
    }

    void putTemplateValue(String label, String value){
        templates.put(label,value);
    }
}
