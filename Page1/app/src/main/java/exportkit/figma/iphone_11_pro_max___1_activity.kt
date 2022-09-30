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
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.ImageView
import exportkit.figma.iphone_11_pro_max___2_activity

class iphone_11_pro_max___1_activity : Activity() {
    private var __bg__iphone_11_pro_max___1_ek2: View? = null
    private var might_as_well_join_in__this_is_my_wallpaper_for_my_phone____copy_1: ImageView? =
        null
    private var logo_195e0dbd_a0dc_42af_aa61_8f5999ce14cb_1: ImageView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iphone_11_pro_max___1)
        __bg__iphone_11_pro_max___1_ek2 = findViewById(R.id.__bg__iphone_11_pro_max___1_ek2) as View
        might_as_well_join_in__this_is_my_wallpaper_for_my_phone____copy_1 =
            findViewById<View>(R.id.might_as_well_join_in__this_is_my_wallpaper_for_my_phone____copy_1) as ImageView
        logo_195e0dbd_a0dc_42af_aa61_8f5999ce14cb_1 =
            findViewById<View>(R.id.logo_195e0dbd_a0dc_42af_aa61_8f5999ce14cb_1) as ImageView
        __bg__iphone_11_pro_max___1_ek2!!.setOnClickListener {
            val nextScreen = Intent(applicationContext, iphone_11_pro_max___2_activity::class.java)
            startActivity(nextScreen)
        }


        //custom code goes here
    }
}