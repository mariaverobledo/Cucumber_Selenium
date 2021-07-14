Feature: Category Web Tables
  As a ToolsQa user I want to use the Web Tables item

  Background:
    Given User on the ToolsQA Home Page
    When  Click on the Web Tables Section

  Scenario: Delete register
    And   Enter name in search field
    And   Click on 'Delete'
    Then  Register is deleted

  Scenario: Edit register
    And   Enter name in search field
    And   Click on 'Edit'
    And   Enter name to edit in search field
    And   Click on 'Submit'