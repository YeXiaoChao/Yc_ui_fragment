package com.yanis.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragementList extends Fragment{
	/**
     * 显示指定的视图
     * @inflater     resource ID，指明了当前的Fragment对应的资源文件
     * @container    该Fragment在Activity中的父容器控件
     * @savedInstanceState 是否连接该布局和其父容器控件，在这里的情况设置为false，因为系统已经插入了这个布局到父控件，设置为true将会产生多余的一个View Group。
     */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.frag_list, container, false);
	}

}
