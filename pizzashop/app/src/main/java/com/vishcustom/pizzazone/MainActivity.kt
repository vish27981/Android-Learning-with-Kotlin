package com.vishcustom.pizzazone

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : Activity() {

    private lateinit var tl: TableLayout
    private lateinit var tr1: TableRow
    private lateinit var tr2: TableRow
    private lateinit var tr3: TableRow
    private lateinit var tr4: TableRow
    private lateinit var menu: TextView
    private lateinit var price: TextView
    private lateinit var price1: TextView
    private lateinit var price2: TextView
    private lateinit var price3: TextView
    private lateinit var quantity: TextView
    private lateinit var total: TextView
    private lateinit var total1: TextView
    private lateinit var total2: TextView
    private lateinit var total3: TextView
    private lateinit var grandtotal: TextView
    private lateinit var quantity1: EditText
    private lateinit var quantity2: EditText
    private lateinit var quantity3: EditText
    private lateinit var c1: CheckBox
    private lateinit var c2: CheckBox
    private lateinit var c3: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tl = findViewById(R.id.tableLayout1)
        tr1 = findViewById(R.id.tableRow1)
        tr2 = findViewById(R.id.tableRow2)
        tr3 = findViewById(R.id.tableRow3)
        tr4 = findViewById(R.id.tableRow4)
        menu = findViewById(R.id.textView1)
        price = findViewById(R.id.textView2)
        quantity = findViewById(R.id.textView3)
        total = findViewById(R.id.textView4)
        grandtotal = findViewById(R.id.textView5)
        price1 = findViewById(R.id.textView6)
        price2 = findViewById(R.id.textView7)
        price3 = findViewById(R.id.textView8)
        total1 = findViewById(R.id.textView9)
        total2 = findViewById(R.id.textView10)
        total3 = findViewById(R.id.textView11)
        quantity1 = findViewById(R.id.editText1)
        quantity2 = findViewById(R.id.editText2)
        quantity3 = findViewById(R.id.editText3)
        c1 = findViewById(R.id.checkBox1)
        c2 = findViewById(R.id.checkBox2)
        c3 = findViewById(R.id.checkBox3)

        c1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                quantity.visibility = View.VISIBLE
                quantity1.visibility = View.VISIBLE
                total.visibility = View.VISIBLE
                total1.visibility = View.VISIBLE
                grandtotal.visibility = View.VISIBLE
            } else {
                quantity.visibility = View.GONE
                quantity1.visibility = View.GONE
                total.visibility = View.GONE
                total1.visibility = View.GONE
                grandtotal.visibility = View.GONE
            }
        }

        total1.setOnClickListener {
            val p = price1.text.toString().toInt()
            val q = quantity1.text.toString().toInt()
            val t = p * q
            total1.text = t.toString()
        }

        c2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                quantity.visibility = View.VISIBLE
                quantity2.visibility = View.VISIBLE
                total.visibility = View.VISIBLE
                total2.visibility = View.VISIBLE
                grandtotal.visibility = View.VISIBLE
            } else {
                quantity.visibility = View.GONE
                quantity2.visibility = View.GONE
                total.visibility = View.GONE
                total2.visibility = View.GONE
                grandtotal.visibility = View.GONE
            }
        }

        total2.setOnClickListener {
            val p = price2.text.toString().toInt()
            val q = quantity2.text.toString().toInt()
            val t = p * q
            total2.text = t.toString()
        }

        c3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                quantity.visibility = View.VISIBLE
                quantity3.visibility = View.VISIBLE
                total.visibility = View.VISIBLE
                total3.visibility = View.VISIBLE
                grandtotal.visibility = View.VISIBLE
            } else {
                quantity.visibility = View.GONE
                quantity3.visibility = View.GONE
                total.visibility = View.GONE
                total3.visibility = View.GONE
                grandtotal.visibility = View.GONE
            }
        }

        total3.setOnClickListener {
            val p = price3.text.toString().toInt()
            val q = quantity3.text.toString().toInt()
            val t = p * q
            total3.text = t.toString()
        }

        grandtotal.setOnClickListener {
            val a = total1.text.toString().toInt()
            val b = total2.text.toString().toInt()
            val c = total3.text.toString().toInt()
            val d = a + b + c
            grandtotal.text = d.toString()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.MainActivity, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
