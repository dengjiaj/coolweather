package main.coolweather.util;

/**
 * Created by Administrator on 2017/4/24.
 */
public interface HttpCallbackListener {
    void onFinlish(String response);
    void onError(Exception e);
}
