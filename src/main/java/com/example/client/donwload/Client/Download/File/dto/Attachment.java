package com.example.client.donwload.Client.Download.File.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attachment {

    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("fileBytes")
    private String fileBytes;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(String fileBytes) {
        this.fileBytes = fileBytes;
    }

    public Attachment(String fileName, String fileBytes) {
        this.fileName = fileName;
        this.fileBytes = fileBytes;
    }
}
