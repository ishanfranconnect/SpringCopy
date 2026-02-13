package com.sp;

public class Address {
    private String city;
    private String state;
    private String country;

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setState(String state){
        this.state=state;
    }
    public String setState(){
        return state;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String setCountry(){
        return country;
    }

    public String toString(){
        return "Address [city="+city+",state="+state+",country="+country+"]";
    }

    public Address(String country,String city,String state){
        super();
        this.country=country;
        this.city=city;
        this.state=state;
    }
    public Address(){
        super();
    }
}
