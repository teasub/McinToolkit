package net.fangcunjian.adapter;

import android.view.ViewGroup;
import android.widget.CompoundButton;

/**
 * Create by Mcin on 16/3/9
 * AdapterView和RecyclerView的item中子控件选中状态变化事件监听器
 */
public interface SimpleOnItemChildCheckedChangeListener {
    void onItemChildCheckedChanged(ViewGroup parent, CompoundButton childView, int position, boolean isChecked);
}