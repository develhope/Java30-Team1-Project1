import java.sql.*;

public class SuperHero {


    private static final String DB_URL = "jdbc:mysql://localhost:3307/test";
    private static final String USER = "root";
    private static final String PASS = "Ginofaby4924";

    public void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = conn.createStatement();


        String createQuery = """
                CREATE TABLE IF NOT EXISTS superHeroes
                ( heroes_id INTEGER(10) NOT NULL AUTO_INCREMENT,
                  name VARCHAR(30),
                  power VARCHAR(30),
                  team VARCHAR(25),
                  CONSTRAINT superHeroes_pk PRIMARY KEY (heroes_id)
                );
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella heroes creata");
    }

    public void insertHeroes(String name, TeamName teamName) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO superHeroes (name, team) VALUES ('" + name + "', '" + teamName.getName() + "');";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");

    }

    public void printAllHeroes() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from superHeroes;
                """;

        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i +1;
            System.out.println(" name " + resultSet.getString("name") + i);
            System.out.println(" - team " + resultSet.getString("team") + i);
            System.out.println(" - power " + resultSet.getString("power") + i);

        }

        conn.close();

    }

    public void updateQuery() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = conn.createStatement();
        String printQuery = """
                  SELECT * from superHeroes;

                """;
        ResultSet resultSet = statement.executeQuery(printQuery);

        String findName = null;
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String team = resultSet.getString("team");
            if (team.equals(TeamName.XMAN.getName())) {
                findName = name;
            }
        }
        String updateTable = """
                UPDATE superHeroes
                SET power = 'high' 
                WHERE name = '""" + findName + "';";

        statement.executeUpdate(updateTable);

        conn.close();
        System.out.println("Update SuperHeroes" +findName);

    }

    public enum TeamName {
        XMAN("X-MAN_MUTANTI", 1),
        FANTASTIC4("FANTASTIC4ANDSPIDERMAN",2),
        FREELANCE("DA SOLO",3);

        private final String name;
        private final Integer id;

        TeamName(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public Integer getId() {
            return id;
        }

        public static TeamName getTeamNameEnumFromId(Integer id) {

            TeamName teamNameSelected = null;

            for (TeamName teamNameEnum : TeamName.values()) {
                if(teamNameEnum.getId().equals(id)){
                    teamNameSelected = teamNameEnum;
                }
            }

            return teamNameSelected;
        }

    }

    public  void metodoRecuperoDatabase(Integer id) throws SQLException {
        SuperHero superHero = new SuperHero();

        superHero.createTable();
        superHero.insertHeroes("Spiderman", TeamName.XMAN);
        superHero.printAllHeroes();
        superHero.updateQuery();

        TeamName teamName = TeamName.getTeamNameEnumFromId(id);
    }

    public static void main(String[] args) throws SQLException {
        SuperHero superHero = new SuperHero();
        superHero.metodoRecuperoDatabase(1);
    }
}


