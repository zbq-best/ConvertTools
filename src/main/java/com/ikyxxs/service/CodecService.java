package com.ikyxxs.service;

import com.ikyxxs.enums.OperEnum;
import com.ikyxxs.model.CodecModel;
import org.springframework.stereotype.Service;

import static com.ikyxxs.util.CodecUtils.*;

@Service
public class CodecService {

    /**
     * 通过Base64处理字符串
     */
    public CodecModel handleByBase64(CodecModel em) {
        if (null != em) {
            if (em.getOper().equals(OperEnum.ENCODE.getCode())) {
                em.setOutStr(encodeBase64(em.getInStr()));
            } else if (em.getOper().equals(OperEnum.DECODE.getCode())) {
                em.setOutStr(decodeBase64(em.getOutStr()));
            }
        }
        return em;
    }
}
