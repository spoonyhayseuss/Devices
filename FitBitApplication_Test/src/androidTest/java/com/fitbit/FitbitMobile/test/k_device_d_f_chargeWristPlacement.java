package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class k_device_d_f_chargeWristPlacement extends ActivityInstrumentationTestCase2 {
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
    public k_device_d_f_chargeWristPlacement() throws ClassNotFoundException {
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
        //Sleep for 2680 milliseconds
        solo.sleep(2680);
        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1433 milliseconds
        solo.sleep(1433);
        //tap Devices
        solo.clickOnText(java.util.regex.Pattern.quote("Devices"));
        //Sleep for 1511 milliseconds
        solo.sleep(1511);
        //Click on UPDATE AVAILABLE Surge Last synced: 13 mins ago RelativeLayout
        solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.device.ui.TrackerDetailsActivity_'
        assertTrue("TrackerDetailsActivity_ is not found!", solo.waitForActivity("TrackerDetailsActivity_"));
        //Sleep for 2980 milliseconds
        solo.sleep(2980);
        //Click on Wrist Placement Non Dominant RelativeLayout
        solo.clickOnText(java.util.regex.Pattern.quote("Wrist Placement"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep for 2612 milliseconds
        solo.sleep(2612);
        //Click on Dominant
        solo.clickOnView(solo.getView(android.R.id.text1));
        //Take screenshot
        solo.takeScreenshot();
        //Sleep for 7247 milliseconds
        solo.sleep(7247);
        //Click on Wrist Placement Dominant RelativeLayout
        solo.clickOnText(java.util.regex.Pattern.quote("Wrist Placement"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        //Sleep for 1346 milliseconds
        solo.sleep(1346);
        //Click on Non Dominant
        solo.clickOnView(solo.getView(android.R.id.text1, 1));
        //Take screenshot
        solo.takeScreenshot();
    }
}
