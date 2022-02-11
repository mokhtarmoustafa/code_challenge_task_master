package com.cct.codechallengetask.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.cct.codechallengetask.databinding.BrochuresListItemBinding
import com.cct.codechallengetask.model.Content

class BrochuresAdapter:PagingDataAdapter<Content,BrochuresAdapter.ViewHolder>(DiffCallback()) {

  inner  class ViewHolder(
        private val binding: BrochuresListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: Content?) {
            binding.apply {
                clickListener = listener
//                brochure = item
                executePendingBindings() }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(BrochuresListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val brochureItem = getItem(position)
        holder.apply {
            bind(createOnClickListener( brochureItem), brochureItem)
            itemView.tag = brochureItem
        }
    }
    private fun createOnClickListener( newItem: Content?): View.OnClickListener {
        return View.OnClickListener {
//            val direction = NewsFragmentDirections
//                .actionNewsListFragmentToNewsDetailFragment(newItem ?: NewsListModel())
//            it.findNavController().navigate(direction)
        }
    }
}
private class DiffCallback : DiffUtil.ItemCallback<Content>() {

    override fun areItemsTheSame(oldItem: Content, newItem: Content): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: Content, newItem: Content): Boolean {
        return oldItem == newItem
    }
}
