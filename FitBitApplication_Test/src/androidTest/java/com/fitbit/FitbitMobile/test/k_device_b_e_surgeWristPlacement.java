package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_b_e_surgeWristPlacement extends ActivityInstrumentationTestCase2 {
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
    public k_device_b_e_surgeWristPlacement() throws ClassNotFoundException {
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
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_a_dash");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_c_devices");
        //Click on Surge
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_d_surge");
        //Click on Wrist Placement Non Dominant RelativeLayout
		solo.clickOnText(java.util.regex.Pattern.quote("Wrist Placement"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_e_wristDialog");
        //Click on Dominant
		solo.clickOnView(solo.getView(android.R.id.text1));
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_f_dominant");
        //Click on Wrist Placement Dominant RelativeLayout
		solo.clickOnText(java.util.regex.Pattern.quote("Wrist Placement"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_g_wristDialog2");
        //Click on Non Dominant
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
        //Sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("b_e_surgeWristPlacement_h_nonDominant");
	}
}
