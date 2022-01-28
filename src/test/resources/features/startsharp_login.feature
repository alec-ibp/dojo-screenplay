# Author Alejandro Ibarra alibarr@bancolombia.com.co

  @stories
  Feature: StartSharp app
    I as a user of the app, I want to navigate on the website

  @scenario1
  Scenario: Make login on startSharp app
    Given Alejandro get into the website of startSharp app
    When he logged with the credentials admin and serenity as password
    Then he should see the main dashboard with the title Dashboard
