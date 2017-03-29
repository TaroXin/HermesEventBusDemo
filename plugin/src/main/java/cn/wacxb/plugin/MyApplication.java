package cn.wacxb.plugin;

import android.app.Application;

import xiaofei.library.hermeseventbus.HermesEventBus;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 第一个参数是 context, 第二个参数是 MainAPP 的包名
        HermesEventBus.getDefault().connectApp(this, "cn.wacxb.hermeseventbusdemo");

    }

}
