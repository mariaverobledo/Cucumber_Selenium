Feature: Category Button
  As a ToolsQa user I want to use the button item

   Scenario: Double click on button
    Given User on the ToolsQA Home Page Elements
    When  Click on the Button section
    And   Double click on the button 'Double Click Me
    Then  Should display message 'You have done a double click'

  Scenario: Right click on button
    Given User on the ToolsQA Home Page Elements
    When  Click on the Button section
    And   Right click on the button 'Right Click Me
    Then  Should display message 'You have done a right click'

  Scenario: Click on button
    Given User on the ToolsQA Home Page Elements
    When  Click on the Button section
    And   Click on the button 'Click Me
    Then  Should display message 'You have done a dynamic click'


