package dbStepDefinitions;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbReadWithDBUtils {

    @Given("kullanici DBUtils ile CK_Hotels veritabanina baglanir")
    public void kullanici_db_utils_ile_ck_hotels_veritabanina_baglanir() {
        DBUtils.getConnection();
    }

    @Given("kulanici DBUtils {string} tablosundaki {string} verilerini okur")
    public void kulanici_db_utils_tablosundaki_verilerini_okur(String table, String field) {
        String query="SELECT "+field+"FROM dbo."+table;
        DBUtils.executeQuery(query);

    }

    @Given("kullanici DBUtils ile {string} sutunundaki verileri okur")
    public void kullanici_db_utils_ile_sutunundaki_verileri_okur(String field) throws SQLException {
        DBUtils.getResultset().first();
        Object ilkSatirdakiObje=DBUtils.getResultset().getObject(field);
        System.out.println(ilkSatirdakiObje.toString());


    }

}
