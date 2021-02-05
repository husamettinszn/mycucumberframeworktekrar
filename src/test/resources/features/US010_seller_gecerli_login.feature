Feature: US010_Seller_gecerli_login


  @db
  Scenario: TC_001 Gecerli Email ve gecerli password ile login olunmali
    Given Kullanici GlobalTrader anasayfasina gider
    And kullanici Sing In linkine tiklar
    And kullanici emailTextBox'a gecerli bir email adresi girer
    And kullanici passwordTextBox'a gecerli bir sifre girer
    And kullanici Login butonuna tiklar
    Then kullanici gidilen sayfanin url'nin login sayfasinin url'i oldugunu dogrular