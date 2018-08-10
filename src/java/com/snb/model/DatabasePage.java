package com.snb.model;

import java.util.*;
import java.sql.*;

public class DatabasePage {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/college_notice_board", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static int save(BasicInfo bi) {
        int status = 0;
        try {
           // System.out.println("Shubham");
            Connection con = DatabasePage.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "insert into user_registration values (?,?,?,?,?,?,?)");
            ps.setString(1, null);
            ps.setString(2, bi.getName());
            ps.setString(3, bi.getEmail());
            ps.setString(4, bi.getMobile_no());
            ps.setString(5, bi.getGender());
            ps.setString(6, bi.getUser());
            ps.setString(7, bi.getPassword());

            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return status;

    }
    public static boolean use(BasicInfo bi ){
    boolean status=false;
        try {
            Connection con = DatabasePage.getConnection();
            PreparedStatement ps = con.prepareStatement( "select * from user_registration where email='" +bi.getEmail()+ "' and password='" + bi.getPassword() + "';");
//           bi.getEmail();
//           bi.getPassword();
            System.out.println("look baby"+bi.getEmail());
            status=ps.execute();
            //status=ps.execute();
            System.out.println("statusDB  " + status);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }            
        return status;
    }
}
