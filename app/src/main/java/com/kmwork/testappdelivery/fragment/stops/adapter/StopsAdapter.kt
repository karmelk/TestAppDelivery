package com.kmwork.testappdelivery.fragment.stops.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.kmwork.entities.localmodel.StopsModel
import com.kmwork.entities.responcemodel.StopsModelDB
import com.kmwork.testappdelivery.R
import kotlinx.android.synthetic.main.item_stops.view.*

class StopsAdapter(val navigate: () -> Unit, val finish: () -> Unit) :
    RecyclerView.Adapter<StopsAdapter.MyViewHolder>() {
    private var itemList: MutableList<StopsModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_stops, parent, false)
    )

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: MyViewHolder, pos: Int) {
        holder.bindItem(itemList[pos], pos.plus(1))
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(item: StopsModel, pos: Int) {
            with(itemView) {
                position.text = pos.toString()
                stopName.text = item.randomName
                finishAddress.text = item.finishAddress
                finishedDate.text = item.finishedDate
                date.text=item.expectantDate
                if (item.isFinishedStops) {
                    finishedStop.visibility = VISIBLE
                    position.visibility = INVISIBLE
                    date.visibility = INVISIBLE
                    finishedDate.visibility = INVISIBLE
                    finishAddress.setTextColor(ContextCompat.getColor(context, R.color.colorAccent))
                    stopName.setTextColor(ContextCompat.getColor(context, R.color.colorAccent))
                    itemCard.setCardBackgroundColor(
                        ContextCompat.getColor(
                            context,
                            R.color.colorBackgroundItemStopFinished
                        )
                    )
                } else {
                    if (item.isDatePenalty) {
                        finishedDate.setTextColor(
                            ContextCompat.getColor(
                                context,
                                R.color.colorItemStopDatePassed
                            )
                        )
                    } else {
                        finishedDate.setTextColor(
                            ContextCompat.getColor(
                                context,
                                R.color.colorItemStopDateNotPassed
                            )
                        )
                        finishedStop.visibility = INVISIBLE
                        position.visibility = VISIBLE
                        finishAddress.setTextColor(
                            ContextCompat.getColor(
                                context,
                                R.color.colorItemStopText
                            )
                        )
                        stopName.setTextColor(
                            ContextCompat.getColor(
                                context,
                                R.color.colorItemStopName
                            )
                        )
                        itemCard.setCardBackgroundColor(
                            ContextCompat.getColor(
                                context,
                                R.color.colorBackgroundItemStopUnselected
                            )
                        )
                    }
                }
                itemView.setOnClickListener {
                    if (!item.isFinishedStops) {
                        if (item.isSelected) {
                            item.isSelected = false
                            eventButtonContainer.visibility = GONE
                            line.visibility = GONE
                            itemCard.setCardBackgroundColor(
                                ContextCompat.getColor(
                                    context,
                                    R.color.colorBackgroundItemStopUnselected
                                )
                            )
                            position.background = ContextCompat.getDrawable(
                                context,
                                R.drawable.step_item_position_unselected_state
                            )
                        } else {
                            item.isSelected = true
                            eventButtonContainer.visibility = VISIBLE
                            line.visibility = VISIBLE
                            line.visibility = VISIBLE
                            itemCard.setCardBackgroundColor(
                                ContextCompat.getColor(
                                    context,
                                    R.color.colorBackgroundItemStopSelected
                                )
                            )
                            position.background = ContextCompat.getDrawable(
                                context,
                                R.drawable.step_item_position_selected_state
                            )


                        }
                    }
                }
            }
        }
    }

    fun updateList(it: MutableList<StopsModel>?) {
        it?.run {
            itemList = this
            notifyDataSetChanged()
        }
    }
}