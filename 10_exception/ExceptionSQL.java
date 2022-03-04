import java.sql.SQLException;

public class ExceptionSQL {
    public static void main(String[] args) throws SQLException {
        throwSQLException();
    }

    static void throwSQLException() {
        try {
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("Caught SQLException");
        }
    }
}
