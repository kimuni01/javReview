package ch09.sec06.exam02;

public class Button {
    // static member interface
    public static interface ClickListener {
        // abstract method
        void onClick();
    }

    // field
    private ClickListener clickListener; // nested interface type field and Setter

    // method
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener; // clickListener is ClickListener impl. object
    }
}
