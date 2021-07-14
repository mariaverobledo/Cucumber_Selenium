Feature: Category Browser Window
  As a ToolsQa user I want to use browser window item

  Background:
    Given User on the ToolsQA Home Page Frame
    When  Click on the Browser Window section

  Scenario: Click on New Tab button
    And   Click on New Tab Button
    Then  Should it open new tab
