package com.example.client.donwload.Client.Download.File.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.OneToMany;
import java.util.List;

public class Attachments {
    @OneToMany
    private List<Attachment> attachments;

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Attachments() {
    }
}
