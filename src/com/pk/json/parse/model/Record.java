package com.pk.json.parse.model;

import java.util.List;

public class Record {

    private String id;

    private String created_at;

    private String updated_at;

    private String company;

    private CustomFiledValues custom_field_values;

    private List<String> emails;

    private String firstname;

    private String gender;

    private List<String> home_phones;

    private List<String> identity_ids;

    private String lastname;

    private List<String> mobile_phones;

    private String notes;

    private boolean read_only;

    private List<String> tag_ids;

    private String avatar_url;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public CustomFiledValues getCustom_field_values() {
        return custom_field_values;
    }

    public void setCustom_field_values(CustomFiledValues custom_field_values) {
        this.custom_field_values = custom_field_values;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHome_phones() {
        return home_phones;
    }

    public void setHome_phones(List<String> home_phones) {
        this.home_phones = home_phones;
    }

    public List<String> getIdentity_ids() {
        return identity_ids;
    }

    public void setIdentity_ids(List<String> identity_ids) {
        this.identity_ids = identity_ids;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<String> getMobile_phones() {
        return mobile_phones;
    }

    public void setMobile_phones(List<String> mobile_phones) {
        this.mobile_phones = mobile_phones;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isRead_only() {
        return read_only;
    }

    public void setRead_only(boolean read_only) {
        this.read_only = read_only;
    }

    public List<String> getTag_ids() {
        return tag_ids;
    }

    public void setTag_ids(List<String> tag_ids) {
        this.tag_ids = tag_ids;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", company='" + company + '\'' +
                ", custom_field_values=" + custom_field_values +
                ", emails=" + emails +
                ", firstname='" + firstname + '\'' +
                ", gender='" + gender + '\'' +
                ", home_phones=" + home_phones +
                ", identity_ids=" + identity_ids +
                ", lastname='" + lastname + '\'' +
                ", mobile_phones=" + mobile_phones +
                ", notes='" + notes + '\'' +
                ", read_only=" + read_only +
                ", tag_ids=" + tag_ids +
                ", avatar_url='" + avatar_url + '\'' +
                '}';
    }
}
