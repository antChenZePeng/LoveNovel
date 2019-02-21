package com.wenzhi.novel.hardcode;

/**
 * 图片枚举
 */
public class EImage {

    public enum EImageType{
        ln_banner(1, "ln_banner"),
        ln_cover(2, "ln_cover"),
        ;

        public final int status;
        public final String desc;

        private EImageType (int status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        public static String getDesc(int status) {
            for (EImage.EImageType eImageType : values()) {
                if (status == eImageType.status)
                    return eImageType.desc;
            }
            return ""+status;
        }
    }

}
