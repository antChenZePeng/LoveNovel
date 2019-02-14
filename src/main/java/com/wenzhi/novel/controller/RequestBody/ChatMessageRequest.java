package com.wenzhi.novel.controller.RequestBody;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class ChatMessageRequest extends BaseRequest {
    private String platformId;
    private String appId;
    private String zoneId;
    private String chatChannel;
    private String chatChannelName;
    private String sender;
    private String senderName;
    private String receiver;
    private String receiverName;
    private String chatInfo;
    private String rechargeMoney;
    private String messageType;
    private String chatTime;
    private String sign;

    public String checkValue(){
        if(StringUtils.isBlank(this.platformId)){
            return "平台id不能为空";
        }
        if(StringUtils.isBlank(this.appId)){
            return "游戏id不能为空";
        }
        if(StringUtils.isBlank(this.zoneId)){
            return "区服id不能为空";
        }
        if(StringUtils.isBlank(this.chatChannel)){
            return "聊天频道号不能为空";
        }
        if(!StringUtils.isNumeric(this.chatChannel)){
            return "聊天频道号必须为数字";
        }
        if(StringUtils.isBlank(this.chatChannelName)){
            return "聊天频道名字不能为空";
        }
        if(StringUtils.isBlank(this.sender)){
            return "发送人id不能为空";
        }
        if(StringUtils.isBlank(this.chatInfo)){
            return "聊天内容不能为空";
        }
        if(StringUtils.isBlank(this.rechargeMoney)){
            return "累充金额不能为空";
        }
        if(!StringUtils.isNumeric(this.rechargeMoney)){
            return "累充金额必须为数字";
        }
        if(StringUtils.isBlank(this.messageType)){
            return "消息类型不能为空";
        }
        if(!StringUtils.isNumeric(this.messageType)){
            return "消息类型必须为数字";
        }
        if(StringUtils.isBlank(this.chatTime)){
            return "消息时间不能为空";
        }
        if(!StringUtils.isNumeric(this.chatTime)){
            return "消息时间必须为数字";
        }
        if(StringUtils.isBlank(this.sign)){
            return "验证签名不能为空";
        }
        return null;
    }
}
