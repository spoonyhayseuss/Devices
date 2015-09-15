package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_d_i_chargeStatsDisplay extends ActivityInstrumentationTestCase2 {
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
    public k_device_d_i_chargeStatsDisplay() throws ClassNotFoundException {
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
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_a_dash");
        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_b_drawer");
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_c_devices");
        //Click
        solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
        assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_d_chargeHr");
        //Click on Stats Display Select what stats show and in what order. RelativeLayout
        solo.clickOnText(java.util.regex.Pattern.quote("Stats Display"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_e_statDisplayPicker");
        //Click on Calories MAIN GOAL
        solo.clickInList(5, 0);
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_f_calories");
        //Click on Distance MAIN GOAL
        solo.clickInList(4, 0);
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_g_distance");
        //Click on OK
        solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_h_return");
        //Click on Stats Display Select what stats show and in what order. RelativeLayout
        solo.clickOnText(java.util.regex.Pattern.quote("Stats Display"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("c_g_chargeHrStatDisplay_i_statDisplay2");

    }
}
