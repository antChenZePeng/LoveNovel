package com.wenzhi.novel.hardcode;

public class EExceptionCode {

    public enum EErrorCode {

        FAIL(0,"exception"),
        MONGO_UPDATE_NOTDATA(10001, "更新的数据不存在"),
        MONGO_UPDATE_ERROR(10002, "数据库数据更新异常"),
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
