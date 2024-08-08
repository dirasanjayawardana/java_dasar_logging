package java_dasar_logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {
//    Level merupakan jenis informasi log
//    Level memiliki tingkatan, semakin tinggi artinya informasinya semaking penting
//    urutan levelnya dari trace sampai error (yang paling penting)

//    ketika menggunakan SLF4F dengan library Logback, secara default hanya menampilkan log dengan level debug keatas

    private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

    @Test
    void testLevel() {
        log.trace("Trace"); // untuk menambahkan informasi tracing
        log.debug("Debug"); // untuk menambahkan informasi debuging
        log.info("Info"); // untuk menambahkan informasi
        log.warn("Warning"); // untuk menambahkan peringatan
        log.error("Error"); // untuk menambahkan error
    }
}
