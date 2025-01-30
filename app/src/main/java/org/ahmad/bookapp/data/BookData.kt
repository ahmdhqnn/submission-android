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
                "Novel karya Andrea Hirata yang menceritakan kisah sekelompok anak-anak yang tumbuh di sebuah desa kecil di Belitung. Mereka menghadapi berbagai tantangan dalam mengejar pendidikan, namun semangat dan tekad mereka tak pernah surut. Kisah ini menggambarkan pentingnya impian dan persahabatan, serta menggugah pembaca untuk menghargai pendidikan sebagai kunci untuk meraih masa depan yang lebih baik. Buku ini mencerminkan perjuangan dan keberanian anak-anak Indonesia dalam menghadapi ketidakadilan sosial dan ekonomi.",
                R.drawable.laskarpelangi
            ),
            Book(
                2,
                "Bumi Manusia",
                "Novel sejarah Indonesia era kolonial",
                "ovel pertama dalam tetralogi Buru karya Pramoedya Ananta Toer yang mengisahkan perjuangan seorang pemuda pribumi bernama Minke di era penjajahan Belanda pada awal abad ke-20. Novel ini menggambarkan dinamika sosial, politik, dan budaya di Indonesia pada masa itu, dengan fokus pada konflik antara penjajah dan kaum pribumi. Minke, yang terdidik dan memiliki pemikiran kritis, berjuang untuk menemukan jati dirinya serta menghadapi ketidakadilan sistem kolonial yang menindas.",
                R.drawable.bumimanusia
            ),
            Book(
                3,
                "Pulang",
                "Novel tentang perjalanan hidup",
                "Novel karya Tere Liye yang mengisahkan perjalanan emosional seorang pria bernama Bujang, yang pulang setelah bertahun-tahun merantau. Novel ini menyajikan kisah tentang cinta, kehilangan, serta pencarian jati diri dalam konteks kehidupan yang penuh dengan perubahan sosial dan budaya. Dengan latar belakang sejarah Indonesia, Pulang membawa pembaca menelusuri pengalaman hidup yang penuh haru dan pelajaran berharga tentang arti keluarga, rumah, dan kembali ke asal usul.",
                R.drawable.pulang
            ),
            Book(
                4,
                "Negeri 5 Menara",
                "Novel inspiratif tentang pendidikan",
                "Novel karya A. Fuadi yang mengisahkan perjalanan hidup Alif Fikri, seorang pemuda asal desa yang merantau ke pesantren di tengah kota. Di pesantren, Alif bertemu dengan teman-teman yang memiliki impian besar, dan mereka saling memberi dukungan untuk mencapai cita-cita mereka. Novel ini menggambarkan perjuangan, persahabatan, dan pentingnya pendidikan dalam mencapai tujuan hidup, dengan latar belakang budaya dan kehidupan di pesantren. Buku ini menginspirasi pembaca untuk berani bermimpi besar dan menghadapi tantangan hidup dengan tekad.",
                R.drawable.negeri5menara
            ),
            Book(
                5,
                "Sang Pemimpi",
                "Sekuel dari Laskar Pelangi",
                "Novel karya Tere Liye yang mengisahkan perjalanan hidup seorang pemuda bernama Laskar Pelangi, yang berjuang mengejar impian dan menghadapi berbagai rintangan dalam hidupnya. Novel ini menggugah pembaca untuk lebih menghargai pendidikan, berani bermimpi besar, dan tak pernah menyerah dalam meraih cita-cita, meskipun berbagai keterbatasan dan kesulitan datang menghampiri.",
                R.drawable.sangmimpi
            ),
            Book(
                6,
                "5 cm",
                "Novel Remaja Motivasi",
                "Novel karya Donny Dhirgantoro yang mengisahkan perjalanan lima sahabat yang saling berbagi mimpi dan perjuangan. Berawal dari perjalanan ke Gunung Semeru, mereka berusaha untuk mencapai puncak sebagai simbol dari perjuangan hidup dan impian yang harus dicapai. Novel ini penuh dengan nilai-nilai persahabatan, motivasi, dan pengingat bahwa hidup adalah tentang terus maju meski tantangan datang. Buku ini juga mengajarkan pentingnya semangat untuk mengejar tujuan hidup dan tak pernah menyerah.",
                R.drawable.cm
            ),
            Book(
                7,
                "Ayat-Ayat Cinta",
                "Novel roman religius",
                "Novel karya Habiburrahman El Shirazy yang menceritakan kisah cinta seorang pemuda bernama Fahri, mahasiswa Indonesia yang sedang menempuh studi di Mesir. Dalam perjalanan hidupnya, Fahri mengalami konflik batin terkait cinta, agama, dan perbedaan budaya, di tengah pergulatan mencari jati diri dan kasih sayang yang sejati.",
                R.drawable.ayatcinta
            ),
            Book(
                8,
                "Dilan 1990",
                "Novel roman remaja",
                "Novel karya Pidi Baiq yang mengisahkan kisah cinta remaja antara Milea dan Dilan, seorang pemuda yang unik dan berani, berlatar belakang di Bandung pada tahun 1990. Dilan, yang dikenal dengan kepribadiannya yang berbeda dan romantis, berusaha memenangkan hati Milea dengan cara yang tak biasa. Cerita ini tidak hanya mengangkat kisah cinta, tetapi juga persahabatan, pertemanan, dan dinamika kehidupan remaja pada era tersebut. Buku ini menjadi fenomena dan banyak dikenang oleh pembaca generasi 90-an.",
                R.drawable.dilan
            ),
            Book(
                9,
                "Van Der Wijk",
                "Novel roman remaja",
                "Novel karya Hamka yang menceritakan kisah cinta tragis antara Zainuddin dan Hayati, dua tokoh yang terpisah oleh perbedaan sosial, adat, dan takdir. Berlatar belakang masyarakat Minangkabau pada awal abad ke-20, cerita ini menggambarkan konflik cinta dan kesetiaan yang harus menghadapi tantangan besar, termasuk tenggelamnya kapal Van Der Wijck sebagai simbol kehancuran harapan.",
                R.drawable.vanderwijck
            ),
            Book(
                10,
                "Perahu Kertas",
                "Novel roman remaja",
                "Novel karya Dee Lestari yang mengisahkan perjalanan cinta antara Kugy dan Keenan, dua remaja yang memiliki mimpi dan perjuangan masing-masing. Cerita berlatar belakang di Jakarta dan Bali, dengan tema tentang pencarian jati diri, persahabatan, dan cinta yang tulus. Melalui alur yang mengalir dengan indah, buku ini menggambarkan bagaimana kedua tokoh tersebut belajar untuk mengenali diri dan memilih arah hidup mereka, meski terhalang oleh berbagai tantangan.",
                R.drawable.perahukertas
            ),
        )
    }

    fun getBookById(id: Int): Book? {
        return getBooks().find { it.id == id }
    }
} 