import adaptee.UsbTypeB;
import adapter.BtoCAdapter;
import adapter.BtoCClassAdapterImpl;
import adapter.BtoCObjectAdapterImpl;

public class Client {
    public static void main(String[] args) {
        //Class Adapter
        BtoCAdapter classAdapter = new BtoCClassAdapterImpl();
        System.out.println("Current USB Type : "+classAdapter.getCType().getType());


        //Object Adapter
        UsbTypeB usbTypeB = new UsbTypeB();
        System.out.println("Current USB Type : "+usbTypeB.getBType().getType());

        BtoCAdapter objectAdapter = new BtoCObjectAdapterImpl(usbTypeB);
        System.out.println("Current USB Type : "+objectAdapter.getCType().getType());
    }
}
