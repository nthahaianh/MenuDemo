package com.example.menudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(btnShowContextMenu)

        btnPopupMenu.setOnClickListener { it ->
            var popupMenu = PopupMenu(this, it)
            popupMenu.menuInflater.inflate(R.menu.menu_demo, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.item1 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.submenu11 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.submenu12 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.item2 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.submenu21 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.submenu22 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.submenu23 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.submenu24 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.item3 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.item4 -> {
                        Toast.makeText(this, "${it.title} selected", Toast.LENGTH_SHORT).show()
                        true
                    }
                }
                false
            }
            popupMenu.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_demo,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.submenu11 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.submenu12 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item2 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.submenu21 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.submenu22 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.submenu23 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.submenu24 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item3 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item4 -> {
                Toast.makeText(this, "${item.title} selected", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.cm_item1 -> {
                Toast.makeText(this, "${item.title} selected ", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.cm_submenu11 -> {
                Toast.makeText(this, "${item.title} selected ", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.cm_submenu12 -> {
                Toast.makeText(this, "${item.title} selected ", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.cm_item2 -> {
                Toast.makeText(this, "${item.title} selected ", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.cm_item3 -> {
                Toast.makeText(this, "${item.title} selected ", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.cm_item4 -> {
                Toast.makeText(this, "${item.title} selected ", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}