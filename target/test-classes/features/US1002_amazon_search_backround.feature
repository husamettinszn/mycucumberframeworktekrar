Feature: US1002_amazon_search_background

  Scenario: TC02_amazon_iphone_arama_testi
    Given  kullanici amazon sayfaya gider
    And iphone icin arama yapar
    And sonucun iphone icerdigini test eder
    Then kullanici sayfayi kapatir

  Scenario: TC03_amazon_teapot_arama_testi
    Given kullanici amazon sayfaya gider
    And teapot icin arama yapar
    And sonucun teapot icerdigini test eder
    Then kullanici sayfayi kapatir

  Scenario: TC04_amazon_flower_arama_testi
    Given kullanici amazon sayfaya gider
    And flower icin arama yapar
    And sonucun flower icerdigini test eder
    Then kullanici sayfayi kapatir
