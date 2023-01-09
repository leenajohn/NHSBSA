@Regression
Feature: This feature would help to design check for help paying nhs cost start page
    
     Background: Launch the browser 
     Given I am a citizen of UK and Launch checker tool
  Scenario: User wants to view Check what help you could get to pay NHS Costs section
    When I put my circumstance in checker tool
    Then I should get a result of whether I will get help or not
  