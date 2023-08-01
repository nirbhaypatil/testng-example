Feature: Sample feature
  In order to...
  As a ....
  I should be able to ...

  @smoketest
  Scenario: Open google and search BDD keyword
    When I launch google
    And I search for BDD
    Then I should see BDD related articles

  @regressiontest
  Scenario: Open google and search TDD keyword
    When I launch google
    And I search for TDD
    Then I should see TDD related articles
