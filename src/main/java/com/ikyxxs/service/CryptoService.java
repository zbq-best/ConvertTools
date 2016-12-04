package com.ikyxxs.service;

import com.ikyxxs.model.CryptoModel;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class CryptoService {

    /**
     * MD5加密
     */
    public CryptoModel handleByMD5(CryptoModel cm) {
        if (null != cm && StringUtils.isNotEmpty(cm.getInStr())) {
            cm.setOutStr(DigestUtils.md5Hex(cm.getInStr()));
        }
        return cm;
    } 
}
