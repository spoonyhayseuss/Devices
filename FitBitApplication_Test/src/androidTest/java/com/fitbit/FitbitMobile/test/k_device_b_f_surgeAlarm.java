package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_b_f_surgeAlarm extends ActivityInstrumentationTestCase2 {
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
    public k_device_b_f_surgeAlarm() throws ClassNotFoundException {
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
        //solo.takeScreenshot("b_f_surgeAlarm_a_dash");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_c_devices");
        //Click on Surge
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
		assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_d_surge");
        //Click on Silent Alarm
		solo.clickOnText(java.util.regex.Pattern.quote("Silent Alarm"));
        //Wait for activity: 'com.fitbit.alarm.ui.AlarmActivity_'
		assertTrue("AlarmActivity_ is not found!", solo.waitForActivity("AlarmActivity_"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_e_silentAlarms");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("add_alarms"));
        //Wait for activity: 'com.fitbit.alarm.ui.LogAlarmActivity'
		assertTrue("LogAlarmActivity is not found!", solo.waitForActivity("LogAlarmActivity"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_f_newSilentAlarm");
        //Click on time
		solo.clickOnView(solo.getView("txt_time"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_g_timeSelector");
       /* //Enter the text: '2'
		solo.clearEditText((android.widget.EditText) solo.getView("numberpicker_input"));
		solo.enterText((android.widget.EditText) solo.getView("numberpicker_input"), "2");
        //Sleep for x milliseconds
		solo.sleep(500);
        //Click on Done
		solo.clickOnView(solo.getView(android.R.id.button1));*/
        //goback
        solo.goBack();
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_h_backToNew");

        //Click on Repeats
		solo.clickOnView(solo.getView("repeats"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_i_repeats");
        //Click on chk_day_2
		solo.clickOnView(solo.getView("chk_day_2"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_j_monday");
        //Click on chk_day_3
		solo.clickOnView(solo.getView("chk_day_3"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_k_tuesday");
        //Click on chk_day_4
		solo.clickOnView(solo.getView("chk_day_4"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_l_wednesday");
        //Click on Th
		solo.clickOnView(solo.getView("chk_day_5"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_m_thursday");
        //Click on chk_day_6
		solo.clickOnView(solo.getView("chk_day_6"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_n_friday");
        //Click on Save
		solo.clickOnView(solo.getView("save"));
        //Sleep - shot
        solo.sleep(500);
        //solo.takeScreenshot("b_e_surgeWristPlacement_o_backToNew");
	}
}
