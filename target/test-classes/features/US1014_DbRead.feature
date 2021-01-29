@db
Feature: US1014_DbRead
  Scenario: TC_21 kullanici veri okur

    Given kullanici CK_Hotels veritabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur
@dbah
  Scenario: TC_22 kullanici DBUtils ile yapar
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And kulanici DBUtils "tHOTELROOM" tablosundaki "Price" verilerini okur
    And  kullanici DBUtils ile "Price" sutunundaki verileri okur