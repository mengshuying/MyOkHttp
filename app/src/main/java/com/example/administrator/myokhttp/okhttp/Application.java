package com.example.administrator.myokhttp.okhttp;
import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */


class MyApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();

            ImageLoaderConfiguration configuration=new ImageLoaderConfiguration.Builder(this).memoryCacheSize(12*1024*1024).diskCacheSize(12*1024*1024).build();
            ImageLoader.getInstance().init(configuration);
        }
    }

