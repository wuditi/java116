package com.wn.day33.file;

import com.wn.day33.utils.Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
public class InputFile {

    @RequestMapping("inputFile")
    public Utils inputFile(MultipartFile multipartFile) {
        String filename = multipartFile.getOriginalFilename();
        System.out.println(filename);
        long size = multipartFile.getSize();
        System.out.println(size);
        return Utils.Ok();
    }


}




