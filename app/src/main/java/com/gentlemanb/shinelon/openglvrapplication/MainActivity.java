package com.gentlemanb.shinelon.openglvrapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    /**
     * 主要的opengl view
     */
    private OpenGLView mOpenGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mOpenGLView = new OpenGLView(this);
        setContentView(mOpenGLView);
        //
    }
}
