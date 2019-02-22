package com.wenzhi.novel.entity.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by ant-chen on 2018/11/6.
 */
@Data
public class BaseRequest {
    @ApiModelProperty(hidden = true)
    String reqTime;
    @ApiModelProperty(hidden = true)
    String ipAddress;
}
