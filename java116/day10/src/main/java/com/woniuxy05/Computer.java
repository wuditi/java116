package com.woniuxy05;

public class Computer {

    private UsbInterface usb;


    public UsbInterface getUsb() {
        return usb;
    }

    public void setUsb(UsbInterface usb) {
        this.usb = usb;
    }

    public void usbwork() {
        usb.work();
    }

}
