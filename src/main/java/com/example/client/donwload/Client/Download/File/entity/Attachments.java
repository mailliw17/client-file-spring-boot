package com.example.client.donwload.Client.Download.File.entity;


import javax.persistence.OneToMany;
import java.util.List;

public class Attachments {
    @OneToMany
    private List<Attachment> attachments;

    public Attachments() {
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}
