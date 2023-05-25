Feature: login task

  Scenario Outline: Valid and Invalid Scenarios
    Given open browser
    When enter <email> and <password>
    And click login btn
    Then open homepage

    Examples: 
      | email           | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | Mohamed_Hany    | momo_testing |
      | amit_test       | amit_invalid |
