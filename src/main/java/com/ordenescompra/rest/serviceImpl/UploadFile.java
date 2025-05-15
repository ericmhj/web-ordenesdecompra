package com.ordenescompra.rest.serviceImpl;

import com.ordenescompra.rest.service.FileConverter;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadFile {

    private final String FOLDER ="src//main//resources//static//images//";
    private final String IMG_DEFAULT="default.jpg";
    private final String URL="http://localhost:8080/images/";

    public String upload(MultipartFile multipartFile) throws IOException {

        if (multipartFile != null){
            byte [] bytes = multipartFile.getBytes();
            //Path path = Paths.get(FOLDER+multipartFile.getOriginalFilename());
            //Files.write(path,bytes);
           FileConverter converterFile= new FileConverter(multipartFile,FOLDER+multipartFile.getOriginalFilename());
            File converted = converterFile.convert();
            converted.setReadable(true);
            converted.setExecutable(true);
            converted.setWritable(true);
            //return URL+multipartFile.getOriginalFilename();
            return converted.getAbsolutePath();
        }
        return URL+IMG_DEFAULT;
    }

    public void delete(String nameFile) {

        File file =  new File(FOLDER+nameFile);

        boolean deleted = file.delete();

    }
}
