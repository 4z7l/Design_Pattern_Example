package adapter;

import adaptee.Usb;
import adaptee.UsbTypeB;

public class BtoCObjectAdapterImpl implements BtoCAdapter {

    private UsbTypeB usbTypeB;

    public BtoCObjectAdapterImpl(UsbTypeB usbTypeB) {
        this.usbTypeB = usbTypeB;
    }

    @Override
    public Usb getCType() {
        return convertType(usbTypeB.getBType(), "C");
    }

    private Usb convertType(Usb usb, String type){
        usb.setType(type);
        return usb;
    }
}
