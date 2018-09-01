package com.narendra.samplequeue.cucumber.stepdefs;

import com.narendra.samplequeue.SampleQueueApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SampleQueueApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
