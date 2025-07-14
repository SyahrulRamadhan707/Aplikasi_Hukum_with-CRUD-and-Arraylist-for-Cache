# Aplikasi Hukum dengan CRUD dan ArrayList untuk Cache

Repositori ini berisi aplikasi berbasis Java Swing yang digunakan untuk melakukan operasi CRUD (Create, Read, Update, Delete) dengan penyimpanan sementara menggunakan `ArrayList`, serta mendukung pemilihan tanggal menggunakan komponen **JCalendar** di NetBeans.

## 🔧 Fitur Utama

- CRUD data perkara hukum
- Penyimpanan sementara menggunakan `ArrayList`
- Pemilihan tanggal menggunakan JCalendar (komponen kalender dari `toedter.calendar.JDateChooser`)

---

## 🖥️ Cara Membuka Form dengan JCalendar di NetBeans

Berikut ini langkah-langkah untuk menggunakan **JCalendar** dalam form aplikasi Anda:

### 1. Tambahkan Library JCalendar ke Proyek
- Unduh library **JCalendar** (biasanya dalam bentuk `jcalendar-x.x.jar`) dari situs resmi atau repositori Maven.
- Di NetBeans, klik kanan pada project Anda → **Properties** → **Libraries** → klik **Add JAR/Folder**.
- Pilih file `jcalendar.jar` yang sudah diunduh.
- Klik OK untuk menyimpan.

### 2. Tambahkan Komponen JCalendar ke Palette
- Buka form `.java` Anda di tampilan desain (GUI Builder).
- Klik kanan pada **Palette** → pilih **Palette Manager**.
- Klik **Add from JAR** → pilih `jcalendar.jar`.
- Pilih komponen `JDateChooser` dari daftar dan tambahkan ke kategori yang diinginkan.

### 3. Gunakan Komponen di Form
- Seret dan letakkan `JDateChooser` ke form Anda seperti biasa.
- Anda dapat mengakses nilai tanggal terpilih dengan:

```java
Date tanggal = jDateChooser1.getDate();
