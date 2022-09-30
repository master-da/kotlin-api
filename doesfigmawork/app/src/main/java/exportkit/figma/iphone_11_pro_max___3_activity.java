
	 
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
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class iphone_11_pro_max___3_activity extends Activity {

	
	private View _bg__iphone_11_pro_max___3_ek2;
	private ImageView mask_group_ek1;
	private View rectangle_1_ek1;
	private View rectangle_2_ek1;
	private View rectangle_5_ek1;
	private View line_1_ek1;
	private View line_3_ek1;
	private View line_2;
	private View _rectangle_4_ek1;
	private ImageView layer_0_ek1;
	private TextView _log_in_ek2;
	private TextView sign_up_ek1;
	private TextView sign_up_ek2;
	private TextView enter_email_or_username_ek1;
	private TextView password_ek1;
	private TextView confirm_password;
	private TextView or_ek1;
	private View ellipse_3_ek2;
	private View ellipse_2_ek1;
	private View ellipse_3_ek3;
	private ImageView search_1_ek1;
	private ImageView twitter_1_ek1;
	private ImageView facebook_1_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro_max___3);

		
		_bg__iphone_11_pro_max___3_ek2 = (View) findViewById(R.id._bg__iphone_11_pro_max___3_ek2);
		mask_group_ek1 = (ImageView) findViewById(R.id.mask_group_ek1);
		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
		rectangle_2_ek1 = (View) findViewById(R.id.rectangle_2_ek1);
		rectangle_5_ek1 = (View) findViewById(R.id.rectangle_5_ek1);
		line_1_ek1 = (View) findViewById(R.id.line_1_ek1);
		line_3_ek1 = (View) findViewById(R.id.line_3_ek1);
		line_2 = (View) findViewById(R.id.line_2);
		_rectangle_4_ek1 = (View) findViewById(R.id._rectangle_4_ek1);
		layer_0_ek1 = (ImageView) findViewById(R.id.layer_0_ek1);
		_log_in_ek2 = (TextView) findViewById(R.id._log_in_ek2);
		sign_up_ek1 = (TextView) findViewById(R.id.sign_up_ek1);
		sign_up_ek2 = (TextView) findViewById(R.id.sign_up_ek2);
		enter_email_or_username_ek1 = (TextView) findViewById(R.id.enter_email_or_username_ek1);
		password_ek1 = (TextView) findViewById(R.id.password_ek1);
		confirm_password = (TextView) findViewById(R.id.confirm_password);
		or_ek1 = (TextView) findViewById(R.id.or_ek1);
		ellipse_3_ek2 = (View) findViewById(R.id.ellipse_3_ek2);
		ellipse_2_ek1 = (View) findViewById(R.id.ellipse_2_ek1);
		ellipse_3_ek3 = (View) findViewById(R.id.ellipse_3_ek3);
		search_1_ek1 = (ImageView) findViewById(R.id.search_1_ek1);
		twitter_1_ek1 = (ImageView) findViewById(R.id.twitter_1_ek1);
		facebook_1_ek1 = (ImageView) findViewById(R.id.facebook_1_ek1);
	
		
		_rectangle_4_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro_max___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_log_in_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro_max___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	