Feature: US1014_DbRead
  Scenario: TC_21 kullanici veri okur

    Given kullanici CK_Hotels veritabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur