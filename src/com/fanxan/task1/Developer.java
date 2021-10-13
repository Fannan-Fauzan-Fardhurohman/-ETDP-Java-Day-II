package com.fanxan.task1;

public class Developer extends Employee {
    String githubLink;

    public Developer(String name, int id, String phone, String githubLink) {
        super(name, id, phone);
        this.githubLink = githubLink;
    }

    public void updateGitLink(String gitHubLink) {
        this.githubLink = gitHubLink;
    }

    @Override
    public String getById(int id) {
        if (id == this.id) {
            return "Id: " + this.id + "\nName:" + this.name + "\nPhone: " + this.phone + "\nGithubLink :" + this.githubLink + " ";

        } else {
            return null;
        }
    }
}
