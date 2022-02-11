package com.cct.codechallengetask.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.cct.codechallengetask.databinding.BrochuresListItemBinding
import com.cct.codechallengetask.model.Content
import com.cct.codechallengetask.model.Contents
import com.cct.codechallengetask.model.Publisher
import com.cct.codechallengetask.model.Retailer
import com.google.gson.internal.LinkedTreeMap


class BrochuresAdapter1(private val contentList: List<com.cct.codechallengetask.ui.model.Contents>) :
    RecyclerView.Adapter<BrochuresAdapter1.ViewHolder>() {

    inner class ViewHolder(
        private val binding: BrochuresListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: Content?) {
            binding.apply {
                clickListener = listener
                brochure = item
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            BrochuresListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val brochureItem = contentList[position]
        holder.apply {

            val getrow: Any? = brochureItem.content
            val t: LinkedTreeMap<Any, Any> = getrow as LinkedTreeMap<Any, Any>
            val tpublisher: LinkedTreeMap<Any, Any> = t["publisher"] as LinkedTreeMap<Any, Any>
            val tretailer: LinkedTreeMap<Any, Any> = t["retailer"] as LinkedTreeMap<Any, Any>
            val publiherList = tpublisher.values.toList()
            val trailerList = tretailer.values.toList()
            val validFrom = t["validFrom"] as LinkedTreeMap<Any, Any>
            val validTo = t["validUntil"] as LinkedTreeMap<Any, Any>

            val publisher = Publisher(
                publiherList[0].toString(),
                publiherList[1].toString(),
                publiherList[2].toString()
            )
            val retailer = Retailer(
                trailerList[0].toString(),
                trailerList[1].toString()
            )
            Log.d(TAG, "onBindViewHolder: $t")
            val content = Content(validFrom=validFrom.toString(), validUntil = validTo.toString()   ,
                brochureImage = t["brochureImage"].toString(),
                publisher = publisher,
                retailer = retailer
            )
//            Log.d(TAG, "onBindViewHolder: $content")
            bind(createOnClickListener(brochureItem), content)

        }
    }

    private fun createOnClickListener(newItem: Any?): View.OnClickListener {
        return View.OnClickListener {
//            val direction = NewsFragmentDirections
//                .actionNewsListFragmentToNewsDetailFragment(newItem ?: NewsListModel())
//            it.findNavController().navigate(direction)
        }
    }

    override fun getItemCount() = contentList.size

    companion object {
        private const val TAG = "BrochuresAdapter1"
    }
}

