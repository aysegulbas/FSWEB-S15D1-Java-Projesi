package com.workintech.mobile;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;
    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        myContacts=new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
        //contact isimli arraylisti biz kendimiz oluşturduk, contains için
        //eşitliğin kontrolü için bizim javaya bu parametre eşitse eşitlik sağlanır dememiz gerekir
        //bunun için equals metodunu belirlediğimiz parametre için ezmemiz lazım
        //marketcar'da contains için Stringlerin eşitliğine baktık, orda gerekli değildi.
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;

        }
        return false;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(myContacts.contains(oldContact)){
            oldContact.setName(newContact.getName());//sakın oldContact=newContact yazma, obje eşitliği(refersad eşitliği) Javada en büyük hata.biz referans nyu değil, valuesunu eşitlemek isityoruz
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            return true;
        }return false;
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;

        }return false;
    }
    public int findContact(Contact contact){
        return myContacts.indexOf(contact);//yoksa otomatik -1 döner
    }
    public int findContact(String contactName){

        //   myContacts.contains diyemeyiz çünkü mycontact arraylist tipinde bizim parametre string
        for(Contact contact:myContacts){
            if(contact.getName().equals(contactName)){
                return myContacts.indexOf(contact);
            }
        }return -1;

    }
    public Contact queryContact(String contactName){
        for(Contact contact:myContacts){
            if(contact.getName().equals(contactName)){
                return contact;
            }
        }return null;
    }
    public void printContact(){
        for(int i=0;i<myContacts.size();i++){
            System.out.println(i+"."+myContacts.get(i).getName()+"=>"+myContacts.get(i).getPhoneNumber());
        }
    }
}
