package jdbc_persistence.src.main;

import jdbc_persistence.src.db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        DB.closeConnection();

    }
}
