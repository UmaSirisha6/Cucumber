Feature: LMStrail verifying registration page

  Scenario: LMStrail user is trying to register
    Given LMStrail User is on Registration page
    When LMStrail enters all details and click on register
      | Uma   | Brahmakumari | paramdham | 0000000000 |
      | Akila | Brahmakumari | paramdham |  111111111 |
    Then LMStrail registration is successful

  Scenario: LMStrail user is trying to register with columns
    Given LMStrail User is on Registration page
    When LMStrail enters all details and click on register with columns
      | Firstname | Lastname     | address   | phone      |
      | Uma       | Brahmakumari | paramdham | 0000000000 |
      | Akila     | Brahmakumari | paramdham |  111111111 |
    Then LMStrail registration is successful
