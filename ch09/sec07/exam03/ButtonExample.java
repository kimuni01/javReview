package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // creating Ok button object
        Button btnOk = new Button();
        
        // injecting ClickListener impl. object to the Ok button object
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        // clicking the Ok button
        btnOk.click();

        // --------------------------------------------------------------------------------

        // creating the Cancel button object
        Button btnCancel = new Button();

        // injecting ClickListener impl. object to the Cancel button object
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        // clicking the Cancel button
        btnCancel.click();
    }
}
