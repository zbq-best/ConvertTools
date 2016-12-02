package com.ikyxxs.service;

import com.ikyxxs.enums.OperEnum;
import com.ikyxxs.model.EncodeModel;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class EncodeService {

    public EncodeModel handleStr(EncodeModel em) {
        if (null != em) {
            if (em.getOper().equals(OperEnum.ENCODE.getCode())) {
                em.setOutStr(encodeBase64(em.getInStr()));
            } else if (em.getOper().equals(OperEnum.DECODE.getCode())) {
                em.setOutStr(decodeBase64(em.getOutStr()));
            }
        }
        return em;
    }

    /**
     * Base64编码
     *
     * @param plainText
     * @return
     */
    private String encodeBase64(String plainText) {

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
     *
     * @param encodeStr
     * @return
     */
    private String decodeBase64(String encodeStr) {

        if (StringUtils.isBlank(encodeStr)) {
            return encodeStr;
        }

        byte[] b = encodeStr.getBytes();
        Base64 base64 = new Base64();
        b = base64.decode(b);
        return new String(b);
    }
}
