Feature: Create account

  Scenario Outline: Create account with unique email

    Given user is on selenium demo page
    When user open account page
    And register with <email> and <password>
    Then should see logout link

    Examples:
    |email|password|
    |firstmail@gmail.com|blabla2435@#$%|
    |secondmail@gmail.com|oiuewrt@#$%@#$5|