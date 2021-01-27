Feature: US1003amazon_search_parametreli
  @wip
  Scenario: TC05_parametre_kullanma
    When  kullanici amazon sayfaya gider
    And "sozenler" icin arama yapar
    Then sonucun "sozenler" icerdigini test eder
    Then kullanici sayfayi kapatir
