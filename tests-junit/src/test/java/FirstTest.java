import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class FirstTest {
    private static  final Logger  logger = LogManager.getLogger(FirstTest.class);

    public static void main(String[] args) {

    }
@Test
    public void test1()
{
    logger.info("INFO");
    logger.debug("DEBUG");
    logger.error("error");
    logger.fatal("fatal");
    logger.warn("warn");
}

}
