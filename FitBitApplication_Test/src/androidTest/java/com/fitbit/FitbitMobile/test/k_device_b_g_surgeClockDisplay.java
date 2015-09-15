package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_b_g_surgeClockDisplay extends ActivityInstrumentationTestCase2 {
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
    public k_device_b_g_surgeClockDisplay() throws ClassNotFoundException {
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
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_a_dash");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_c_devices");
        //Click on Surge
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_d_surge");
        //Click on Clock Display Select a style for your clock. RelativeLayout
		solo.clickOnText(java.util.regex.Pattern.quote("Clock Display"));

        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_e_clockOptions");
        //Click on Flare
		solo.clickInList(1, 0);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_f_flare");
        //tap Clock Display
        solo.clickOnText(java.util.regex.Pattern.quote("Clock Display"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_g_clockOptions");
        //click on digital
        solo.clickInList(3, 0);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_h_digital");

        //tap Clock Display
        solo.clickOnText(java.util.regex.Pattern.quote("Clock Display"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_i_clockOptions");
        //click on orbit
        solo.clickInList(2, 0);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_j_orbit");

        //tap Clock Display
        solo.clickOnText(java.util.regex.Pattern.quote("Clock Display"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_k_clockOptions");
        //click on analog
        solo.clickInList(4, 0);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_g_clockDisplay_l_analog");

	}
}
