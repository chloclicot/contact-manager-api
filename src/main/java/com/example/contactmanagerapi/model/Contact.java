package com.example.contactmanagerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Contact {
    private UUID id; //pour avoir un truc unique
    @NonNull
    private String Name;
    private String Surname;
    private String Tel;
    private String email;
    private String  birthday;

    public Contact(
            @JsonProperty("id") UUID id,
            @JsonProperty("name") String name,
            @JsonProperty("surname") String surname,
            @JsonProperty("tel") String tel,
            @JsonProperty("email") String email,
            @JsonProperty("birthday") String birthday) {
        this.id = id;
        Name = name;
        Surname = surname;
        Tel = tel;
        this.email = email;
        this.birthday = birthday;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

  /*
    @Override
    public int compareTo(Object obj) {
        var o = (Contact) obj;
        if(this.getName().equals(o.getName())){
            if(this.getSurname()!=null && o.getSurname()!= null){
                return 0;
            }
            else if(this.getSurname()==null)return 1;
        }
        else return this.getName().compareTo(o.getName());

    }*/

}
