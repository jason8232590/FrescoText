package com.example.administrator.frescotext0917;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends Activity implements View.OnClickListener {

    private SimpleDraweeView draweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_load_img).setOnClickListener(this);
        draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
    }

    @Override
    public void onClick(View view) {
        System.out.println("xcqw 第四次提交");
        System.out.println("xcqw 点到我了4");
        System.out.println("xcqw 点到我了2");
        System.out.println("xcqw 点到我了1");
        Uri uri = Uri.parse("http://test2.img.hiwemeet.com/pic/240-240-5e5ad0765f3ef8ac13d7be2411e90cb7/0");
        draweeView.setImageURI(uri);
    }
}
