package com.malma.belajarjava.localvariable;

public class Program {
    public static void main(String[] args) {
        // Variable (terkadang bisa juga disebut Field, walau sebenarnya ada bedanya)
        // adalah sebuah nama (name) yang memiliki/menyimpan/merepresentasikan sebuah
        // nilai (value)

        // Variable memiliki name (name pada variable memiliki beberapa aturan)
        // Variable juga memiliki value yang sesuai dengan Tipe Data (data type) nya
        // Karena Java itu bahasa Static, jadi value dari suatu variable harus sesuai
        // dengan data type variable nya

        // Dalam Java, variable memiliki banyak jenis
        // Salah satu jenisnya adalah local variable
        // Local Variable adalah variable yang terdapat di dalam suatu method
        // Artinya variable tersebut tidak dapat digunakan di luar method si variable
        // tersebut berada

        // Untuk pembuatan local variable diawali dengan menulis nama data type nya
        // Dilanjutkan dengan menuliskan name dari variable nya
        int x;
        // Misalnya disini ada variable dengan data type nya int (singkatan integer)
        // Dan variable tersebut memiliki name "x"
        // Variable x ini tidak memiliki value karena kita cuman membuatnya saja
        // Kita tidak mengassign (menetapkan) value ke variable tersebut

        // Untuk mengassign value ke variable yang sudah dibuat (misalnya variable x)
        // Kita harus menuliskan name variable nya (misal variable x kita harus tulis x)
        // Dilanjutkan dengan menuliskan tanda assign yaitu "="
        // Setelahnya kita tuliskan value dari variable nya
        // Value nya harus sesuai data type dari variable nya
        // Disini variable x memiliki data type integer (int)
        // Data type integer hanya dapat menyimpan value berupa bilangan bulat
        x = 10;
        // Disini kita assign value ke variable x yaitu 10

        // Kita juga bisa menggabungkan proses pembuatan variable dan pemberian value ke
        // variable tersebut
        // Sebagai contoh kita ingin buat variable dengan name y dan memiliki data type
        // integer dan valuenya 50
        int y = 50;
        // Kalau variable x tadi kita buat pake kayak gini, nanti jadi seperti ini
        // int x = 10;

        // Untuk menggunakan variable, kita hanya perlu memanggil name variablenya
        System.out.println(x);
        // Misal disini kita akan menggunakan variable x sebagai argumen untuk
        // pemanggilan method System.out.println
        // Dengan begini value dari variable x ini yaitu 10 akan ditampilkan ke Console

        System.out.println(y);
        // Misalnya lagi disini kita akan menggunakan variable y sebagai argumen untuk
        // pemanggilan method System.out.println
        // Dengan begini value dari variable y ini yaitu 50 akan ditampilkan ke Console

        // Perlu diingat, suatu variable tidak boleh dibuat 2 kali
        // Jadi jika sebelumnya kita sudah membuat variable x, kita tidak boleh
        // membuatnya lagi
        // Tetapi kita tetap bisa mengassign value dari variable x berkali - kali
        x = 20;
        x = 30;
        x = 5;
        x = 7;
        x = 0;
        x = -69;
        // disini kita merubah - rubah value dari variable x, ini tidak masalah selama
        // kita tidak membuat ulang, karena itu akan menghasilkan error
        System.out.println(x);
        // Disini kita coba liat value dari variable x nya
        // Karena sebelumnya sudah kita ubah value nya menjadi -69
        // Maka seharusnya sekarang yang tampil bukan 10 lagi tapi -69

        // Sebelumnya sudah disebutkan jika name pada local variable memiliki aturan
        // penamaannya
        // Kita bebas memberikan name apapun selama menghindari
        // larangan - larangan berikut

        // Name variable itu bersifat case-sensitive, artinya suatu name itu dianggap
        // berbeda walaupun cuman beda besar sama kecilnya
        int X = 420;
        // Misal disini ada variable X, kita sebelumnya udah buat variable x
        // walau sama - sama x, tapi yang ini pakai huruf besar nya (X)
        // jadi dianggap berbeda
        System.out.println(x);
        System.out.println(X);
        // Untuk membuktikan kedua variable ini berbeda, kita coba tampilkan ke Console
        // Seharusnya di Console nanti akan muncul output yang berbeda yaitu:
        // -69
        // 420

        // Panjang dari name variable tidak terbatas
        // Jadi kita bisa bebas mau berapa panjang name dari suatu variable
        int iniAdalahVariable = 100;
        // Misal disini kita membuat variable dengan name "iniAdalahVariable"
        // Panjang name dari variable ini adalah 17 karakter.
        System.out.println(iniAdalahVariable);

        // Name variable bisa menggunakan numeric (angka)
        int x1 = 25;
        // Yang perlu diingat adalah numeric tidak boleh digunakan pada awalan
        // Kita harus menaruhnya pada posisi kedua atau seterusnya
        // Maka kita tidak boleh membuat variable dengan name seperti:
        // int 1x = 25;
        // int 3burung = 50;
        // int 25ayam = 100;
        // Ini akan menyebabkan error
        System.out.println(x1);

        // Name variable bisa menggunakan underscore (_) atau dollar ($)
        int angka_dua_puluh_lima = 25;
        int $20 = 20;
        // Name variable tidak boleh menggunakan symbol
        // Kecuali underscore (_) dan dollar ($)
        // Underscore bisa digunakan dimana pun bahkan di awal name
        // Tetapi dollar hanya bisa digunakan pada awal name
        // Sebenarnya jarang sekali dollar digunakan untuk name variable
        // Dan memang seharusnya penggunaannya sebisa mungkin untuk dihindarkan
        // Untuk underscore sendiri lebih baik digunakan seperlunya misal untuk
        // menggantikan spasi, karena name variable tidak boleh menggunakan spasi
        System.out.println(angka_dua_puluh_lima);
        System.out.println($20);

        // Name tidak boleh berupa keyword
        // Keyword adalah sebuah special word (kata spesial) pada suatu bahasa
        // pemrograman
        // Yang dimana keyword ini digunakan dalam penulisan sebuah syntax
        // maka suatu variable name tidak boleh menggunakan keyword
        // karena nantinya saat program dijalankan, compiler akan bingung karena tidak
        // dapat membedakan antara variable dan keyword
        // Contoh keyword itu seperti if, while, public, static, class, package, dll
        // Berikut contoh pembuatan variable dengan name berupa keyword dan ini akan
        // menghasilkan error:
        // int if = 20;
        // int static = 50;

        // Name lebih baik menggunakan style camelCase
        // Ini bukan pemaksaan, kita tidak diwajibkan menggunakan camelCase
        // Tapi Java sendiri menyarankan kita untuk menggunakan style penamaan dengan
        // ini
        // Jadi dalam penamaan ada banyak style, misalnya:
        int flatcase = 3;
        int camelCase = 5;
        int snake_case = 10;
        int PascalCase = 20;
        int UPPER_CASE = 30;
        // Java merekomendasikan untuk menggunakan style camelCase
        // terkhususkan untuk local variable
        // Tapi ada beberapa jenis variable yang memang lebih cocok meggunakan style
        // lainnya
        // Misal PascalCase yang digunakan untuk name pada suatu class
        // cara menggunakan camelCase adalah dengan mengganti huruf awal pada suatu kata
        // menjadi huruf besar tetapi hanya ketua kedua dan seterusnya, jadi kata
        // pertama tetap huruf kecil
        // misal "roti tawar" menjadi "rotiTawar"
        System.out.println(flatcase);
        System.out.println(camelCase);
        System.out.println(snake_case);
        System.out.println(PascalCase);
        System.out.println(UPPER_CASE);
    }
}
