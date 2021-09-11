package designpatterns.creational.factory.ex1_dialog_window;

import designpatterns.creational.factory.ex1_dialog_window.factory.Dialog;
import designpatterns.creational.factory.ex1_dialog_window.factory.HtmlDialog;
import designpatterns.creational.factory.ex1_dialog_window.factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }



}
