package com.example.administrator.frescotext0917;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends Activity implements View.OnClickListener {

    private SimpleDraweeView draweeView;
    private Button btToRoundConner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_load_img).setOnClickListener(this);
        draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        btToRoundConner = (Button) findViewById(R.id.bt_to_round_conner);
        GenericDraweeHierarchyBuilder builder =
                new GenericDraweeHierarchyBuilder(getResources());
//        GenericDraweeHierarchy hierarchy = builder
//                .setFadeDuration(300)
//                .setPlaceholderImage(new MyCustomDrawable())
//                .setBackgrounds(backgroundList)
//                .setOverlays(overlaysList)
//                .build();

        GenericDraweeHierarchy hierarchy = builder
        .setFadeDuration(2000)
        .build();
        draweeView.setHierarchy(hierarchy);

    }

    @Override
    public void onClick(View view) {
        if(R.id.bt_load_img == view.getId()) {
            System.out.println("xcqw 点到我了1222222222222");
            System.out.println("xcqw 我是版本101");
            System.out.println("xcqw 我是版本101的修改");
            System.out.println("xcqw 我是版本101第四次的修改");
            System.out.println("xcqw 我是版本101第5次的修改");
            Uri uri = Uri.parse("http://test2.img.hiwemeet.com/pic/240-240-5e5ad0765f3ef8ac13d7be2411e90cb7/0");
            draweeView.setImageURI(uri);
        }
    }

    public void toRoundConner(View view){
        System.out.println("xcqw 我是V1.1");
        System.out.println("xcqw 变成圆角");
        //报错
//        GenericDraweeHierarchy hierarchy = draweeView.getHierarchy();
//        RoundingParams roundingParams = hierarchy.getRoundingParams();
//        roundingParams.setCornersRadius(10);
//        hierarchy.setRoundingParams(roundingParams);
    }
}
