package com.wenzhi.novel.hardcode;

public class EReturnCode {

    public enum EErrorCode {

        OK(1,"ok"),
        FAIL(0,"fail"),
        GAME_CLOSED(100001,"该游戏已关闭监控"),
        ;

        public final int status;
        public final String desc;

        private EErrorCode(int status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        public String getCodeStr() {
            return String.valueOf(this.status);
        }

        public String getDesc() {
            return this.desc;
        }
    }

}
