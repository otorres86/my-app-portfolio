package com.example.android.myappportfolio;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ScrollView;

/**
 * Created by Olga on 6/10/2015.
 * Test class for Main Activity of My Portfolio App
 * Referenced http://developer.android.com/training/activity-testing
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

    private MainActivity mainActivity;
    private View spotifyButton, scoresAppButton, libraryAppButton, buildItBiggerButton,
    xyzReaderButton, capstoneButton;
    private CharSequence spotifyMessage, scoresAppMessage, libraryAppMessage, buildItBiggerMessage,
    xyzReaderMessage, capstoneMessage;
    private ScrollView mainActivityScrollView;
    private View mainActivityAppLabel;

    //Constructor
    public MainActivityTest(){
        super(MainActivity.class);
    }

    //Set up the environment for testing
    @Override
    protected void setUp() throws Exception{
        super.setUp();
        //setting up for to control UI programmatically
        setActivityInitialTouchMode(true);

        mainActivity = getActivity();
        mainActivityScrollView = (ScrollView)mainActivity.findViewById(R.id.main_activity_scrollview);
        mainActivityAppLabel = mainActivity.findViewById(R.id.app_detail_label);
        spotifyButton = mainActivity.findViewById(R.id.spotify_streamer_button);
        scoresAppButton = mainActivity.findViewById(R.id.scores_app_button);
        libraryAppButton = mainActivity.findViewById(R.id.library_app_button);
        buildItBiggerButton = mainActivity.findViewById(R.id.build_it_bigger_button);
        xyzReaderButton = mainActivity.findViewById(R.id.xyz_reader_button);
        capstoneButton = mainActivity.findViewById(R.id.capstone_button);
        spotifyMessage = mainActivity.getString(R.string.spotify_streamer_message);
        scoresAppMessage = mainActivity.getString(R.string.scores_app_message);
        libraryAppMessage = mainActivity.getString(R.string.library_app_message);
        buildItBiggerMessage = mainActivity.getString(R.string.build_it_bigger_message);
        xyzReaderMessage = mainActivity.getString(R.string.xyz_reader_message);
        capstoneMessage = mainActivity.getString(R.string.capstone_message);
    }

    //Test if all objects set up above are not null
    public void test_InitializedNotNull(){
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("mainActivityScrollView is null", mainActivityScrollView);
        assertNotNull("mainActivityAppLabel is null", mainActivityAppLabel);
        assertNotNull("spotifyButton is null", spotifyButton);
        assertNotNull("scoresAppButton is null", scoresAppButton);
        assertNotNull("libraryAppButton is null", libraryAppButton);
        assertNotNull("buildItBiggerButton is null", buildItBiggerButton);
        assertNotNull("xyzReaderButton is null", xyzReaderButton);
        assertNotNull("capstoneButton is null", capstoneButton);
        assertNotNull("spotifyMessage is null", spotifyMessage);
        assertNotNull("scoresAppMessage is null", scoresAppMessage);
        assertNotNull("libraryAppMessage is null", libraryAppMessage);
        assertNotNull("buildItBiggerMessage is null", buildItBiggerMessage);
        assertNotNull("xyzReaderMessage is null", xyzReaderMessage);
        assertNotNull("capstoneMessage is null", capstoneMessage);
    }

    /************ LAYOUT TESTS ************/

    //Tests if Scrollview layout parameters match expected
    public void testScrollview_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, mainActivityScrollView);

        final ViewGroup.LayoutParams layoutParams = mainActivityScrollView.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.MATCH_PARENT);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.MATCH_PARENT);
    }

    //Tests if App label layout parameters match expected
    public void testMainViewAppLabel_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, mainActivityAppLabel);

        final ViewGroup.LayoutParams layoutParams = mainActivityAppLabel.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    //Tests if spotify app button layout is correct
    public void testSpotifyAppButton_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, spotifyButton);

        final ViewGroup.LayoutParams layoutParams = spotifyButton.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    //Tests if scores app button layout is correct
    public void testScoresAppButton_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, scoresAppButton);

        final ViewGroup.LayoutParams layoutParams = scoresAppButton.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    //Tests if library app button layout is correct
    public void testLibraryAppButton_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, libraryAppButton);

        final ViewGroup.LayoutParams layoutParams = libraryAppButton.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    //Tests if build it bigger app button layout is correct
    public void testBuildItBiggerAppButton_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, buildItBiggerButton);

        final ViewGroup.LayoutParams layoutParams = buildItBiggerButton.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    //Tests if xyz reader app button layout is correct
    public void testXyzReaderAppButton_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, xyzReaderButton);

        final ViewGroup.LayoutParams layoutParams = xyzReaderButton.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    //Tests if capstone app button layout is correct
    public void testCapstoneAppButton_layout(){
        final View activityDecorView = mainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(activityDecorView, capstoneButton);

        final ViewGroup.LayoutParams layoutParams = capstoneButton.getLayoutParams();
        assertNotNull(layoutParams);
        assertEquals(layoutParams.height, WindowManager.LayoutParams.WRAP_CONTENT);
        assertEquals(layoutParams.width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    /**** DISPLAY PROJECT NAME NOT CAUSING EXCEPTIONS TESTS *****/

    //Tests if pressing a spotify streamer button does not cause any exception to be thrown
    public void testSpotifyButton_noExceptionsEncounteredTest(){
        boolean exceptionCaught = false;
        try{
            mainActivity.DisplayProjectName(spotifyButton);
        }
        catch(Exception ex){
            exceptionCaught = true;
        }
        assertFalse(exceptionCaught);
    }

    //Tests if pressing a scores app button does not cause any exception to be thrown
    public void testScoresAppButton_noExceptionsEncounteredTest(){
        boolean exceptionCaught = false;
        try{
            mainActivity.DisplayProjectName(scoresAppButton);
        }
        catch(Exception ex){
            exceptionCaught = true;
        }
        assertFalse(exceptionCaught);
    }

    //Tests if pressing a library app button does not cause any exception to be thrown
    public void testLibraryAppButton_noExceptionsEncounteredTest(){
        boolean exceptionCaught = false;
        try{
            mainActivity.DisplayProjectName(libraryAppButton);
        }
        catch(Exception ex){
            exceptionCaught = true;
        }
        assertFalse(exceptionCaught);
    }

    //Tests if pressing a build it bigger app button does not cause any exception to be thrown
    public void testBuildItBiggerAppButton_noExceptionsEncounteredTest(){
        boolean exceptionCaught = false;
        try{
            mainActivity.DisplayProjectName(buildItBiggerButton);
        }
        catch(Exception ex){
            exceptionCaught = true;
        }
        assertFalse(exceptionCaught);
    }

    //Tests if pressing a xyz reader app button does not cause any exception to be thrown
    public void testXyzReaderAppButton_noExceptionsEncounteredTest(){
        boolean exceptionCaught = false;
        try{
            mainActivity.DisplayProjectName(xyzReaderButton);
        }
        catch(Exception ex){
            exceptionCaught = true;
        }
        assertFalse(exceptionCaught);
    }

    //Tests if pressing a capstone app button does not cause any exception to be thrown
    public void testCapstoneAppButton_noExceptionsEncounteredTest(){
        boolean exceptionCaught = false;
        try{
            mainActivity.DisplayProjectName(capstoneButton);
        }
        catch(Exception ex){
            exceptionCaught = true;
        }
        assertFalse(exceptionCaught);
    }
}
