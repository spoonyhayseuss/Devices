package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_f_a_oneSyncNowBToff extends ActivityInstrumentationTestCase2 {
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
    public k_device_f_a_oneSyncNowBToff() throws ClassNotFoundException {
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
		//Sleep for 2925 milliseconds
		solo.sleep(2925);
		//Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
		//Sleep for 944 milliseconds
		solo.sleep(944);
		//tap Devices
		solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
		//Sleep for 2619 milliseconds
		solo.sleep(2619);
		//Click on UPDATE AVAILABLE Flex Last synced 19 mins ago Battery Full RelativeLayout
		solo.clickInList(2, 0);
		//Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
		//Sleep for 1123 milliseconds
		solo.sleep(1123);
		//Click on RelativeLayout Sync Now Last synced 19 mins ago
		solo.clickOnView(solo.getView("cellForceSync"));
		//Sleep for 985 milliseconds
		solo.sleep(985);
		/*//Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
		//Sleep for 825 milliseconds
		solo.sleep(825);
		//Click on RelativeLayout Sync Now Last synced 19 mins ago
		solo.clickOnView(solo.getView("cellForceSync"));
		//Sleep for 1240 milliseconds
		solo.sleep(1240);
		//Click on Cancel
		solo.clickOnView(solo.getView(android.R.id.button2));
		//Sleep for 1037 milliseconds
		solo.sleep(1037);
		//Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));*/
	}
}