Feature: Category File Upload/Download
  As a ToolsQa user I want to use the Upload/Download item

  Background:
    Given User on the ToolsQA Home Page
    When  Click on the Upload/Download Section

  Scenario: Download File
    And click on button download
    Then file is downloaded

  Scenario: Upload File
    And click on button upload
    Then file is uploaded

