package com.fanxan.task1;

public class Employee {
    String name;
    int id;
    String phone;


    public Employee(String name, int id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }



    public boolean updatePhone (String phone){
        this.phone = phone;
        return true;
    }


    public String getById(int id) {
        if (id == this.id) {
            return "Id: "+this.id+"\nName:"+this.name+"\nPhone: "+this.phone+"";
        } else {
            return null;
        }
    }


}
