package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class l_account_c_badges extends ActivityInstrumentationTestCase2 {
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
    public l_account_c_badges() throws ClassNotFoundException {
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
        //Sleep
        solo.sleep(500);
        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep
        solo.sleep(500);
        //tap Account
        solo.clickOnText(java.util.regex.Pattern.quote("Account"));
        //Wait for activity: 'com.fitbit.settings.ui.ProfileActivity_'
        assertTrue("ProfileActivity is not found!", solo.waitForActivity("ProfileActivity"));

        //Click on High Tops 20,000 steps in a day
        solo.clickOnText(java.util.regex.Pattern.quote("Happy Hill"));
        //Wait for activity: 'com.fitbit.data.domain.badges.BadgeDetailActivity_'
        assertTrue("BadgeDetailActivity is not found!", solo.waitForActivity("BadgeDetailActivity"));
        //Sleep
        solo.sleep(500);
        //Press menu back key
        solo.goBack();

        //Sleep
        solo.sleep(500);
        //Scroll to Sneakers 10,000 steps in a day
        android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
        solo.scrollListToLine(listView0, 3);
        //Click on Sneakers 10,000 steps in a day
        solo.clickOnText(java.util.regex.Pattern.quote("Weight Loss"));
        //Wait for activity: 'com.fitbit.data.domain.badges.BadgeDetailActivity_'
        assertTrue("BadgeDetailActivity is not found!", solo.waitForActivity("BadgeDetailActivity"));
        //Sleep
        solo.sleep(100);
        //Press menu back key
        solo.goBack();

        //Sleep
        solo.sleep(500);
        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
    }
}
