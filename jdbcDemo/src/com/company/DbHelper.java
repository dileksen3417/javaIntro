package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

//jdbc:mysql:// isimlendirme
//localhost: benim makinem, server olsaydı ip yazardım
//3306: mysqlin çalıştığı port
//world: database'imin adı
//useSSL=false : geliştirici olduğumuz için ssl kullanmıyorum diyoruz
//useUnicode...  : server ile pc arasında saat farkı varsa dikkate alma diyoruz

public class DbHelper {
    private String userName="root";
    private String password="12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException { //bir Connection(java class) döndüren bir method yazıyorum
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){//veritabanı ile ilgili bir hata olursa burada yönetelim
        System.out.println("Error: " + exception.getMessage()); //hata mesajını yazdıralım
        System.out.println("Error code : " + exception.getErrorCode()); //hata kodunu yazdıralım
    }

}
