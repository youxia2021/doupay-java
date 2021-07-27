package com.sdk.example.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 序列数字生成工具类(生成订单号等类似号码)
 */
@Slf4j
public class OrderCodeUtil {

    /**
     * 订单号生成
     * 规则:OCL+年月日时分秒毫秒+7位随机数
     *
     * @param prefix 前缀标识
     * @return prefix + 201908241200591231234567
     */
    public static String getOrderCode(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            prefix = "";
        }
        LocalDateTime now = LocalDateTime.now();
        StringBuffer sb = new StringBuffer();
        // 格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        // 随机7位数字
        String nonce = RandomStringUtils.randomNumeric(7);
        String billCode = sb
                .append(prefix)
                .append(now.format(dtf))
                .append(nonce).toString();
        log.debug("当前生成的订单号:" + billCode);
        return billCode;
    }

}
