//import java.sql.*;
//
//public class PrimiPiattiDao {
//
//    private static final String DB_URL = "jdbc:mysql://localhost:3307/test";
//    private static final String USER = "root";
//    private static final String PASS = "Ginofaby4924";
//
//    public void createTable() throws SQLException {
//
//        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//        Statement statement = conn.createStatement();
//
//
//        String createQuery = """
//                CREATE TABLE IF NOT EXISTS superHeroes
//                ( heroes_id INTEGER(10) NOT NULL AUTO_INCREMENT,
//                  name VARCHAR(30),
//                  power VARCHAR(30),
//                  team VARCHAR(25),
//                  CONSTRAINT superHeroes_pk PRIMARY KEY (heroes_id)
//                );
//                """;
//        statement.executeUpdate(createQuery);
//
//        conn.close();
//
//        System.out.println("Tabella heroes creata");
//    }
//
//    public void insertH(String name) throws SQLException {
//        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//        Statement statement = conn.createStatement();
//
//        String insertQuery = "INSERT INTO superHeroes (name, team) VALUES ('" + name + "', '" + teamName.getName() + "');";
//
//        statement.executeUpdate(insertQuery);
//
//        conn.close();
//
//        System.out.println("Tabella popolata");
//
//    }
//
//    public void printAll() throws SQLException {
//        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//        Statement statement = conn.createStatement();
//
//        String printQuery = """
//                SELECT * from superHeroes;
//                """;
//
//        ResultSet resultSet = statement.executeQuery(printQuery);
//
//        int i = 0;
//
//        while (resultSet.next()) {
//            i = i +1;
//            System.out.println(" name " + resultSet.getString("name") + i);
//            System.out.println(" - team " + resultSet.getString("team") + i);
//            System.out.println(" - power " + resultSet.getString("power") + i);
//
//        }
//
//        conn.close();
//
//    }
//
//
//
//}
