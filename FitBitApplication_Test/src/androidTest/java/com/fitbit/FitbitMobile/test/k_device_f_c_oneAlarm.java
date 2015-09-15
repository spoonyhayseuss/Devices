package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_f_c_oneAlarm extends ActivityInstrumentationTestCase2 {
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
    public k_device_f_c_oneAlarm() throws ClassNotFoundException {
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
		//Click flex
		solo.clickInList(1, 0);
		//Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Click on Silent Alarm No alarms set RelativeLayout
		solo.clickOnText(java.util.regex.Pattern.quote("Silent Alarm"));
		//Wait for activity: 'com.fitbit.alarm.ui.AlarmActivity_'
		assertTrue("AlarmActivity_ is not found!", solo.waitForActivity("AlarmActivity_"));
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Click on Empty Text View
		solo.clickOnView(solo.getView("add_alarms"));
		//Wait for activity: 'com.fitbit.alarm.ui.LogAlarmActivity'
		assertTrue("LogAlarmActivity is not found!", solo.waitForActivity("LogAlarmActivity"));
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Click on 3:38 PM
		solo.clickOnView(solo.getView("txt_time"));
		//Wait for dialog
		solo.waitForDialogToOpen(5000);
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Enter the text: '2'
		//solo.clearEditText((android.widget.EditText) solo.getView("numberpicker_input"));
		//solo.enterText((android.widget.EditText) solo.getView("numberpicker_input"), "2");
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Click on Done
		solo.clickOnView(solo.getView(android.R.id.button1));
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Click on Repeats
		solo.clickOnView(solo.getView("repeats"));
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Click on chk_day_2
		solo.clickOnView(solo.getView("chk_day_2"));
		//Sleep for 597 milliseconds
		solo.sleep(597);
		//Click on chk_day_3
		solo.clickOnView(solo.getView("chk_day_3"));
		//Sleep for 709 milliseconds
		solo.sleep(709);
		//Click on chk_day_4
		solo.clickOnView(solo.getView("chk_day_4"));
		//Sleep for 506 milliseconds
		solo.sleep(506);
		//Click on Th
		solo.clickOnView(solo.getView("chk_day_5"));
		//Sleep for 556 milliseconds
		solo.sleep(556);
		//Click on chk_day_6
		solo.clickOnView(solo.getView("chk_day_6"));
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Click on Save
		solo.clickOnView(solo.getView("save"));
		//Sleep for x milliseconds
		solo.sleep(2000);
		//Take screenshot
		solo.takeScreenshot();
	}
}
