package beans;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQL")
public class MySQLDatabaseConnection implements  DatabaseConnection {
    public String getConnection() {
        return "Mysdg connection";
    }
}
