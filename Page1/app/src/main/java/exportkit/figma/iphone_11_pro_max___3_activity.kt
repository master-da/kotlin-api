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
import exportkit.figma.iphone_11_pro_max___2_activity

class iphone_11_pro_max___3_activity : Activity() {
    private var _bg__iphone_11_pro_max___3_ek2: View? = null
    private var mask_group_ek1: ImageView? = null
    private var rectangle_1_ek1: View? = null
    private var rectangle_2_ek1: View? = null
    private var rectangle_5_ek1: View? = null
    private var line_1_ek1: View? = null
    private var line_3_ek1: View? = null
    private var line_2: View? = null
    private var _rectangle_4_ek1: View? = null
    private var layer_0_ek1: ImageView? = null
    private var _log_in_ek2: TextView? = null
    private var sign_up_ek1: TextView? = null
    private var sign_up_ek2: TextView? = null
    private var enter_email_or_username_ek1: TextView? = null
    private var password_ek1: TextView? = null
    private var confirm_password: TextView? = null
    private var or_ek1: TextView? = null
    private var ellipse_3_ek2: View? = null
    private var ellipse_2_ek1: View? = null
    private var ellipse_3_ek3: View? = null
    private var search_1_ek1: ImageView? = null
    private var twitter_1_ek1: ImageView? = null
    private var facebook_1_ek1: ImageView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iphone_11_pro_max___3)
        _bg__iphone_11_pro_max___3_ek2 = findViewById(R.id._bg__iphone_11_pro_max___3_ek2) as View
        mask_group_ek1 = findViewById<View>(R.id.mask_group_ek1) as ImageView
        rectangle_1_ek1 = findViewById(R.id.rectangle_1_ek1) as View
        rectangle_2_ek1 = findViewById(R.id.rectangle_2_ek1) as View
        rectangle_5_ek1 = findViewById(R.id.rectangle_5_ek1) as View
        line_1_ek1 = findViewById(R.id.line_1_ek1) as View
        line_3_ek1 = findViewById(R.id.line_3_ek1) as View
        line_2 = findViewById(R.id.line_2) as View
        _rectangle_4_ek1 = findViewById(R.id._rectangle_4_ek1) as View
        layer_0_ek1 = findViewById<View>(R.id.layer_0_ek1) as ImageView
        _log_in_ek2 = findViewById<View>(R.id._log_in_ek2) as TextView
        sign_up_ek1 = findViewById<View>(R.id.sign_up_ek1) as TextView
        sign_up_ek2 = findViewById<View>(R.id.sign_up_ek2) as TextView
        enter_email_or_username_ek1 =
            findViewById<View>(R.id.enter_email_or_username_ek1) as TextView
        password_ek1 = findViewById<View>(R.id.password_ek1) as TextView
        confirm_password = findViewById<View>(R.id.confirm_password) as TextView
        or_ek1 = findViewById<View>(R.id.or_ek1) as TextView
        ellipse_3_ek2 = findViewById(R.id.ellipse_3_ek2) as View
        ellipse_2_ek1 = findViewById(R.id.ellipse_2_ek1) as View
        ellipse_3_ek3 = findViewById(R.id.ellipse_3_ek3) as View
        search_1_ek1 = findViewById<View>(R.id.search_1_ek1) as ImageView
        twitter_1_ek1 = findViewById<View>(R.id.twitter_1_ek1) as ImageView
        facebook_1_ek1 = findViewById<View>(R.id.facebook_1_ek1) as ImageView
        _rectangle_4_ek1!!.setOnClickListener {
            val nextScreen = Intent(applicationContext, iphone_11_pro_max___4_activity::class.java)
            startActivity(nextScreen)
        }
        _log_in_ek2!!.setOnClickListener {
            val nextScreen = Intent(applicationContext, iphone_11_pro_max___2_activity::class.java)
            startActivity(nextScreen)
        }


        //custom code goes here
    }
}