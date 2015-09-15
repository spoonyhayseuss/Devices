package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class l_account_j_settingsGoalsNutritionFoodPlan extends ActivityInstrumentationTestCase2 {
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
    public l_account_j_settingsGoalsNutritionFoodPlan() throws ClassNotFoundException {
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
        solo.clickOnText(java.util.regex.Pattern.quote("Nutrition & Body"));

        //solo.clickOnView(solo.getView("activity"));
        //Wait for activity: 'com.fitbit.settings.ui.GoalsActivity'
        //assertTrue("GoalsActivity is not found!", solo.waitForActivity("GoalsActivity"));
        solo.sleep(1000);
        solo.clickOnView(solo.getView("food_plan_container"));
        solo.sleep(1000);
        solo.clickOnText(java.util.regex.Pattern.quote("EDIT PLAN"));
        solo.clearEditText(0);
        solo.enterText(0, "200");
        solo.clearEditText(1);
        solo.enterText(1, "195");
        solo.clickOnText(java.util.regex.Pattern.quote("NEXT"));
        solo.clickOnText(java.util.regex.Pattern.quote("Kinda hard"));
        solo.clickOnText(java.util.regex.Pattern.quote("NEXT"));
        solo.clickOnText(java.util.regex.Pattern.quote("NEXT"));
        solo.clickOnText(java.util.regex.Pattern.quote("NEXT"));
        solo.clickOnText(java.util.regex.Pattern.quote("SAVE PLAN"));



    }
}
