Feature: post feature of facebook
  this will test the post functionality at the user wall

  Scenario: post a message on user wall
    Given user should be logged in and should be present on his wall
    When I type the message in the text box
    And click on post button
    Then the message should get posted

  Scenario: post a video on user wall
    Given user should be logged in and should be present on his wall
    When user supply the youtube link in the box
    And click on post button
    Then the video should get posted on the user wall
    And the video should have proper thumbnail