package com.vb.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.vb.domain.model.RepoDBO

class RepoAdapter : ListAdapter<RepoDBO, RepoDBOViewHolder>(REPO_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoDBOViewHolder {
        return RepoDBOViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RepoDBOViewHolder, position: Int) {
        val repoItem = getItem(position)
        if (repoItem != null) {
            holder.bind(repoItem)
        }
    }

    companion object {
        private val REPO_COMPARATOR = object : DiffUtil.ItemCallback<RepoDBO>() {
            override fun areItemsTheSame(oldItem: RepoDBO, newItem: RepoDBO): Boolean =
                oldItem.name == newItem.name

            override fun areContentsTheSame(oldItem: RepoDBO, newItem: RepoDBO): Boolean =
                oldItem == newItem
        }
    }
}
