package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_b_b_surgeBackgroundSync extends ActivityInstrumentationTestCase2 {
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
    public k_device_b_b_surgeBackgroundSync() throws ClassNotFoundException {
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
        solo.sleep(2000);
        //solo.takeScreenshot("b_b_surgeBackgroundSync_a_dash");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("b_b_surgeBackgroundSync_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("b_b_surgeBackgroundSync_c_devices");
        //Click on Surge
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("b_b_surgeBackgroundSync_d_surge");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("checkboxBackgroundSync"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("b_b_surgeBackgroundSync_e_toggleBG1");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("checkboxBackgroundSync"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("b_b_surgeBackgroundSync_f_toggleBG2");
	}
}
