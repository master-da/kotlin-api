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
package exportkit.figma

import android.app.Activity
import android.widget.TextView
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.ImageView
import exportkit.figma.iphone_11_pro_max___4_activity
import exportkit.figma.iphone_11_pro_max___3_activity

class iphone_11_pro_max___2_activity : Activity() {
    private var _bg__iphone_11_pro_max___2_ek2: View? = null
    private var mask_group: ImageView? = null
    private var rectangle_1: View? = null
    private var rectangle_2: View? = null
    private var rectangle_5: View? = null
    private var line_1: View? = null
    private var line_3: View? = null
    private var _rectangle_4: View? = null
    private var layer_0: ImageView? = null
    private var log_in: TextView? = null
    private var log_in_ek1: TextView? = null
    private var _sign_up: TextView? = null
    private var enter_email_or_username: TextView? = null
    private var password: TextView? = null
    private var or: TextView? = null
    private var forgot_password_: TextView? = null
    private var rectangle: ImageView? = null
    private var rectangle_ek1: ImageView? = null
    private var ellipse_3: View? = null
    private var ellipse_2: View? = null
    private var ellipse_3_ek1: View? = null
    private var search_1: ImageView? = null
    private var twitter_1: ImageView? = null
    private var facebook_1: ImageView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iphone_11_pro_max___2)
        _bg__iphone_11_pro_max___2_ek2 = findViewById(R.id._bg__iphone_11_pro_max___2_ek2) as View
        mask_group = findViewById<View>(R.id.mask_group) as ImageView
        rectangle_1 = findViewById(R.id.rectangle_1) as View
        rectangle_2 = findViewById(R.id.rectangle_2) as View
        rectangle_5 = findViewById(R.id.rectangle_5) as View
        line_1 = findViewById(R.id.line_1) as View
        line_3 = findViewById(R.id.line_3) as View
        _rectangle_4 = findViewById(R.id._rectangle_4) as View
        layer_0 = findViewById<View>(R.id.layer_0) as ImageView
        log_in = findViewById<View>(R.id.log_in) as TextView
        log_in_ek1 = findViewById<View>(R.id.log_in_ek1) as TextView
        _sign_up = findViewById<View>(R.id._sign_up) as TextView
        enter_email_or_username = findViewById<View>(R.id.enter_email_or_username) as TextView
        password = findViewById<View>(R.id.password) as TextView
        or = findViewById<View>(R.id.or) as TextView
        forgot_password_ = findViewById<View>(R.id.forgot_password_) as TextView
        rectangle = findViewById<View>(R.id.rectangle) as ImageView
        rectangle_ek1 = findViewById<View>(R.id.rectangle_ek1) as ImageView
        ellipse_3 = findViewById(R.id.ellipse_3) as View
        ellipse_2 = findViewById(R.id.ellipse_2) as View
        ellipse_3_ek1 = findViewById(R.id.ellipse_3_ek1) as View
        search_1 = findViewById<View>(R.id.search_1) as ImageView
        twitter_1 = findViewById<View>(R.id.twitter_1) as ImageView
        facebook_1 = findViewById<View>(R.id.facebook_1) as ImageView
        _rectangle_4!!.setOnClickListener {
            val nextScreen = Intent(applicationContext, iphone_11_pro_max___4_activity::class.java)
            startActivity(nextScreen)
        }
        _sign_up!!.setOnClickListener {
            val nextScreen = Intent(applicationContext, iphone_11_pro_max___3_activity::class.java)
            startActivity(nextScreen)
        }


        //custom code goes here
    }
}