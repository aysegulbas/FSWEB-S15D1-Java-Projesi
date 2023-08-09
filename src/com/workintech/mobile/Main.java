package com.workintech.mobile;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone=new MobilePhone("678998");
        phone.addNewContact(new Contact("ayse","00877666"));
        phone.addNewContact(new Contact("ali","8906544"));
        phone.addNewContact(new Contact("ahmet","8889098"));
        phone.addNewContact(new Contact("ceren","8889098"));
        phone.printContact();
        Contact veli=new Contact("veli","877765");
        phone.addNewContact(veli);
        System.out.println(phone.findContact("veli"));
        System.out.println(phone.queryContact("veli"));
        phone.removeContact(veli);
        phone.printContact();

    }
}
