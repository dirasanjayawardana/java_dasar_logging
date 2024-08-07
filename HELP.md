# Logging
Log file adalah file yang berisikan informasi kejadian dari sebuah sistem. <br>
Logging adalah aksi menambah informasi log (aktivitas) ke dalam log file.

## Library untuk Java Logging
Java menyediakan package bawaan untuk logging, pada `java.util.logging`. <br>
Namun jarang digunakan karena kurang flexible. <br>

Beberapa library external untuk logging di Java :
- Apache Common Log
- Apache Log4J
- Logback

## SLF4J (Simple Logging Facade for Java)
Merupakan framework logging yang digunakan seperti API (Driver atau Abstract, mirip seperti JDBC di database), dimana bisa berganti-ganti implementasi logging frameworknya. <br>
Hanya perlu memilih library yang akan digunakan, secara otomatis SLF4J akan menggunakan implementasi library tersebut. <br>
Pada materi ini, akan menggunakan library Logback.

## Learning