package com.wenzhi.novel.entity;

import com.wenzhi.novel.entity.baseentity.EssqlBase;
import lombok.Data;

@Data
public class MessageEntity extends EssqlBase {
    private String platformId;
    private String appId;
    private String zoneId;
    private Integer chatChannel;
    private String sender;
    private String senderName;
    private String receiver;
    private String receiverName;
    private String chatInfo;
    private Long rechargeMoney;
    private Integer messageType;
    private Long chatTime;
}
