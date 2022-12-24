package com.malma.belajarjava.p4datatype;

public class Program {
    public static void main(String[] args) {
        // Java itu bahasa pemrograman static
        // Artinya setiap variable harus memiliki value yang sesuai dengan data type nya

        // Data Type adalah sebuah tipe untuk mengkategorikan suatu data atau dalam hal
        // ini kita panggil value

        // Salah satu data type yang telah kita gunakan adalah int atau integer, gunanya
        // adalah untuk menyimpan value berupa bilangan bulat
        // jadi kita tidak bisa menyimpan value lain seperti misal bilangan desimal,
        // letter (huruf), object, dll.

        // Integer merupakan salah satu dari Primitive Data Type
        // Yaitu data type yang sudah disediakan langsung oleh Java
        // Jadi data type ini termasuk ke dalam keyword di Java

        // Primitive Data Type ada 8, berikut adalah semua data type tersebut

        // Byte
        // Data Type untuk menyimpan bilangan bulat juga sama seperti integer
        // bedanya dia memiliki ukuran yang lebih kecil yaitu 8 bit
        // Jadi dia hanya bisa menampung value dari -128 sampai 127
        // Jika valuenya kurang dari -128 atau lebih dari 127 maka akan terjadi error
        byte byte1 = -128;
        byte byte2 = 127;
        byte byte3 = 0;
        byte byte4 = 69;
        System.out.println(byte1);
        System.out.println(byte2);
        System.out.println(byte3);
        System.out.println(byte4);

        // Short
        // Data Type untuk menyimpan bilangan bulat juga sama seperti integer dan byte
        // bedanya dia memiliki ukuran lebih besar dari byte namun tetap lebih kecil
        // dari integer, dimana ukurannya adalah 16 bit
        // Data Type ini hanya bisa menampung value dari -32768 sampai 32767
        // Jika valuenya kurang dari -32768 atau lebih dari 32767 maka akan terjadi
        // error
        short short1 = -32768;
        short short2 = 32767;
        short short3 = 0;
        short short4 = 420;
        System.out.println(short1);
        System.out.println(short2);
        System.out.println(short3);
        System.out.println(short4);

        // Int
        // Sudah dipakai sebelumnya, data type ini untuk menyimpan bilangan bulat
        // Ukurannya 32 bit, mampu menampung value dari -2147483648 sampai 2147483647
        // Jika valuenya kurang dari -2147483648 atau lebih dari 2147483647 maka akan
        // terjadi error
        int int1 = -2147483648;
        int int2 = 2147483647;
        int int3 = 0;
        int int4 = 69420;
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4);

        // Long
        // Sama seperti byte, short, dan integer, digunakan untuk menyimpan bilangan
        // bulat
        // Ukurannya 64 bit dan merupakan yang terbesar dari semua Primitive Data Type
        // yang menyimpan bilangan bulat lainnya
        // Mampu menampung value dari -9223372036854775808 sampai 9223372036854775807
        // Jika kurang dari -9223372036854775808 atau lebih dari 9223372036854775807
        // maka akan terjadi error
        // Untuk long sendiri, di akhir value nya kita harus menambahkan suffix
        // (akhiran) 'L' atau 'l' (lebih disarankan 'L' untuk membedakan dengan angka 1)
        // Jika tidak maka value nya tidak akan dianggap long, melainkan akan dianggap
        // menjadi data type integer, tetapi secara otomatis compiler akan merubah value
        // integer menjadi long (karena ukuran integer jauh lebih kecil dari long),
        // cuman masalahnya adalah ketika value tersebut sudah melebihi maksimal value
        // untuk integer (-2147483647 dan 2147483647) maka akan terjadi error, jadi kita
        // kasih akhiran 'L' ke si value nya agar menjadi long bukan integer
        long long1 = -9223372036854775808L;
        long long2 = 9223372036854775807L;
        long long3 = 0L;
        long long4 = 69420L;
        System.out.println(long1);
        System.out.println(long2);
        System.out.println(long3);
        System.out.println(long4);

