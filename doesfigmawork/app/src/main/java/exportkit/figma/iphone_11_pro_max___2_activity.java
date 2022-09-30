
	 
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

public class iphone_11_pro_max___2_activity extends Activity {

	
	private View _bg__iphone_11_pro_max___2_ek2;
	private ImageView mask_group;
	private View rectangle_1;
	private View rectangle_2;
	private View rectangle_5;
	private View line_1;
	private View line_3;
	private View _rectangle_4;
	private ImageView layer_0;
	private TextView log_in;
	private TextView log_in_ek1;
	private TextView _sign_up;
	private TextView enter_email_or_username;
	private TextView password;
	private TextView or;
	private TextView forgot_password_;
	private ImageView rectangle;
	private ImageView rectangle_ek1;
	private View ellipse_3;
	private View ellipse_2;
	private View ellipse_3_ek1;
	private ImageView search_1;
	private ImageView twitter_1;
	private ImageView facebook_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro_max___2);

		
		_bg__iphone_11_pro_max___2_ek2 = (View) findViewById(R.id._bg__iphone_11_pro_max___2_ek2);
		mask_group = (ImageView) findViewById(R.id.mask_group);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		line_1 = (View) findViewById(R.id.line_1);
		line_3 = (View) findViewById(R.id.line_3);
		_rectangle_4 = (View) findViewById(R.id._rectangle_4);
		layer_0 = (ImageView) findViewById(R.id.layer_0);
		log_in = (TextView) findViewById(R.id.log_in);
		log_in_ek1 = (TextView) findViewById(R.id.log_in_ek1);
		_sign_up = (TextView) findViewById(R.id._sign_up);
		enter_email_or_username = (TextView) findViewById(R.id.enter_email_or_username);
		password = (TextView) findViewById(R.id.password);
		or = (TextView) findViewById(R.id.or);
		forgot_password_ = (TextView) findViewById(R.id.forgot_password_);
		rectangle = (ImageView) findViewById(R.id.rectangle);
		rectangle_ek1 = (ImageView) findViewById(R.id.rectangle_ek1);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		ellipse_3_ek1 = (View) findViewById(R.id.ellipse_3_ek1);
		search_1 = (ImageView) findViewById(R.id.search_1);
		twitter_1 = (ImageView) findViewById(R.id.twitter_1);
		facebook_1 = (ImageView) findViewById(R.id.facebook_1);
	
		
		_rectangle_4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro_max___4_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_sign_up.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro_max___3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	