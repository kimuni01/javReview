package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // creating Ok button object
        Button btnOk = new Button();

        // ClickListener impl. class(local class) that would handle the
        // Ok button click event
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        // injecting the ClickListener impl. oject to the Ok button object
        btnOk.setClickListener(new OkListener());

        // clicking the Ok button
        btnOk.click();
        // --------------------------------------------------------------------------------

        // creating the Cancel button object
        Button btnCancel = new Button();

        // ClickListener impl. class(local class) that would handle the
        // Cancel button click event
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        // injecting the ClickListener impl. object to the Cancel button object
        btnCancel.setClickListener(new CancelListener());

        // clicking the Cancel button
        btnCancel.click();
    }
}
