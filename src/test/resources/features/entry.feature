Feature: Entry
  As a end user
  I want to create single, multiple entry and delete entry
  So that i can add different hotels entry to the systems

  Scenario Outline: Single entry
    Given I log into system with "admin" and "password"
    When I provide "<Hotel name>" "<Address>" "<Owner>" "<phone>" "<email>"
    Then I should see "<expected>" entry in the list
    Examples:
      | Hotel name | Address | Owner       | phone       | email                         | expected |
      | Novatel    | London  | Novatel Ltd | 02085436688 | novatel@customerservice.co.uk | Novatel  |
      | Ramada     | London  | Ramada Ltd  | 02086432345 | ramada@customerservice.co.uk  | Ramada   |
      | Parkinn    | London  | Parkinn Ltd | 01134341245 | parkinn@customerservice.co.uk | Parkinn  |

  Scenario Outline: Delete Entry
    Given I log into system with "admin" and "password"
    When I want to delete an entry
    Then I should see the "<entry>" is deleted
    Examples:
      | entry   |
      | Novatel |
















