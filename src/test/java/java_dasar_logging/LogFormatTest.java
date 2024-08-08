package java_dasar_logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFormatTest {
//    SLF4J menyediakan format penulisan log dengan beberapa parameter, tidak perlu menggunakan concat String manual
//    level(String), level(String, Object...), level(String, Throwable)

    private static final Logger log = LoggerFactory.getLogger(LogFormatTest.class);

    @Test
    void testLogFormat() {
        log.info("Without Parameter");
        log.info("{} + {} = {}", 10, 10, (10 + 10));
        log.error("Ups", new NullPointerException());
    }
}
