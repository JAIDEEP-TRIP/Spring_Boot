package com.JDBCCourse;
import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        /*
        import packages
        load and register
        create connection
        create statement
        execute statement
        process the result
        close
         */
        int sid = 7;
        String sname = "jaideep";
        int marks = 50;
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "admin";
//        String sql = "update student set sname='Aishwarya' where sid =6";
//        String fetch =  "Select sname from student where sid = 6 ";
        String sql = "insert into student values (?,?,?)";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        PreparedStatement st = con.prepareStatement(sql);
//        String sql = "select sname from student where sid =1";
//        String sql = "select * from student";
//        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("same of a student is "+ name);
//        while (rs.next()){
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getInt(2)+" - ");
//            System.out.print(rs.getString(3));
//            System.out.println();
//        }
//        st.execute(sql);
//        System.out.println("rows inserted");
        st.setInt(1,sid);
        st.setInt(2,marks);
        st.setString(3,sname);

        st.execute();
//
//         ResultSet rs = st.executeQuery(fetch);
//         rs.next();
//        System.out.println(rs.getString(1));

//
//        ResultSet rs = st.executeQuery(fetch);
//        rs.next();
//        System.out.println(rs.getString(1));



        con.close();
        System.out.println("Connection Closed");
    }

}
