package com.examples.cicdtestingproject.testcase

import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.examples.cicdtestingproject.MainActivity
import com.examples.cicdtestingproject.R
import com.microsoft.appcenter.espresso.Factory
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {


    private lateinit var password: String
    private lateinit var validMobileNumber: String
    private lateinit var validPassword: String
    private lateinit var reEnterPassword: String


    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Rule
    @JvmField
    public var reportHelper = Factory.getReportHelper()

    @After
    fun TearDown() {
        reportHelper.label("Stopping App")
    }

    /**
     *
     */
    @Before
    @Throws(Exception::class)
    fun setUp() {
        validMobileNumber = "1414141414"
        validPassword = "123456789"
        reEnterPassword = "demodemo11"


    }

    /**
     *Login Driver successfully
     */
    @Test
    fun loginFunctions() {
        Espresso.onView(withId(R.id.mainLayout))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        SystemClock.sleep(5000)
        Espresso.onView(withId(R.id.userNumber)).perform(ViewActions.typeText("0300303030333"))
        Espresso.closeSoftKeyboard()
        SystemClock.sleep(5000)
        Espresso.onView(withId(R.id.userPassword)).perform(ViewActions.typeText("12344567"))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.loginButton)).perform(ViewActions.click())
        SystemClock.sleep(25000)
    }


}