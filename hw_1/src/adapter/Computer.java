package adapter;

public class Computer {

    public void readFrom(IUsb usb) {
        usb.connect();
        System.out.println("Computer reads data");

    }
}
