package com.example.uidesign

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import java.util.*

class Adapter(val context:Context, val imageList: List<Int>):
    RecyclerView.Adapter<Adapter.ImageViewHolder>() {

    class ImageViewHolder(itemView:View ):RecyclerView.ViewHolder(itemView){
         val imageview:ImageView = itemView.findViewById(R.id.pager_image)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.pager_layout,parent,false)
        return ImageViewHolder(view)

    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imageview.setImageResource(imageList[position])
    }

   /* override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.pager_layout, container, false)
        val imageView = view.findViewById<ImageView>(R.id.pager_image)
        imageView.setImageResource(imageList[position])
        container.addView(view)
        return view
    }

    override fun getCount(): Int {
       return imageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        container.removeView(`object`  as View)
    }*/

    /*override fun getCount(): Int {
        return imageList.size
    }


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ConstraintLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


        val itemView: View = mLayoutInflater.inflate(R.layout.pager_layout, container, false)


        val imageView: ImageView = itemView.findViewById<View>(R.id.pager_image) as ImageView


        imageView.setImageResource(imageList.get(position))


        Objects.requireNonNull(container).addView(itemView)


        return itemView
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as ConstraintLayout)
    }*/


}