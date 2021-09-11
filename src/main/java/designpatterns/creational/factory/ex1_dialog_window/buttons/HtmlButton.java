package designpatterns.creational.factory.ex1_dialog_window.buttons;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test Html Button</button>");
    }

    public void onClick() {
        System.out.println("Click!");
    }
}
