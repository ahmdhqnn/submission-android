package org.ahmad.bookapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.ahmad.bookapp.R
import org.ahmad.bookapp.model.Book

class BookAdapter(
    private val books: List<Book>,
    private val onItemClick: (Book) -> Unit
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_item_image)
        val titleView: TextView = itemView.findViewById(R.id.tv_item_title)
        val overviewView: TextView = itemView.findViewById(R.id.tv_item_overview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.imageView.setImageResource(book.imageUrl)
        holder.titleView.text = book.title
        holder.overviewView.text = book.overview
        holder.itemView.setOnClickListener { onItemClick(book) }
    }

    override fun getItemCount() = books.size
}