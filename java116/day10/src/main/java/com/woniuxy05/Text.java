package com.woniuxy05;

public class Text {
    public static void main(String[] args) {
        UsbInterface usbInterface = new UsbMouse();
        Computer computer = new Computer();
        computer.setUsb(usbInterface);
        computer.usbwork();
        UsbInterface usbInterface1 = new UsbKeyWord();
        computer.setUsb(usbInterface1);
        computer.usbwork();
    }
}
