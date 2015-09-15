package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_d_a_charge extends ActivityInstrumentationTestCase2 {
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
    public k_device_d_a_charge() throws ClassNotFoundException {
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
        //Sleep for x milliseconds
		solo.sleep(2000);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for x milliseconds
		solo.sleep(2000);
		//tap Devices
		solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep for x milliseconds
		solo.sleep(2000);
        //Click on UPDATE AVAILABLE Flex Last synced: Feb 9 at 4:51 AM RelativeLayout
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));

	}
}
