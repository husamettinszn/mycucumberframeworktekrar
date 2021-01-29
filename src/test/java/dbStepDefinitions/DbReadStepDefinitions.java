package dbStepDefinitions;

import io.cucumber.java.en.Given;

public class DbReadStepDefinitions {

    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2; user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";

    @Given("kullanici CK_Hotels veritabanina baglanir")
    public void kullanici_ck_hotels_veritabanina_baglanir() {

    }

    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String string, String string2) {

    }

    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String string) {

    }

}
