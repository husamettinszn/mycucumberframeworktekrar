Feature: US11001 amazon page search

  Scenario:
    Given kullanici amazon sayfaya gider
    And iphone icin arama yapar
    Then  sonucun iphone icerdigini test eder

    Given kullanici amazon sayfaya gider
    And teapot icin arama yapar
    Then sonucun teapot icerdigini test eder

    Given kullanici amazon sayfaya gider
    And flower icin arama yapar
    Then sonucun flower icerdigini test eder

    And kullanici sayfayi kapatir
