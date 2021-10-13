package com.fanxan.task1;

public class Designer extends Employee{
    String dribbleLink;

    public Designer(String name, int id, String phone, String dribbleLink) {
        super(name, id, phone);
        this.dribbleLink = dribbleLink;
    }

    public void updateDribbleLink(String dribbleLink) {
        this.dribbleLink = dribbleLink;
    }


    @Override
    public String getById(int id) {
        if (id == this.id) {
            return "Id: " + this.id + "\nName:" + this.name + "\nPhone: " + this.phone + "\nDribble Link :" + this.dribbleLink + " ";

        } else {
            return null;
        }
    }

}
