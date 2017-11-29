package com.hla.autocomplete.model;
import com.google.android.gms.maps.model.LatLng;
/**
 * Created by gopinath on 29/11/17.
 */

public class ContactDetails {

    String name,phoneno,address;
    LatLng lng;

    public ContactDetails(String name, String phoneno, String address, LatLng lng) {
        this.name = name;
        this.phoneno = phoneno;
        this.address = address;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LatLng getLng() {
        return lng;
    }

    public void setLng(LatLng lng) {
        this.lng = lng;
    }
}
