package carl.querydsl.domain;

import com.querydsl.core.Tuple;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.OracleTemplates;
import com.querydsl.sql.SQLQueryFactory;
import oracle.jdbc.driver.OracleDriver;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Create by Administrator on 2016/9/24.
 */
public class QSysPUserTest {
    private SQLQueryFactory sqlQueryFactory = null;
    @Before
    public void setUp() throws Exception {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(OracleDriver.class);
//        dataSource.setUrl("jdbc:oracle:thin:@192.168.100.235:1555:CARDDB");
        dataSource.setUrl("jdbc:oracle:thin:@sunrise.myftp.org:1555:CARDDB");
        dataSource.setUsername("ESALEB_DEV");
        dataSource.setPassword("ESB1211DEV");
        sqlQueryFactory = new SQLQueryFactory(new Configuration(new OracleTemplates()), dataSource);
        
    }
    
    @Test
    public void testSelect() {
        QSysPUser sysPUser = new QSysPUser("user");
        List<Tuple> lastNames = sqlQueryFactory.select(sysPUser.name, sysPUser.account, sysPUser.password).from(sysPUser)
                .where(sysPUser.account.eq("admin")).fetch();
        System.out.println(lastNames);
    }
}