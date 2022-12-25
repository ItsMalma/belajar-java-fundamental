package com.malma.belajarjava.p5array;

public class Program {
    public static void main(String[] args) {
        // Array adalah sebuah data type yang mampu menyimpan banyak value dengan data
        // type yang sama
        // Array mampu menyimpan kumpulan value, namun tetap value nya harus dengan data
        // type yang sama
        // Misal kita buat array untuk integer, maka value yang ada pada array tersebut
        // harus integer tidak boleh data type yang lain akan ada error jika kita
        // masukkan value dengan data type yang lain
        // Panjang array adalah jumlah value yang ada pada array
        // Dan panjang array tidak dapat diubah / berubah sesudah dibuat, karena saat
        // kita membuat array kita telah menentukan panjangnya

        // Kita sebenarnya sudah melihat salah satu variable dengan data type Array,
        // yakni pada parameter di method main, yaitu args dengan data type array untuk
        // String

        // Setiap value pada array disebut dengan element, dan kita tetap dapat bisa
        // mengakses element tersebut satu per satu dengan memanggil array nya
        // dilanjutkan dengan menuliskan index dari element tersebut dalam sebuah kurung
        // kotak ([])
        // Index adalah lokasi dari element yang dimulai dari 0, contoh pada array:
        // {5, 10, 15, 20}
        // element 5 pada array tersebut berada pada index 0, element 10 pada index 1,
        // element 15 pada index 2, dan element 20 pada index 3

        // Untuk membuat array kita tulis data type dari element yang ingin kita
        // simpan, setelah itu tulis kurung kotak ([]) setelah data type nya
        int[] x;
        // Kalian juga sebenarnya bisa menaruh kurung kotak ([]) itu setelah nama
        // variable nya
        // Jadi nanti akan menjadi seperti ini
        // int x[];
        // Cuman direkomendasikan untuk menaruhnya setelah data type karena untuk
        // menjelaskan kalau variable itu data type nya array

        // Variable x di atas belum kita assign kan sebuah value
        // Untuk mengassign value pada array kita menggunakan keyword new (sebenarnya
        // keyword new ini tidak cuman digunakan untuk array, tapi digunakan untuk
        // Object, cuman karena array termasuk dalam Object jadi harus menggunakan new)
        // setelah new, kita masukkan data type nya, misal untuk variable x kita tulis
        // 'int' dan dilanjutkan dengan menuliskan kurung kotak lagi '[]', dan di dalam
        // kurung kotak itu kita masukkan panjang array nya (jumlah element yang akan
        // disimpan pada array)
        x = new int[5];
        // Disini misal kita assign value ke variable x sebuah array integer dengan
        // panjang nya 5
        // Disini kita memang sudah mengassign value untuk array x, tapi kita belum isi
        // element nya, walau secara otomatis disini compiler akan memberikan default
        // value pada argument nya, karena disini data type untuk element nya adalah
        // integer, maka default value nya adalah 0

        // Kita juga dapat menggabungkan proses pembuatan dan proses mengassign value
        // seperti data type lainnya
        int[] y = new int[5];

        // Sekarang untuk memberikan value ke element dari array tersebut, pertama kita
        // harus mengakses si element tersebut, caranya sudah diberi tahu di atas, yaitu
        // dengan tuliskan array nya lalu tuliskan kurung kotak ([]) dan di dalam kurung
        // nya kita masukkan index pada elementnya
        // Setelah itu kita assign kan value untuk element tersebut seperti kita assign
        // sebuah value ke variable
        x[0] = 20;
        // Disini kita akses element pertama pada array x (yang dimana index nya adalah
        // 0) lalu kita assign value dari element pertama tersebut dengan value 20
        x[1] = 25;
        x[3] = 30;
        x[2] = 40;
        x[4] = 50;
        // Selanjutnya kita assign semua element pada array tersebut, kita assign
        // element kedua dengan value 25, disini saya ingin memastikan kalau kalian
        // tidak perlu mengassign element pada array sesuai urutan, kalian bebas
        // memasukkan element yang mana saja tanpa perlu sesuai urutan
        // Contohnya disini saya mengassign element keempat dulu sebelum mengassign
        // element ketiga, dan terakhir saya mengassign element kelima

        // Sebagai peringatan, jika kita mencoba mengakses sebuah element pada array
        // dengan index yang melebihi panjang nya maka akan error, karena panjang pada
        // array itu tidak dapat berubah
        // Misal kalau kita akses element dengan index 5 pada variable x, maka akan
        // terjadi error karena panjang variable x adalah 5, sedangkan kita mencoba
        // mengakses index ke 5 (element ke 6)
        // x[5] <- ini error

        // Sekarang kita coba menggunakan element pada array tersebut
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        // Disini kita tampilkan setiap element pada variable array x dengan
        // mengaksesnya menggunakan index lalu dimasukkan ke method System.out.println
        // sebagai argument

        int a = x[0];
        // Kita juga dapat mengakses element pada suatu array lalu kita gunakan untuk
        // mengassign value dari element tersebut ke sebuah variable, sebenarnya cara
        // ini juga bisa kita gunakan pada variable yang lain, misal:
        int b = 20;
        int c = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Setelah itu kita tampilkan value a, b, c ke console dengan method
        // System.out.println, disini variable a memiliki value yang sama dengan element
        // pertama pada array x yaitu 25, sedangkan variable b memiliki value 20, dan
        // variable c memiliki value yang sama dengan variable b yaitu 20 juga

        // Kita juga bisa membuat array dari array, jadi nanti element dari array
        // tersebut juga array
        // Array jenis ini disebut multidimensional array
        // Cara membuatnya adalah dengan menambahkan kurung kotak lagi setelah kurung
        // kotak
        int[][] z;
        // Disini kita membuat sebuah variable z dengan data type array dari array
        // integer, jadi nanti element pada z adalah sebuah array juga, dan kita bisa
        // mengakses element dari element si variable z tersebut

        // Sebelum itu kita assign value nya dulu
        z = new int[3][5];
        // Disini variable z artinya memilikii element berupa array integer dengan total
        // 3 element
        // Dan setiap element tersebut juga merupakan sebuah array yang setiap elemennya
        // adalah sebuah integer dengan total 5 element
        // Kita - kira jadi seperti ini
        // { {10, 20, 30, 40, 50}, {2, 4, 6, 8, 10}, {90, 70, 50, 30, 10} }

        // Tentu saja, kita bisa menggabungkan proses pembuatan dan proses mengassign
        // value pada multidimensional array
        int[][] k = new int[3][5];

        // Untuk mengakses element pada multidimensional array sama seperti array biasa
        z[0] = new int[5];
        // Namun kita dapat mengakses element di dalam element pada multidimensional
        // array dengan menambahkan kurung kotak lagi
        z[0][0] = 50;
        // Ini artinya kita mengakses element pertama pada array z lalu kita akses
        // element pertama pada element pertama pada array z tersebut
        z[0][1] = 30;
        z[0][2] = 50;
        z[0][3] = 40;
        z[0][4] = 90;
        // Disini kita coba assign semua element pada element pertama array z
        System.out.println(z[0][0]);
        System.out.println(z[0][1]);
        System.out.println(z[0][2]);
        System.out.println(z[0][3]);
        System.out.println(z[0][4]);
        // Setelah itu tampilkan semua array tersebut ke console dengan method
        // System.out.println dengan menaruhnya sebagai argument

        // Terdapat sebuah cara untuk mengassign value ka array dengan langsung
        // memberikan value pada element nya
        // Sehingga kita tidak perlu lagi mengakses element satu per satu lalu
        // mengassign value nya
        // Caranya memakai array constants dengan menggunakan kurung kurawal ({}) lalu
        // didalamnya kita kasih element nya sesuai index
        int[] m = { 7, 14, 21, 28, 35 };
        // Dengan cara seperti ini, kita tidak perlu menuliskan new dan memasukkan
        // panjang dari array nya
        // Karena secara otomatis compiler akan menentukan panjang dari array nya dengan
        // menghitung jumlah elementnya, dimana panjang nya dalam kasus ini adalah 5
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);
        System.out.println(m[3]);
        System.out.println(m[4]);
        // Sebagai pembuktian, kita coba tampilkan element dari variable m ke console
        // dengan method System.out.println dengan menaruhnya sebagai argument

        // Tapi perlu diingat, kita tidak bisa menggunakan cara di atas jika variable
        // tersebut sudah dibuat, jadi cara di atas cuman bisa dipakai langsung saat
        // pembuatan
        // Jadi kita tidak bisa melakukan seperti ini
        // int[] n;
        // n = {1, 2, 3, 4, 5};
        // Ini akan menghasilkan error karena array constants cuman bisa dipakai
        // bersamaan saat pembuatan

        // Array itu object, dan object biasanya memiliki state, salah satu state pada
        // array yang dapat kita gunakan adalah length, state length digunakan untuk
        // mengambil panjang dari suatu array
        System.out.println(y.length);
        // Disini kita coba tampilkan panjang dari array y, walaupun kita belum assign
        // element ke si array y, tapi tetap saja kita telah menentukan panjang dari
        // array y tersebut saat pembuatannya yaitu 5
        System.out.println(k.length);
        System.out.println(k[0].length);
        // Kita juga bisa mengakses state length pada multidimensional arrray contohnya
        // array k, kita juga dapat mengakses state lengt pada element di array k,
        // karena element pada array k juga masih berupa array
    }
}
