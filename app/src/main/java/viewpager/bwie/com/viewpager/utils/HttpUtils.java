package viewpager.bwie.com.viewpager.utils;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * 1. 类的用途
 * 2. @author : do  you  heat
 * 3. @date 2017/3/21 11:23
 */
public class HttpUtils {

    public  static   void   getHttpResponse(String  url, Context context,final  SuccessInterface  successInterface){

        RequestQueue queue = Volley.newRequestQueue(context);
        StringRequest  request=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
               successInterface.success(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        queue.add(request);
    }
    public  interface   SuccessInterface{
        public  void   success(String  res);
    }
}
