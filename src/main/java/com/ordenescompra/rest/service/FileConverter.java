package com.ordenescompra.rest.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileConverter {
    MultipartFile multipartFile;
    String folder;
    public FileConverter( MultipartFile multipartFile, String folder) {
        this.multipartFile = multipartFile;
        this.folder=folder;
    }

    public File convert() throws IOException {

        File file = new File (folder);
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(multipartFile.getBytes());
        fos.close();
        return file;


    }

}
