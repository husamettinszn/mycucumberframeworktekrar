Feature: US012_Global_Trader_Login
  Scenario: TC_001 Gecerli Email ve gecerli password ile login olunmali
    Given Kullanici GlobalTrader sayfasina gider
    And kullanici Sing In linkine tiklar
    And kullanici emailTextBox'a gecerli bir email adresi girer
    And kullanici passwordTextBox'a gecerli bir sifre girer
    And kullanici Login butonuna tiklar
    Then kullanici "https://www.glbtrader.com/my_order.html" sayfasinin goruntulendigini dogrular