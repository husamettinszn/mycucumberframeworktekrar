Feature:US1014_DbRead
  Scenario: TC_21 kullanici veri okur
    Given kullanici CK_Hotels veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verileri alir
    And kullanici "Price" sutunundaki verileri okur