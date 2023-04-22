
Feature: Api demos test
  Scenario: text box data gonderme
    Given App yuklensin
    And kullanici ana sayfada
    And kullanici Api Demos butonuna tiklar
    Then kullanici Api demos ekraninda oldugunu dogrular
    And kullanici preferance butonuna tiklar
    Then kullanici preference ekraninda oldugunu dogrular
    And kullanici preference dependicies tiklar
    And Kullanici wifi checkbox kutusunu tiklar
    And Kullanici wifi settings e tiklar
    Then Wifi settings pop up inin acildigini dogrular
    And Kullanici bir text yazar
    And ok butonuna tiklar
   # And ekrani kapatir


