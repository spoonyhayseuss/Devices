package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class l_account_r_units extends ActivityInstrumentationTestCase2 {
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
    public l_account_r_units() throws ClassNotFoundException {
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

        //Click on Units
        solo.clickOnView(solo.getView("cell_units"));
        //Wait for activity: 'com.fitbit.settings.ui.UnitsPickActivity'
        assertTrue("UnitsPickActivity is not found!", solo.waitForActivity("UnitsPickActivity"));

        solo.sleep(500);
        //Click on Length
        solo.clickOnView(solo.getView("spn_length"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on Feet, Miles
        solo.clickOnView(solo.getView(android.R.id.text1));

        solo.sleep(500);
        solo.clickOnView(solo.getView("spn_length"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on Feet, Miles
        solo.clickOnView(solo.getView(android.R.id.text1, 1));

        solo.sleep(500);




        //Click on Weight Stones
        solo.clickOnView(solo.getView("spn_weight"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on Kilograms
        solo.clickOnView(solo.getView(android.R.id.text1));
        solo.sleep(500);
        solo.clickOnView(solo.getView("spn_weight"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on Kilograms
        solo.clickOnView(solo.getView(android.R.id.text1, 2));
        solo.sleep(500);
        solo.clickOnView(solo.getView("spn_weight"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);

        solo.sleep(500);
        //Click on Kilograms
        solo.clickOnView(solo.getView(android.R.id.text1, 1));
        solo.sleep(500);




        //Click on Water Milliliters (ml)
        solo.clickOnView(solo.getView("spn_water"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        solo.sleep(500);
        //Click on US customary cup (cup)
        solo.clickOnView(solo.getView(android.R.id.text1, 1));
        //Click on Water Milliliters (ml)
        solo.clickOnView(solo.getView("spn_water"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        solo.sleep(500);
        //Click on US customary cup (cup)
        solo.clickOnView(solo.getView(android.R.id.text1, 2));
        //Click on Water Milliliters (ml)
        solo.clickOnView(solo.getView("spn_water"));
        //Wait for dialog
        solo.waitForDialogToOpen(5000);
        solo.sleep(500);
        //Click on US customary cup (cup)
        solo.clickOnView(solo.getView(android.R.id.text1
        ));
        solo.sleep(500);
        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));







    }
}
