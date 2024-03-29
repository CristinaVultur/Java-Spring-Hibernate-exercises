package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("Oracle")
public class OracleDatabaseConnection implements DatabaseConnection {

    public String getConnection() {
        return "Oracle Connection";
    }
}
