package designpatterns.creational.factory.ex1_dialog_window.factory;

import designpatterns.creational.factory.ex1_dialog_window.buttons.Button;
import designpatterns.creational.factory.ex1_dialog_window.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
