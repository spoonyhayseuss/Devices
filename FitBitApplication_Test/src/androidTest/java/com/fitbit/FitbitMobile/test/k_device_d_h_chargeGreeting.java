package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_d_h_chargeGreeting extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public k_device_d_h_chargeGreeting() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
		solo.waitForActivity("LandingActivity_", 2000);
        //Sleep - shot
		solo.sleep(1000);
        solo.takeScreenshot("d_h_chargeGreeting_a_dash");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(1000);
        solo.takeScreenshot("d_h_chargeGreeting_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(1000);
        solo.takeScreenshot("d_h_chargeGreeting_c_devices");
        //Click on Charge
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(1000);
        solo.takeScreenshot("d_h_chargeGreeting_d_charge");
        //Click on RelativeLayout Greeting
		//solo.clickOnView(solo.getView(android.widget.RelativeLayout.class, 11));
        solo.clickOnText(java.util.regex.Pattern.quote("Greeting"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(1000);
        solo.takeScreenshot("d_h_chargeGreeting_e_greeting");
        //Enter the text: 'YOOO'
		solo.clearEditText((android.widget.EditText) solo.getView(android.widget.EditText.class, 0));
		solo.enterText((android.widget.EditText) solo.getView(android.widget.EditText.class, 0), "YOLO3");
        //Sleep - shot
        solo.sleep(1000);
        solo.takeScreenshot("d_h_chargeGreeting_f_enterGreeting");
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep - shot
        solo.sleep(1000);
        solo.takeScreenshot("d_h_chargeGreeting_g_backToDevice");

	}
}
