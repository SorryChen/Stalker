package com.sorry.stalker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sorry.stalker.R;

/**
 * Created by sorry on 2016/5/1.
 */
public class SearchResultToolbar extends RelativeLayout {

    private RelativeLayout backgroundLayout;
    private TextView textView;
    public SearchResultToolbar(Context context) {
        this(context, null);
    }

    public SearchResultToolbar(final Context context, AttributeSet attrs) {
        super(context, attrs);
        // 导入布局
        LayoutInflater.from(context).inflate(R.layout.search_result_toolbar, this, true);
        backgroundLayout = (RelativeLayout) findViewById(R.id.searchResultToolbar);
        textView = (TextView) findViewById(R.id.resultTextview);
    }

    public void setBlankBackground(){
        backgroundLayout.setBackgroundColor(getResources().getColor(R.color.colorTransparent));
        textView.setBackgroundColor(getResources().getColor(R.color.colorTransparent));
        textView.setTextColor(getResources().getColor(R.color.colorWhite));
    }


}
