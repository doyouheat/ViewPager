package viewpager.bwie.com.viewpager.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


import it.sephiroth.android.library.picasso.Picasso;
import viewpager.bwie.com.viewpager.R;
import viewpager.bwie.com.viewpager.bean.News;
import viewpager.bwie.com.viewpager.utils.HttpUtils;

public class MainActivity extends AppCompatActivity implements HttpUtils.SuccessInterface {

    private  String  url="http://www.meirixue.com/api.php?c=circle&a=getCircleNamesIndexV2";
    private ViewPager vp;
    private LinearLayout lin;
    private TextView tv;
    private List<ImageView>  ivlist=new ArrayList<>();
    private static  List<News.DataBean.CircleBean> list;

    Handler  handler=new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                int currentItem = vp.getCurrentItem();
                currentItem++;
                if (currentItem==ivlist.size()-1)
                {
                    currentItem=0;
                    vp.setCurrentItem(currentItem);
                }
                vp.setCurrentItem(currentItem);
                handler.sendEmptyMessageDelayed(0, 1000);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        HttpUtils.getHttpResponse(url,this,this);

    }

   /* private void initPoint() {
        for (int i = 0; i < list.size(); i++) {
            View view = new View(this);
            view.setBackgroundResource(R.drawable.point_back);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(20, 20);
            params.rightMargin=10;
            lin.addView(view,params);
            view.setTag(i);
        }
        View view = lin.getChildAt(0);
        view.setEnabled(false);

    }*/

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        lin = (LinearLayout) findViewById(R.id.lin);
        tv = (TextView) findViewById(R.id.tv);
        handler.sendEmptyMessageDelayed(0,1000);
    }

    @Override
    public void success(String res) {

        News news = new Gson().fromJson(res, News.class);
        list = news.getData().getCircle();
       // initPoint();
        for (int i = 0; i < list.size(); i++) {
            ImageView  image=new ImageView(this);
            Picasso.with(this).load(list.get(i).getN_big_img()).into(image);
            ivlist.add(image);
        }
        vp.setAdapter(new MyPagerAdapter());

        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
       class   MyPagerAdapter  extends  PagerAdapter{
    @Override
    public int getCount() {
        return ivlist.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        ImageView view = ivlist.get(position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
     container.removeView(ivlist.get(position));
    }
}
}
