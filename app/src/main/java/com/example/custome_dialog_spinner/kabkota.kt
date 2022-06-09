package com.example.custome_dialog_spinner

import android.content.*
import android.view.*
import android.widget.*

class AdapterKabKota (
    applicationContext: Context,
    private val logo: IntArray,
    private val nama: Array<String>
): BaseAdapter(){
    val inflater = LayoutInflater.from(applicationContext)

    override fun getCount() = logo.size
    override fun getItem(position: Int) = null
    override fun getItemId(postion: Int) = 0L

    override fun getView(positon: Int, convertView: View?, parent: ViewGroup?): View {
        val cv = inflater.inflate(R.layout.layoutitemspinner, null)
        val imgLogo = cv.findViewById<ImageView>(R.id.imgLogo)
        val tvNama = cv.findViewById<TextView>(R.id.tvNama)
        imgLogo.setImageResource(logo[positon])
        tvNama.text = nama[positon]
        return cv
    }
}