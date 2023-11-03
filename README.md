# PA-Capstone

Judul Tema : Pengolahan Data Taman Kanak-kanak (TK)

Projek Akhir ini terdiri dari 4 Package, yaitu:
- Package 1 = Controller
- Package 2 = Model
- Package 3 = Database
- Package 4 = view

1) Package 1 Controller
a. ConstructorStaff
  - Pertama ialah syntax mendeklarasikan package yang digunakan dan mengimpor kelas-kelas yang diperlukan.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/39cc5762-8db1-40a3-b330-ef223fc67362)

  - constructorStaff adalah kelas yang digunakan untuk melakukan operasi terkait staff.
  - arraystaff adalah ArrayList yang digunakan untuk menyimpan data staf. Setiap data staff disimpan dalam bentuk array String.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/7cae1af9-5783-44e8-bae9-fe876eadbf33)

  - public boolean create(), adalah metode yang digunakan untuk menambahkan data staff ke database.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/19d27d9a-c3bb-4fd8-bda7-bd120d843f02)

  - openConnection() adalah metode yang digunakan untuk membuka koneksi ke database.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/4baaed39-d062-4bc8-a610-490a342a60b6)

  - public boolean updateStaff() adalah metode yang digunakan untuk mengupdate data staff, yang di update disini ialah bidang pekerjaan.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/1d9c43c4-72c0-4a46-9033-b2011fb69870)

  - Syntax ini menjalankan pernyataan SQL untuk mengupdate bidang pekerjaan staff berdasarkan ID staff yang di input.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/782e7ba1-9f12-4c28-a1b5-412da9f4afbe)

  - Public readStaff() adalah metode yang digunakan untuk membaca data staff dari tabel staff yang ada di database dan menyimpannya dalam ArrayList.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/ae31eb97-77ea-4be1-8c7c-90bd8fd26412)

  - Syntax ini mengeksekusi query SQL untuk mengambil data staf dari tabel staff dan menyimpannya dalam ArrayList .
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/4bbea2f0-d5b9-405d-a259-4819eb02c29f)

  - Public boolean delete() adalah metode yang digunakan untuk menghapus data staff dari tabel staff yang ada di database berdasarkan ID staff yang di input.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/3d7f84dc-cf6c-4f2c-93c0-bfa2f721cfeb)

  - Syntax ini menjalankan pernyataan SQL untuk menghapus data staf berdasarkan ID staf yang di input.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/1f0244cc-559a-411b-87de-9ff6076a92ab)

  - Public boolean find() adalah metode yang digunakan untuk mencari data staff berdasarkan ID staff yang di input.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/309e6517-b6d1-4f58-b9ff-e5e909bc3051)

  - Syntax ini menjalankan query SQL untuk mencari dan mengambil data staff berdasarkan ID staff yang di input.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/9ee1b12e-c9d2-4504-ba77-532ec5816462)

b. Constructormurid
  - Petama ialah syntax mendeklarasikan package yang digunakan dan mengimpor kelas-kelas yang diperlukan.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/b3dd8518-e374-4406-a78e-bae250623419)

  - constructormurid adalah kelas yang digunakan untuk melakukan operasi terkait murid.
  - arrayMurid adalah ArrayList yang digunakan untuk menyimpan data murid. Setiap data murid disimpan dalam bentuk array String.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/451d2e13-7752-48fe-86dd-f97406757e32)

  - Public boolean create() adalah metode yang digunakan untuk menambahkan data murid ke database.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/934826d2-dafa-4d79-9733-7c5f6404befb)

  - openConnection() adalah metode yang digunakan untuk membuka koneksi ke database.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/71267e17-f34b-4ac0-9bc0-59b7228e33a6)

  - Public boolean updateMurid() adalah metode yang digunakan untuk mengupdate data murid, yang di update disini ialah alamat.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/2d71702b-de3a-42e2-aafa-3953c74f25b2)

  - Syntax ini menjalankan pernyataan SQL untuk mengupdate alamat murid berdasarkan ID murid yang di input.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/cd3b60b3-6841-4028-bab6-790850c67c86)

  - public boolean deleteMurid() adalah metode yang digunakan untuk menghapus data murid dari tabel murid berdasarkan ID murid yang diberikan.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/87695a87-bbf2-4b56-85f7-6530f053ff98)

  - Syntax ini menjalankan pernyataan SQL untuk menghapus data murid berdasarkan ID murid yang di input.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/a3daa012-b21d-4c27-871d-a952890a8e4d)

  - Public readMurid() adalah metode yang digunakan untuk membaca data murid dari tabel murid dan menyimpannya dalam arrayMurid.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/2e05020b-9ad6-4bc4-a851-7ca8f4516d5b)

  - Syntax ini menjalankan query SQL untuk mengambil data murid dari tabel murid. Syntax ini juga mengambil data murid dari hasil query dan menyimpannya dalam 
    bentuk array String.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/530bf3f0-94ee-4a13-af83-8979995df641)

  - public boolean find() adalah metode yang digunakan untuk mencari data murid berdasarkan ID yang diberikan.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/dac5e20a-e9c0-447d-a091-245c3f2fd156)

