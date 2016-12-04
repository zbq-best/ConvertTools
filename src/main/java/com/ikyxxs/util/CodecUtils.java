package com.ikyxxs.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

public class CodecUtils {

    /**
     * Base64编码
     */
    public static String encodeBase64(String plainText) {

        if (StringUtils.isBlank(plainText)) {
            return plainText;
        }

        byte[] b = plainText.getBytes();
        Base64 base64 = new Base64();
        b = base64.encode(b);
        return new String(b);
    }

    /**
     * Base64解码
     */
    public static String decodeBase64(String encodeStr) {

        if (StringUtils.isBlank(encodeStr)) {
            return encodeStr;
        }

        byte[] b = encodeStr.getBytes();
        Base64 base64 = new Base64();
        b = base64.decode(b);
        return new String(b);
    }
}
