package cn.liteframework.common.utils;

import org.greenrobot.eventbus.EventBus;

/**
 * Describe：EventBusUtils
 * Created by 吴天强 on 2018/10/22.
 */

public class EventBusUtils {

    /**
     * 注册事件
     */
    public static void register(Object subscriber) {
        EventBus.getDefault().register(subscriber);
    }

    /**
     * 解除事件
     */
    public static void unregister(Object subscriber) {
        EventBus.getDefault().unregister(subscriber);
    }

    /**
     * 发送普通事件
     */
    public static void sendEvent(cn.liteframework.common.bean.Event event) {
        EventBus.getDefault().post(event);
    }
    //...
}
