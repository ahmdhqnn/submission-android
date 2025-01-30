package org.ahmad.bookapp.data

import org.ahmad.bookapp.R
import org.ahmad.bookapp.model.Book

object BookData {
    fun getBooks(): List<Book> {
        return listOf(
            Book(
                1,
                "Laskar Pelangi",
                "Novel tentang perjuangan anak-anak Belitung",
                "Novel karya Andrea Hirata yang menceritakan kisah perjuangan anak-anak Belitung dalam menempuh pendidikan...",
                R.drawable.img1
            ),
            Book(
                2,
                "Bumi Manusia",
                "Novel sejarah Indonesia era kolonial",
                "Novel karya Pramoedya Ananta Toer yang mengisahkan kehidupan Minke di era kolonial Belanda...",
                R.drawable.img2
            ),
            Book(
                3,
                "Pulang",
                "Novel tentang perjalanan hidup",
                "Novel karya Tere Liye yang mengisahkan perjalanan hidup seorang anak dalam mencari jati diri...",
                R.drawable.img1
            ),
            Book(
                4,
                "Negeri 5 Menara",
                "Novel inspiratif tentang pendidikan",
                "Novel karya Ahmad Fuadi yang menceritakan kisah persahabatan di pesantren...",
                R.drawable.img1
            ),
            Book(
                5,
                "Sang Pemimpi",
                "Sekuel dari Laskar Pelangi",
                "Novel lanjutan dari Laskar Pelangi yang mengisahkan perjalanan Ikal dan Arai...",
                R.drawable.img1
            ),
            Book(
                6,
                "5 cm",
                "Novel petualangan dan persahabatan",
                "Novel karya Donny Dhirgantoro tentang persahabatan dan pendakian ke Gunung Semeru...",
                R.drawable.img1
            ),
            Book(
                7,
                "Ayat-Ayat Cinta",
                "Novel roman islami",
                "Novel karya Habiburrahman El Shirazy yang mengisahkan cinta dalam bingkai islami...",
                R.drawable.img1
            ),
            Book(
                8,
                "Dilan 1990",
                "Novel roman remaja",
                "Novel karya Pidi Baiq yang menceritakan kisah cinta remaja SMA di Bandung tahun 1990...",
                R.drawable.img1
            )
        )
    }

    fun getBookById(id: Int): Book? {
        return getBooks().find { it.id == id }
    }
} 