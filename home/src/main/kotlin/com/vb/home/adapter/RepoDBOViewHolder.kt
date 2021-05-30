package com.vb.home.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vb.domain.model.RepoDBO
import com.vb.home.R

class RepoDBOViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val name: TextView = view.findViewById(R.id.nameTextView)

    private var repo: RepoDBO? = null

    init {
//        view.setOnClickListener {
//            repo?.url?.let { url ->
//                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
//                view.context.startActivity(intent)
//            }
//        }
    }

    fun bind(repo: RepoDBO?) {
        if (repo == null) {
            name.text = "erro nulo"
        } else {
            showRepoData(repo)
        }
    }

    private fun showRepoData(repo: RepoDBO) {
        this.repo = repo
        name.text = repo.name

    }

    companion object {
        fun create(parent: ViewGroup): RepoDBOViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_repos, parent, false)
            return RepoDBOViewHolder(view)
        }
    }
}
