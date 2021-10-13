package com.fanxan.task1;

public class Main {
    public static void main(String[] args) {
        Employee employe = new Employee("pegawai-1", 1, "222222");

        if (employe.updatePhone("0811")) {
            System.out.println(employe.getById(1) +"\n");
        }

        // Developer
        Developer developer = new Developer("Fannan", 2, "+8989898989", "https:github");
        developer.updateGitLink("https://github.com/developer-1");
        if (developer.updatePhone("08212")) {
            System.out.println(developer.getById(2) +"\n");
        }


//        Designer
        Designer designer = new Designer("sss", 3, "+0898989898", "http:dribble");
        designer.updateDribbleLink("https://update_dribble");
        if (employe.updatePhone("0811")) {
            System.out.println(designer.getById(3) +"\n");
        }

    }
}
