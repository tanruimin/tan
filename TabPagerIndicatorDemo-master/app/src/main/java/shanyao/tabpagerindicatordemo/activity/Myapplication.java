package shanyao.tabpagerindicatordemo.activity;

import android.app.Application;

import org.xutils.x;



public class Myapplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
