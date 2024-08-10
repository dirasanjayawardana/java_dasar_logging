package java_dasar_logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

import dirapp.java_dasar_logging.MyController;
import dirapp.java_dasar_logging.MyRepository;
import dirapp.java_dasar_logging.MyService;

public class MyTest {
  // MDC (Mapped Diagnostic Context) merupa fitur seperti thread local, dimana bisa memberi informasi tambahan kepada logger
  // tanpa harus kirim data manual ke class atau method.
  // data yang tersimpan secara lokal di dalam thread, tidak bisa diakses dari thread yang berbeda
  // untuk mengambil data dari MDC, cukup edit bagian patternLayout nya, %X{keyNya}

  @Test
  void testRequestId() throws InterruptedException {
    MyController controller = new MyController(new MyService(new MyRepository()));

    for (int i = 0; i < 10; i++) {
      new Thread(() -> {
        String requestId = UUID.randomUUID().toString();
        // MDC.put(key, value)
        MDC.put("requestId", requestId);
        controller.save();
        // MDC.remove(key);
        MDC.remove("requestId");
      }).start();
    }

    Thread.sleep(1000L);
  }
}
