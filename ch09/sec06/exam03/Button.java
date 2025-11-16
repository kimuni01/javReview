package ch09.sec06.exam03;

public class Button {
    // static member interface
    public static interface ClickListener {
        // abstract method
        void onClick();
    }

    // field
    private ClickListener clickListener;

    // method
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() { // declaring a method that would run when a Button is clicked
        this.clickListener.onClick();
    }
}
