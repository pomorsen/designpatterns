package designpatterns.creational.factory.ex1_dialog_window.factory;

import designpatterns.creational.factory.ex1_dialog_window.buttons.Button;
import designpatterns.creational.factory.ex1_dialog_window.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
