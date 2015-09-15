package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class l_account_q_foodDatabase extends ActivityInstrumentationTestCase2 {
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
    public l_account_q_foodDatabase() throws ClassNotFoundException {
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
        //Sleep
        solo.sleep(500);
        //Click BURGER
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep
        solo.sleep(500);
        //Click on Account
        solo.clickInList(4, 2);
        //Wait for activity: 'com.fitbit.settings.ui.ProfileActivity'
        assertTrue("ProfileActivity is not found!", solo.waitForActivity("ProfileActivity"));
        //Sleep
        solo.sleep(500);
        solo.clickOnText(java.util.regex.Pattern.quote("SETTINGS"));
        solo.sleep(1000);

        //Click on Food database United States
        solo.clickOnView(solo.getView("spn_food_database"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on Australia
        solo.clickOnView(solo.getView(android.R.id.text1, 4));

        solo.sleep(500);
        //Click on Food database Australia
        solo.clickOnView(solo.getView("spn_food_database"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on United States
        solo.clickOnView(solo.getView(android.R.id.text1, 2));
        solo.sleep(1000);






    }
}
