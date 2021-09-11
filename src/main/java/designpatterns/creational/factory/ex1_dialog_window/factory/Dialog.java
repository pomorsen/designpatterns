package designpatterns.creational.factory.ex1_dialog_window.factory;

import designpatterns.creational.factory.ex1_dialog_window.buttons.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();

}
