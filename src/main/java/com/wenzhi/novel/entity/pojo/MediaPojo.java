package com.wenzhi.novel.entity.pojo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MediaPojo {
    private MultipartFile pictureFile;
    private String domainPath;
    private String dirPath;
    private String fileName;
    private Integer mediaType;
}
