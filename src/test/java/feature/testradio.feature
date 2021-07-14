Feature: Categoría Radio Button
  Como usuario de ToolsQa quiero usar el elemento RadioButton

  Background:
    Given User on the ToolsQA Home Page
    When  Click on the Radio Button section

  Scenario: Enter the Radio Button section
    And   Click on 'Yes'
    Then  Should display messagge 'You have selected Yes'

  Scenario: Enter the Radio Button Section
    And   Click on 'Impressive'
    Then  Should display message 'Impressive'

  Scenario: Enter the Radio Button Section
    And   Click on 'No'
    Then  It should not allow to select 'No'