        // Float
        // Float digunakan untuk menyimpan value berupa bilangan desimal
        // Ukurannya 32 bit
        // Hampir sama seperti long, untuk float di akhir value nya kita harus
        // menambahkan suffix (akhiran) 'f' atau 'F', jika tidak maka tidak akan
        // dianggap float, melainkan akan dianggap menjadi data type double, kalau long
        // tidak masalah jika tidak diberi suffix, berbeda dengan float karena ukuran
        // float lebih kecil dari double, jadi harus dikasih akhiran 'f' agar diubah
        // menjadi float bukan double
        float float1 = 3.14f;
        float float2 = -3.14f;
        float float3 = 0.15f;
        float float4 = -0.15f;
        System.out.println(float1);
        System.out.println(float2);
        System.out.println(float3);
        System.out.println(float4);

        // Double
        // Sama seperti float, digunakan untuk menyimpan value berupa bilangan desimal
        // Namun ukurannya jauh lebih besar dari float, yakni 64 bit
        // Dan data type ini adalah data type yang dipakai secara default saat kita
        // menulis bilangan desimal (tanpa menuliskan data type nya)
        // Berbeda dengan float, kita tidak perlu menuliskan suffix 'f' pada value,
        // walaupun sebenarnya dikasih juga tidak apa - apa, maka nanti value nya akan
        // dianggap float bukan double, walau compiler bisa merubah value float tersebut
        // ke double karena size si float jauh lebih kecil dari double, tapi masalahnya
        // adalah ketika value dari float sudah dirasa terlalu kecil, maka alangkah
        // baiknya menghapus suffix 'f' agar value dianggap double bukan float
        // Tapi kita bisa kasih suffix 'D' atau 'd' walaupun sebenarnya ini opsional,
        // karena tanpa pakai suffix pun akan tetap dianggap sebagai value double
        double double1 = 3.14;
        double double2 = -3.14;
        double double3 = 0.15;
        double double4 = -0.15;
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);

        // Boolean
        // Berbeda dengan data type yang lain, boolean hanya memiliki 2 value saja
        // Yakni true dan false, jika kita mengassign value yang lain maka akan
        // menghasilkan error
        // Boolean sangat banyak digunakan, terutama untuk menentukan kondisi (apakah
        // kondisi itu true atau false)
        // Karena value nya hanya 2 saja, ukurannya pun kecil yaitu 1 bit saja
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);

        // Char
        // Digunakan untuk menyimpan value berupa 1 character
        // Character itu seperti misalnya letter, number, symbol, special character
        // (seperti '\n' untuk new line, '\t' untuk new tab, dll)
        // Ukurannya sama seperti short yaitu 16 bit
        // Untuk menuliskan value nya, kita harus kurung si value nya menggunakan tanda
        // kutip tunggal (')
        // Tetapi kita juga dapat menggunakan angka untuk mengassign value nya, itu
        // karena character dalam komputer sebenarnya juga merupakan sebuah integer
        // Misalnya character 'a' itu jika diubah menjadi integer akan menjadi 97
        // Tetapi walaupun bisa menggunakan angka, angka yang digunakan sebagai value
        // tidak boleh bilangan negatif, karena character dimulai dari 0 - 65535
        // Tidak boleh kurang dari 0 atau lebih dari 65535, jika terjadi maka akan
        // muncul error
        char char1 = 'A';
        char char2 = ' ';
        char char3 = '7';
        char char4 = '$';
        char char5 = '\n';
        char char6 = 0;
        char char7 = 97;
        char char8 = 65535;
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
        System.out.println(char4);
        System.out.println(char5);
        System.out.println(char6);
        System.out.println(char7);
        System.out.println(char8);

        // Saat kita tidak mengassign value kepada suatu variable, maka variable
        // tersebut secara otomatis akan terassign value nya sama compiler
        // Value yang diassign sama compiler disebut default value
        // Default Value tergantung dengan data type dari variable tersebut
        // Berikut daftarnya:
        // Byte, Short, dan Integer = 0
        // Long = 0L
        // Float = 0.0f
        // Double = 0.0
        // Boolean = false
        // Char = 0
        // Object = null
        // Sayangnya default value ini tidak akan diassign oleh compiler ke local
        // variable, jadi tetap untuk local variable seperti yang kita sudah buat harus
        // dikasih oleh kita manual, karena kalau kita menggunakan local variable yang
        // belum kita assign value nya, maka akan terjadi error

        // Literal adalah value yang digunakan pada primitive data type
        // Jadi value yang sebelum ini kita tulis itu disebutnya Literal
        // Literal itu value yang sudah disediakan langsung oleh Java dan memiliki
        // aturannya dalam penulisan valuenya

        // Integer Literal
        // Ini adalah literal yang digunakan sebagai value untuk data type integer
        // Dan akan menjadi long ketika ditambahkan suffix 'L' atau 'l'.
        // Uniknya, Integer Literal ini selain menggunakan sistem bilangan decimal
        // (sistem bilangan basis 10) kita juga bisa menggunakan sistem bilangan lain
        // seperti binary (basis 2) dengan menambahkan prefix (awalan) '0b' pada
        // valuenya, atau hexadecimal (basis 16) dengan menambahkan prefix (awalan) '0x'
        // pada valuenya
        int iniInt = 20;
        long iniLong = 20L;
        long iniJugaLong = 20; // walau value nya integer, akan diubah menjadi long oleh compiler
        int iniIntPakeBinary = 0b0001;
        int iniIntPakeHexaDecimal = 0x0001;
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniJugaLong);
        System.out.println(iniIntPakeBinary);
        System.out.println(iniIntPakeHexaDecimal);

        // Floating-Point Literal
        // Ini adalah literal yang digunakan sebagai value untuk data type double
        // Dan akan menjadi float ketika ditambahkan suffix 'F' atau 'f'.
        // Selain itu juga bisa dikasih suffix 'D' atau 'd' yang akan dianggap menjadi
        // double, walau yah ini nggak guna lagi karena nggak usah dikasih pun compiler
        // akan secara otomatis menganggap value nya sebagai double
        // Uniknya kalian bisa membuat floating-point literal dengan menggunakan notasi
        // e atau E (dikenal juga scientific notation, misalnya 3e2 = 3 x 10^2 = 300.0)
        // Dan jika number pada value tidak ada titik (misal 10 saja bukan 10.0), tetapi
        // di akhir ada suffix f atau d maka itu akan diubah menjadi floating-point
        // literal secara otomatis (misal 10f akan menjadi 10.0f).
        float iniFloat = 10.5f;
        double iniDouble = 5.4;
        double iniJugaDouble = 5.4D;
        double iniMasihDouble = 5.4f; // walau value nya float, akan diubah menjadi double oleh computer
        float iniFloatPakeNotasiIlmiah = 3e2f;
        double iniDoublePakeNotasiIlmiah = 5e3;
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(iniJugaDouble);
        System.out.println(iniMasihDouble);
        System.out.println(iniFloatPakeNotasiIlmiah);
        System.out.println(iniDoublePakeNotasiIlmiah);

        // Character Literal
        // Ini adalah literal yang digunakan sebagai value untuk data type char
        // Character disini merupakan jenis character UTF-16.
        // Character itu seperti misalnya letter, number, symbol, special character
        // (seperti '\n' untuk new line, '\t' untuk new tab, dll)
        // Kalian harus mengurung value dari literal ini menggunakan kutip tunggal (')
        // Karena jenis nya UTF-16 kalian bisa menulis literal ini dengan menggunakan
        // unicode escape seperti berikut '\u0000', dimana diawali dengan '\' (karena
        // ini escape character) lalu dilanjutkan dengan bilangan hexadecimal, karena
        // ukurannya 16 bit, maka jumlah ruas nya ada 4.
        // Yang perlu diawasi adalah saat menggunakan unicode escape, secara otomatis
        // compiler akan merubahnya menjadi character yang ditujunya, misal jika kalian
        // menggunakan \u000A
        // maka itu akan error karena character diatas itu merepresentasikan \n, jadi
        // hati - hati.
        // Escape Character adalah character khusus untuk memasukkan character yang
        // tidak bisa dimasukkan dengan 1 character saja, escape character diawali
        // dengan backslash '\' lalu dilanjutkan dengan 1 character lainnya
        // Berikut daftar escape character pada Java:
        // \b (melakukan backspace)
        // \t (membuat tab)
        // \n (membuat line baru)
        // \f (untuk ngeskip page, biasanya dipake untuk printer)
        // \r (kembali ke awal line)
        // \" (menulis kutip ganda ("))
        // \' (menulis kutip tunggal (''))
        // \\ (menulis backslash(\)).
        // Kita juga dapat menggunakan angka untuk membuat character literal, itu
        // karena character dalam komputer sebenarnya juga merupakan sebuah integer
        // Misalnya character 'a' itu jika diubah menjadi integer akan menjadi 97
        // Tetapi walaupun bisa menggunakan angka, angka yang digunakan sebagai value
        // tidak boleh bilangan negatif, karena character dimulai dari 0 - 65535
        // Tidak boleh kurang dari 0 atau lebih dari 65535, jika terjadi maka akan
        // muncul error.
        char iniCharacter = 'A';
        char iniJugaCharacter = ' ';
        char iniJugaSamaCharacter = '7';
        char iniJugaMasihSamaCharacter = '$';
        char iniEscapeCharacter = '\n';
        char iniCharacterPakeNumber = 0;
        char iniJugaCharacterPakeNumber = 97;
        char iniJugaSamaCharacterPakeNumber = 65535;
        char iniCharacterPakeUnicodeEscape = '\uFF00';
        System.out.println(iniCharacter);
        System.out.println(iniJugaCharacter);
        System.out.println(iniJugaSamaCharacter);
        System.out.println(iniJugaMasihSamaCharacter);
        System.out.println(iniEscapeCharacter);
        System.out.println(iniCharacterPakeNumber);
        System.out.println(iniJugaCharacterPakeNumber);
        System.out.println(iniJugaSamaCharacterPakeNumber);
        System.out.println(iniCharacterPakeUnicodeEscape);

        // Null Literal
        // Literal ini digunakan sebagai value untuk data type Object
        // Jadi jika suatu Object memiliki literal null artinya Object itu tidak
        // bernilai.
        Object object1 = null;
        System.out.println(object1);

        // String Literal
        // Sebenarnya ini adalah suatu literal yang unik, karena literal ini digunakan
        // bukan untuk primary data type, tapi sebuah data type khusus yaitu String.
        // String adalah kumpulan character, jadi simpelnya kita bisa menggabung
        // character menjadi satu buah literal, hampir mirip seperti character, value
        // dari string diapit menggunakan kutip, bukan kutip tunggal melainkan kutip
        // ganda ("), setelah itu di dalam kutip masukkan character, kita juga bisa
        // menggunakan escape character dan unicode escope.
        String iniString = "Domba itu ada 3!";
        String iniStringPakeEscapeCharacter = "Domba itu ada 3!\nKemana satunya?";
        String iniStringPakeUnicodeEscape = "Domba itu ada 3\u0021\nKemana satunya\u003F";
        System.out.println(iniString);
        System.out.println(iniStringPakeEscapeCharacter);
        System.out.println(iniStringPakeUnicodeEscape);

        // Underscore dapat digunakan pada literal yang bernumber sebagai pemisah antar
        // digit, fungsinya adalah sebagai pemisah agar number literal tersebut mudah
        // dibaca, kalau biasanya kan kita kalau nulis 1 juta dikasih pemisah kayak koma
        // atau titik (1,000,000 atau 1.000.000) tapi sayangnya saat coding di Java
        // (bahkan di bahasa pemrograman yang lain) ini tidak bisa, tapi Java
        // menyediakan alternatifnya yaitu dengan menggunakan underscore.
        // Namun perlu diketahui, ada beberapa tempat kita tidak boleh menaruh si
        // underscore ini dan akan menghasilkan error jika kita taruh:
        // * Di awal dan akhir literal (contoh: _20, _3.5f, 20_, 3.5f_, dll)
        // * Berdekatan dengan titik pada floating-point literal (contoh: 2_.0, 2._0,
        // dll)
        // * Berdekatan dengat suffix seperti f, L, D (contoh: 20_f, 20L_,, dll)
        // * Ditaruh di posisi dimana seharusnya di posisi itu ada string atau character
        // misalnya seperti 0x (contoh: 0_b0000, 0_x0000, dll)
        long a = 1234_5678_9012_3456L;
        long b = 999_99_9999L;
        float c = 3.14_15F;
        long d = 0xFF_EC_DE_5E;
        long e = 0xCAFE_BABE;
        long f = 0x7fff_ffff_ffff_ffffL;
        byte g = 0b0010_0101;
        long h = 0b11010010_01101001_10010100_10010010;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}