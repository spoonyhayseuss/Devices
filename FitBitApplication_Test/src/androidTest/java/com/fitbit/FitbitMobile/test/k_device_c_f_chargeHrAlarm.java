package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_c_f_chargeHrAlarm extends ActivityInstrumentationTestCase2 {
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
    public k_device_c_f_chargeHrAlarm() throws ClassNotFoundException {
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
        //solo.takeScreenshot("c_f_chargeAlarm_a_dash");
        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_c_devices");
        //Click
        solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
        assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_d_chargeHr");
        //Click on Silent Alarm No alarms set RelativeLayout
        solo.clickOnText(java.util.regex.Pattern.quote("Silent Alarm"));
        //Wait for activity: 'com.fitbit.alarm.ui.AlarmActivity_'
        assertTrue("AlarmActivity_ is not found!", solo.waitForActivity("AlarmActivity_"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_e_alarm1");
        //Click on Empty Text View
        solo.clickOnView(solo.getView("add_alarms"));
        //Wait for activity: 'com.fitbit.alarm.ui.LogAlarmActivity'
        assertTrue("LogAlarmActivity is not found!", solo.waitForActivity("LogAlarmActivity"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_f_alarm2");
        //Click on 3:38 PM
        solo.clickOnView(solo.getView("txt_time"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_g_timePicker");
        //Enter the text: '2'
        //solo.clearEditText((android.widget.EditText) solo.getView("numberpicker_input"));
        //solo.enterText((android.widget.EditText) solo.getView("numberpicker_input"), "2");

        //Click on Done
        solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_h_dismissPicker");
        //Click on Repeats
        solo.clickOnView(solo.getView("repeats"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_i_repeatsOn");
        //Click on chk_day_2
        solo.clickOnView(solo.getView("chk_day_2"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_j_monday");
        //Click on chk_day_3
        solo.clickOnView(solo.getView("chk_day_3"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_k_tuesday");
        //Click on chk_day_4
        solo.clickOnView(solo.getView("chk_day_4"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_l_wednesday");
        //Click on Th
        solo.clickOnView(solo.getView("chk_day_5"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_m_thursday");
        //Click on chk_day_6
        solo.clickOnView(solo.getView("chk_day_6"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_n_friday");
        //Click on Save
        solo.clickOnView(solo.getView("save"));
        //Sleep - shot
        solo.sleep(2000);
        //solo.takeScreenshot("c_f_chargeAlarm_o_saved");
    }
}
