package com.pk.json.parse.model;

public class CustomFiledValues {

    private String smartcard_id;

    private String district;

    private String township;

    private String street_name;

    public String getSmartcard_id() {
        return smartcard_id;
    }

    public void setSmartcard_id(String smartcard_id) {
        this.smartcard_id = smartcard_id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    @Override
    public String toString() {
        return "CustomFiledValues{" +
                "smartcard_id='" + smartcard_id + '\'' +
                ", district='" + district + '\'' +
                ", township='" + township + '\'' +
                ", street_name='" + street_name + '\'' +
                '}';
    }
}
