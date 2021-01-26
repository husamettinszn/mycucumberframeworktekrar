Feature: US1003amazon_search_parametreli
  @wip
  Scenario: TC05_parametre_kullanma
    When  kullanici amazon sayfaya gider
    And "sozenler" icin arama yapar
    Then sonucun "sozenler" icerdigini test eder
    Then kullanici sayfayi kapatir

Feature: US1003amazon_search_parametreli
  @wip
  Scenario: TC05_parametre_kullanma
    When  kullanici amazon sayfaya gider
    And "sozenler" icin arama yapar
    Then sonucun "sozenler" icerdigini test eder
    Then kullanici sayfayi kapatir

    Scenario:
      When kullanici amazon sayfaya gider
      And "zeka kupu" icin arama yapar
      Then sonucun "zeka kupu" icerdigini test eder
      Then kullanici sayfayi kapatir

  Scenario:
    When kullanici amazon sayfaya gider
    And "araba" icin arama yapar
    Then sonucun "zeka kupu" icerdigini test eder
    Then kullanici sayfayi kapatir