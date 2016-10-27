package com.example.isaigarciamoso.appautounion.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.isaigarciamoso.appautounion.R;

/**
 * Created by isaigarciamoso on 26/10/16.
 */

public class AdapterPageView extends PagerAdapter {
     private Context context;
     private int[] resources;

    public AdapterPageView() {

    }
    public AdapterPageView(Context  context,int [] resources){
      this.context =  context;
      this.resources =  resources;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.pager_item,container,false);
        ImageView imageView = (ImageView)itemView.findViewById(R.id.img_car);
        imageView.setImageResource(resources[position]);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public int getCount() {
        return resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
