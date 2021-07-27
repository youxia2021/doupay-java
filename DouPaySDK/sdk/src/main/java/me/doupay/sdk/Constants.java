package me.doupay.sdk;

import me.doupay.sdk.net.Language;

public class Constants {
    private static Constants constants;
    public static boolean openSysLog = false;
    public static  String basrUrl = "http://192.168.10.129:9000/";
    public static Language language = Language.en_US;

    public static Constants getInstance() {
        if (constants == null) {
            constants = new Constants();
        }
        return constants;
    }

    public static String getBasrUrl() {
        return basrUrl;
    }

    public static void setBasrUrl(String basrUrl) {
        Constants.basrUrl = basrUrl;
    }

    /**
     *
     * @param secret secket
     * @param privateKey privateKey
     * @param appId appid
     * @param expireTime 过期时间,以秒为单位,eg:30分钟有效期,就传"60*30"
     */
    public void init(String secret, String privateKey,String publicKey, String appId,String expireTime) {
        Constants.secret = secret;
        Constants.privateKey = privateKey;
        Constants.appId = appId;
        Constants.expireTime = expireTime;
        Constants.publicKey = publicKey;
    }

    private static String secret = "";
    private static String privateKey = "";
    private static String appId = "";
    private static String expireTime = "";
    private static String publicKey = "";

    public static String getSecret() {
        return secret;
    }

    public static String getPrivateKey() {
        return privateKey;
    }

    public static String getAppId() {
        return appId;
    }
    public static String getPublicKey() {
        return publicKey;
    }
    public static String getExpireTime() {
        return expireTime;
    }

    public boolean isInitAllParameters() {
        return Constants.getAppId()!= null && Constants.getExpireTime() != null && Constants.getPrivateKey() != null && Constants.getSecret() != null &&  !Constants.getAppId().isEmpty() && !Constants.getExpireTime().isEmpty() && !Constants.getPrivateKey().isEmpty() && !Constants.getSecret().isEmpty();
    }

}
