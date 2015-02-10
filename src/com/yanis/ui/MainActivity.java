package com.yanis.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);

		setContentView(R.layout.activity_maino);
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		FragementList fragment1 = new FragementList();
		fragmentTransaction.add(R.id.frag_list, fragment1);
		FragementDetails fragment2 = new FragementDetails();
		fragmentTransaction.add(R.id.frag_detail, fragment2);
		fragmentTransaction.commit();
	}
}
