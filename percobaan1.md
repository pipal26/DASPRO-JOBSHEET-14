1. Apa yang dimaksud dengan fungsi rekursif?
fungsi rekursif adalah fungsi dalam pemrograman yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah.
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi
faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan
fungsi rekursif dan fungsi iteratif!
Meskipun kedua fungsi menghasilkan output yang sama (120), alur eksekusinya berbeda secara fundamental: faktorialRekursif bekerja dengan cara menumpuk panggilan fungsi ke dalam memori (stack) hingga mencapai kondisi dasar ($n=0$) lalu menghitung mundur saat tumpukan diselesaikan, sedangkan faktorialIteratif bekerja secara lebih hemat memori dengan melakukan perulangan (looping) di satu tempat untuk memperbarui nilai variabel secara bertahap tanpa membuat tumpukan fungsi baru.