c. InheritanceKhusus
Khusus ini ialah kepanjangan dari kelas khusus yang dimana merupakan subtype dari kelas.
  - Pertama ialah mendeklarasikan package dan mengimpor kelas yang terletak dalam package model. Kelas inheritanceKhusus akan 
    menggunakan kelas kelas sebagai dasar pewarisan.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/8c65548e-a1c5-48fd-a847-02da4a1e1bfb)

  - inheritanceKhusus adalah kelas yang dideklarasikan dan mendefinisikan pewarisan dengan menggunakan extends. Ini berarti kelas inheritanceKhusus 
    adalah subclass atau turunan dari _kelas_.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/1169cc35-6b60-44fa-9b26-3770700f4f06)

  - Atribut materiKhusus merupakan atribut tambahan yang ada hanya pada kelas inheritanceKhusus.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/a9b336a4-30a1-405a-a0d5-faacdf99cd50)

  - Metode getter dan setter untuk atribut materiKhusus. Metode getter getMateriKhusus digunakan untuk mengambil nilai dari atribut materiKhusus, sementara 
    metode setter setMateriKhusus digunakan untuk mengatur nilai atribut materiKhusus.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/b222c43a-8ad4-4019-9b98-36936053650f)

d. InheritanceRegular
Regular ini ialah kepanjangan dari kelas regular yang dimana merupakan subtype dari kelas.
  - Pertama ialah mendeklarasikan package dan mengimpor kelas kelas yang terletak dalam package model. Ini berarti inheritanceRegular akan menggunakan kelas 
    kelas sebagai dasar pewarisan.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/5439e6f2-0cff-4b61-8f4a-7b08a643a326)

  - inheritanceRegular adalah kelas yang dideklarasikan dan mendefinisikan pewarisan dengan menggunakan extends. Ini berarti kelas inheritanceRegular 
    adalah subclass (turunan) dari _kelas_.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/638a3e4f-46ba-472e-9b66-3d51eb3e1268)

  - Atribut metodePengajaran yang merupakan atribut tambahan yang ada hanya pada kelas inheritanceRegular.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/7778b9b3-647b-49f8-bbcf-9ff019fe6788)

2) Package Model
a. murid
  - Pertama ialah syntax mendefinisikan package yang berisi kelas murid dan mengimpor kelas database yang terletak dalam paket database.
  ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/54fe0fab-6d6f-4a87-b374-70f8344ab3f9)

  - murid adalah kelas yang menggextend kelas database.
  ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/f4c1b0a9-b969-411d-9299-e3d92fe04ebd)

  - Syntax ini mendefinisikan sejumlah atribut dalam kelas murid. Setiap atribut memiliki tipe data tertentu dan berikut adalah atribut-atribut 
    yang didefinisikan:
    1) idMurid: Atribut dengan tipe data String yang tampaknya akan digunakan untuk menyimpan ID murid.
    2) nama: Atribut dengan tipe data String yang menyimpan nama murid.
    3) tanggalLahir: Atribut dengan tipe data String yang menyimpan tanggal lahir murid.
    4) alamat: Atribut dengan tipe data String yang menyimpan alamat murid.
    5) namaOrangTua: Atribut dengan tipe data String yang menyimpan nama orang tua murid.
    6) nomorOrangTua: Atribut dengan tipe data String yang menyimpan nomor telepon orang tua murid.
    7) fkUsername: Atribut dengan tipe data String yang tampaknya akan digunakan untuk menyimpan kunci luar ke tabel pengguna (user).
    8) fkIdKelas: Atribut dengan tipe data String yang tampaknya akan digunakan untuk menyimpan kunci luar ke tabel kelas.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/55e8eb51-3a92-416b-b967-bc3c1c45d7e8)

  - Syntax ini mendefinisikan getter dan setter untuk atribut-atribut dalam kelas murid. Getter digunakan untuk mendapatkan nilai atribut, sedangkan setter 
    digunakan 
    untuk mengatur nilai atribut.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/8e4ff98c-d79f-4a9f-a492-c85ac2a39623)
    
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/fc999d19-94d9-4ad9-bb0e-6c3b7b85da42)

b. staff
  - Pertama ialah syntax mendefinisikan paket (package) yang berisi kelas staff dan mengimpor kelas database yang terletak dalam paket database.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/6a665f15-f63d-4e5b-8eaa-541156bfc223)

  - staff adalah kelas yang didefinisikan dan menggextend kelas database.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/8145fedd-6c03-4842-a3ec-7a89847f5022)

  - Syntax ini mendefinisikan sejumlah atribut (variabel anggota) dalam kelas staff. Setiap atribut memiliki tipe data tertentu dan berikut adalah atribut- 
     atribut yang didefinisikan:
    1) idStaff: Atribut dengan tipe data String yang tampaknya akan digunakan untuk menyimpan ID staff.
    2) nama: Atribut dengan tipe data String yang menyimpan nama staff.
    3) alamat: Atribut dengan tipe data String yang menyimpan alamat staff.
    4) nomorTelepon: Atribut dengan tipe data String yang menyimpan nomor telepon staff.
    5) bidangPekerjaan: Atribut dengan tipe data String yang menyimpan bidang pekerjaan staff.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/1ca8a03d-d430-4702-9978-1259f28dc3c8)

  - Syntax ini mendefinisikan getter dan setter untuk atribut-atribut dalam kelas staff. Getter digunakan untuk mendapatkan nilai atribut, sedangkan setter 
    digunakan untuk mengatur nilai atribut.
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/d0326eab-adaf-4c4a-b40d-02af1a85b530)
    ![image](https://github.com/PA-Capstone-25/PA-Capstone/assets/122219678/c0e4372a-5062-4497-a05a-723097fcd9a8)

c. 


