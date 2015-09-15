package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_b_d_surgeMainGoal extends ActivityInstrumentationTestCase2 {
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
    public k_device_b_d_surgeMainGoal() throws ClassNotFoundException {
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
        //solo.takeScreenshot("b_d_surgeMainGoal_a_dash");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_d_surgeMainGoal_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_d_surgeMainGoal_c_devices");
        //Click on Surge
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_d_surgeMainGoal_d_surge");
        //Click on Main Goal Steps RelativeLayout
		solo.clickOnText(java.util.regex.Pattern.quote("Main Goal"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_d_surgeMainGoal_e_mainSelector");
        //Click on Calories
		solo.clickOnView(solo.getView(android.R.id.text1, 2));
        //Sleep for x milliseconds
        solo.sleep(500);
        //Take screenshot
        //solo.takeScreenshot();
        //Sleep for x milliseconds
		solo.sleep(500);
        //Click on Main Goal Calories RelativeLayout
		solo.clickOnText(java.util.regex.Pattern.quote("Main Goal"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for x milliseconds
		solo.sleep(500);
        //Click on Steps
		solo.clickOnView(solo.getView(android.R.id.text1));
        //Take screenshot
        //solo.takeScreenshot();
        solo.clickOnText(java.util.regex.Pattern.quote("Main Goal"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep for x milliseconds
        solo.sleep(500);
        //Click on Steps
        solo.clickOnView(solo.getView(android.R.id.text1, 1));
        //Take screenshot
        //solo.takeScreenshot();
        solo.clickOnText(java.util.regex.Pattern.quote("Main Goal"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep for x milliseconds
        solo.sleep(500);
        //Click on Steps
        solo.clickOnView(solo.getView(android.R.id.text1,3));
        //Take screenshot
        //solo.takeScreenshot();
	}
}
