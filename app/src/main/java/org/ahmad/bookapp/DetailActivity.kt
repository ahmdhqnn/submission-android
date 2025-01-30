package org.ahmad.bookapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.ahmad.bookapp.data.BookData
import org.ahmad.bookapp.model.Book

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_BOOK_ID = "extra_book_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bookId = intent.getIntExtra(EXTRA_BOOK_ID, -1)
        val book = BookData.getBookById(bookId)

        book?.let {
            findViewById<ImageView>(R.id.iv_detail_image).setImageResource(it.imageUrl)
            findViewById<TextView>(R.id.tv_detail_title).text = it.title
            findViewById<TextView>(R.id.tv_detail_description).text = it.description
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}