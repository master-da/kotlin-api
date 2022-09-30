
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_11_pro_max___1
	 *	@date 		Monday 29th of August 2022 04:38:23 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class iphone_11_pro_max___1_activity extends Activity {

	
	private View __bg__iphone_11_pro_max___1_ek2;
	private ImageView might_as_well_join_in__this_is_my_wallpaper_for_my_phone____copy_1;
	private ImageView logo_195e0dbd_a0dc_42af_aa61_8f5999ce14cb_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro_max___1);

		
		__bg__iphone_11_pro_max___1_ek2 = (View) findViewById(R.id.__bg__iphone_11_pro_max___1_ek2);
		might_as_well_join_in__this_is_my_wallpaper_for_my_phone____copy_1 = (ImageView) findViewById(R.id.might_as_well_join_in__this_is_my_wallpaper_for_my_phone____copy_1);
		logo_195e0dbd_a0dc_42af_aa61_8f5999ce14cb_1 = (ImageView) findViewById(R.id.logo_195e0dbd_a0dc_42af_aa61_8f5999ce14cb_1);
	
		
		__bg__iphone_11_pro_max___1_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro_max___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	