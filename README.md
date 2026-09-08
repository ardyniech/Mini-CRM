# Mini-CRM

Mini-CRM adalah aplikasi manajemen hubungan pelanggan (Customer Relationship Management) berbasis Android yang dirancang dengan arsitektur modern menggunakan Room Database dan MVVM pattern.

## Fitur Utama
- Manajemen data pelanggan (CRUD).
- Penyimpanan lokal dengan Room Persistence Library.
- Implementasi Dependency Injection untuk arsitektur yang bersih.

## Teknologi yang Digunakan
- Kotlin
- Room Database
- ViewModel & LiveData
- Coroutines (untuk operasi asinkron)

## Struktur Proyek
- `data/`: Mengelola akses data (DAO, Database, Repository).
- `ui/`: Antarmuka pengguna (Activity).
- `viewmodel/`: Logika bisnis aplikasi.
- `di/`: Konfigurasi Dependency Injection.

## Lisensi
MIT