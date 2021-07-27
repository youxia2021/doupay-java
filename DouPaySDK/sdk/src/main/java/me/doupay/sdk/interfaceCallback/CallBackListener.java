package me.doupay.sdk.interfaceCallback;

public interface CallBackListener<T> {

    void onFinish(T data);
    void onError(int errorCode,String msg);

}
