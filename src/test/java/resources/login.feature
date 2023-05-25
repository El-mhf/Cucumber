Feature: login task

  Scenario Outline: Happy Scenario
    Given open browser
    When enter <email> and <password>
    And click login btn
    Then open homepage

    Examples: 
      | email           | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
