package org.ahmad.bookapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.ahmad.bookapp.adapter.BookAdapter
import org.ahmad.bookapp.data.BookData
import org.ahmad.bookapp.model.Book

class MainActivity : AppCompatActivity() {
    private lateinit var rvBooks: RecyclerView
    private val bookList = ArrayList<Book>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setSupportActionBar(findViewById(R.id.toolbar))
        
        rvBooks = findViewById(R.id.rv_books)
        rvBooks.setHasFixedSize(true)
        rvBooks.layoutManager = LinearLayoutManager(this)

        bookList.addAll(BookData.getBooks())
        
        val adapter = BookAdapter(bookList) { book ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_BOOK_ID, book.id)
            startActivity(intent)
        }
        
        rvBooks.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}