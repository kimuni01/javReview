package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // declaring RemoteControl interface variable AND assigning the impl. object
        RemoteControl rc = new SmartTelevision();
        // only the abstract methods declared on the RemoteControl interface can be called
        rc.turnOn();
        rc.turnOff();
        // rc.search("123");

        // declaring Searchable interface variable AND assigning the impl. object
        Searchable searchable = new SmartTelevision();
        // only the abstract methods declared on the Searchable interface can be called
        searchable.search("https://youtube.com");
    }
}
