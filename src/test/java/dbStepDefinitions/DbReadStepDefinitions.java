package dbStepDefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class DbReadStepDefinitions {

    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2; user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("kullanici CK_Hotels veritabanina baglanir")
    public void kullanici_ck_hotels_veritabanina_baglanir() throws SQLException {
        connection= DriverManager.getConnection(url, username, password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
        String query="SELECT "+field+" FROM dbo."+table;
        resultSet=statement.executeQuery(query);

    }

    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {
        resultSet.first();
        Object ilkSatirdakiObje= resultSet.getObject(field);
        System.out.println(ilkSatirdakiObje.toString());

        resultSet.next();
        Object ikinciSatirdekiObje=resultSet.getObject(field);
        System.out.println(ikinciSatirdekiObje.toString());

        resultSet.absolute(7);
        Object yedinciSatirdekiObje=resultSet.getObject(field);
        System.out.println(yedinciSatirdekiObje.toString());

        resultSet.absolute(1);
        while (resultSet.next()){
            Object satirdakiobje= resultSet.getObject(field);
            System.out.println(satirdakiobje.toString());
        }

    }

}
