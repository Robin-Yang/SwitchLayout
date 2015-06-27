package com.example.switchlayout;

import com.tandong.swichlayout.BaseEffects;
import com.tandong.swichlayout.SwichLayoutInterFace;
import com.tandong.swichlayout.SwitchLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SecondActivity extends Activity implements SwichLayoutInterFace
{
	
	private ImageView img;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		setEnterSwichLayout();
		
		img = (ImageView) this.findViewById(R.id.iv_img);
		SwitchLayout.get3DRotateFromLeft(img,false,null);
		
		img.setOnClickListener(new 	OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				SwitchLayout.get3DRotateFromLeft(img,false,null);
				
			}
		});
		
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if (keyCode == KeyEvent.KEYCODE_BACK)
		{
			setExitSwichLayout();
		}
		
		return true;
	}

	@Override
	public void setEnterSwichLayout()
	{
		SwitchLayout.getSlideFromLeft(this,false,null);
	}

	@Override
	public void setExitSwichLayout()
	{
		SwitchLayout.getSlideToLeft(this,true,BaseEffects.getMoreQuickEffect());
	}
}
