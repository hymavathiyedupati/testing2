Feature: Post feature of facebook
  This will the post functionality at the user wall

  Background: this is for common steps
    Given user should be logged in and should be present on his wall

  Scenario: post a message on the user wall
    When i type the message as "My Post" in the text box
    And click on post button
    Then the message should get posted

  Scenario: post a video on the user wall
    When user supply the youtube link as "https://www.facebook.com/" in the text box
    And click on post button
    Then the video should get posted on the user wall
    And the video should have proper thumbnail