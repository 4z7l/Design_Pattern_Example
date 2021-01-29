package adapter;

import adaptee.Usb;
import adaptee.UsbTypeB;

public class BtoCClassAdapterImpl extends UsbTypeB implements BtoCAdapter{
    @Override
    public Usb getCType() {
        return convertType(getBType(), "C");
    }

    private Usb convertType(Usb usb, String type){
        usb.setType(type);
        return usb;
    }
}
