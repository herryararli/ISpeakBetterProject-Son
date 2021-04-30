package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void start(){
        BasePage.initializeDriver();
    }

    @After
    public void end(){
        BasePage.tearDown();
    }
}
