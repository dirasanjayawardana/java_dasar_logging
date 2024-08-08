package java_dasar_logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
//    Logger adalah class utama untuk melakukan logging.
//    Nama logger biasanya menggunakan nama class lokasi Logger tersebut.
//    Untuk membuat Logger, tidak perlu membuat object, cukup menggunakan factory class LoggerFactory.getLogger(ClassSaatIni)

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog() {
        System.out.println("Hello Logger");
        log.info("Hello Logger");

        System.out.println("Java Dasar Logging");
        log.info("Java Dasar Logging");
    }
}
