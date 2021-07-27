package com.sdk.example.utils;

import org.hashids.Hashids;

/**
 * https://blog.csdn.net/qq_36938617/article/details/97189323
 */
public class HashIdsUtil {

    public static void main(String[] args) {
        Hashids hashids = new Hashids("ZF202107230311223560475478");
        String encodeHex = hashids.encodeHex("ZF202107230311223560475478");
        System.out.println(encodeHex);
        String decodeHex = hashids.decodeHex(encodeHex);
        System.out.println(decodeHex);
    }
}
