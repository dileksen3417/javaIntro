package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        //selectDemo();
        //manualInsert();
        //uiInsert();
        //updateManuel();
        //updateUI();

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();

            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4081);
            statement.executeUpdate();
            System.out.println("Kayıt silindi.");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı sonlandı.");
        }

    }

    private static void updateUI() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();

            String sql = "update city set population=?,district=? where id = ?";
            statement = connection.prepareStatement(sql);

            statement.setInt(1,99000);
            statement.setString(2,"Duzce 2");
            statement.setInt(3,4081);

            statement.executeUpdate();
            System.out.println("Kayıt güncellendi.");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı sonlandı.");
        }
    }

    private static void updateManuel() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();

            String sql = "update city set population=80000,district='Duzce' where id = 4081"; //düzce2'nin dbdeki idsi.
            statement = connection.prepareStatement(sql);

            statement.executeUpdate();
            System.out.println("Kayıt güncellendi.");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı sonlandı.");
        }
    }

    private static void uiInsert() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            //db baglantısını kuralım**********************
            connection = dbHelper.getConnection();
            System.out.println("Bağlantı oluştu.");

            //insert işlemini hazırlayalım**********************
            String sql = "insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            //eklenecek verileri UI'dan aldığımız düşünelim.. her bir soru işaretine karşılık yerleri atayalım:

            statement.setString(1, "Düzce 2"); //1. soru işaretine = Name alanı dbde char oldugu için setString derim.
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 79000); //Population alanı int olduğu için setInt

            //insert işlemini çalıştıralım********************
            statement.executeUpdate();
            System.out.println("Kayıt eklendi.");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı sonlandı.");
        }
    }

    private static void manualInsert() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null; //insert işlemleri PreparedStatement keyword ile yapılır.
        //bir insert yaptığım için sonuc kümem yok yani resultSet oluşturmama gerek yok
        try {
            connection = dbHelper.getConnection();
            System.out.println("Bağlantı oluştu.");
            statement = connection.prepareStatement( //cümle hazırla diyorum
                    "insert into city(Name,CountryCode,District,Population) values('Düzce','TUR','Düzce',50000)");
            //normalde bu alanı elle vermeyiz kullanıcıdan alırız.
            statement.executeUpdate(); //hazırladığım sql kodunu çalıştır diyorum.
            System.out.println("Kayıt eklendi.");
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı sonlandı.");
        }
    }

    private static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null; //statement=javada, sql sorgu cümlecigi anlamına gelir.
        ResultSet resultSet; //Resultset ise Javada sql sorgusundan dönen cevaba karşılık gelmektedir.
        try {
            connection = dbHelper.getConnection();
            System.out.println("Bağlantı oluştu.");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code, Name, Continent,Region from country");
            //resultset'i nesnelere bağlayalım:
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) { //tek tek iterate et yani tek tek gez
                countries.add(new Country(
                        resultSet.getString("Code"), //code alanı dbde string oldugu için burada getString deriz.
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")
                ));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            connection.close();
            System.out.println("Bağlantı sonlandı.");
        }
    }
}
