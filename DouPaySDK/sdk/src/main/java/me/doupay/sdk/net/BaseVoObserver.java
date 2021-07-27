package me.doupay.sdk.net;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import me.doupay.sdk.net.exception.ApiException;

/**
 *
 */
public class BaseVoObserver<D> implements Observer<BaseVo<D>> {

    public BaseVoObserver() {
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onComplete() {

    }

    @Override
    public synchronized void onError(Throwable e) {
        //统一处理错误
        String msg = ApiException.handlerException(e).getMsg();
        int errorCode = ApiException.handlerException(e).getErrorCode();
        String url = ApiException.handlerException(e).getUrl();
        if (msg != null && msg.length() > 6400) {
            msg = msg.substring(0, 6400);
        }

        onError(errorCode, msg);
    }

    /**
     * 返回错误字符串
     */
    public void onError(int errorCode, String msg) {

    }


    @Override
    public void onNext(BaseVo<D> deBaseVo) {
        if (deBaseVo.getCode() != 200) {
            onError(new ApiException.ServerException(deBaseVo.getCode(), deBaseVo.getMsg(), ""));
            return;
        }
        System.out.println(deBaseVo.getMsg());
        onPlaintextSuccess(deBaseVo.getData());
    }


    public void onPlaintextSuccess(D data) {
    }

}
