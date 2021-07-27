package me.doupay.sdk;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import me.doupay.sdk.sign.AES;


public class AESTest {

    @Test
    public void sign() {
        String timeStamp = "1610697341483";
        String appId = "502808ee5427490abb40375022e28578";
        String secret = "c67100f61bfc684a8a288190026b53fb";

        // JDK 151 之前需要下载 JCE   https://stackoverflow.com/questions/6481627/java-security-illegal-key-size-or-default-parameters
        String advancedPermissionsSign = AES.Encrypt(appId + timeStamp, secret);
        System.out.println(advancedPermissionsSign);

    }
}
