Feature: register on travel page
  I as a user want to register on the travel page to buy a travel package

  Scenario Outline:  register on travel page
    Given On the main page enter the registration option
    When he mandatory registration data is entered
      |  firstName  |  lastName  |  phone  |  email  |  address  |  city  |  state  |  postalCode  |  country  |  userName  |  password  |
      | <firstName> | <lastName> | <phone> | <email> | <address> | <city> | <state> | <postalCode> | <country> | <userName> | <password> |
    Then should see a message with your name
      | userName   |
      | <userName> |
    Examples:
      | firstName | lastName  | phone  | email     | address |  city    |  state | postalCode | country  | userName | password |
      |  leonardo | leonardo1 | 444444 | cor@ar.co | call 1  | sogamoso | boyaca | 152210     | COLOMBIA | leonardo | leonardo |
      |  angela   | Angela1   | 444444 | cor@ar.co | call 1  | sogamoso | boyaca | 152210     | COLOMBIA | angela   | Angela1  |
      |  felipe   | Felipe1   | 444444 | cor@ar.co | call 1  | sogamoso | boyaca | 152210     | COLOMBIA | felipe   | Felipe1  |
