package com.example.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter

import androidx.appcompat.app.AppCompatActivity

<<<<<<< HEAD
=======
import androidx.navigation.ui.AppBarConfiguration

>>>>>>> 4fae139b0b540b49a2b17d23c419a72ed4bdbfa2
import com.example.notekeeper.databinding.ActivityNoteListBinding
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNoteListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNoteListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)


        binding.fab.setOnClickListener {
            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)

        }

        listNotes.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataManager.notes
        )

        listNotes.setOnItemClickListener { parent, view, position, id ->
            val activityIntent = Intent(this, MainActivity::class.java)
<<<<<<< HEAD
            activityIntent.putExtra(NOTE_POSITION,position)
=======
            activityIntent.putExtra(EXTRA_NOTE_POSITION,position)
>>>>>>> 4fae139b0b540b49a2b17d23c419a72ed4bdbfa2
            startActivity(activityIntent)
        }


    }
<<<<<<< HEAD

    override fun onResume() {
        super.onResume()
        (listNotes.adapter as ArrayAdapter<NoteInfo>).notifyDataSetChanged()
    }
=======
>>>>>>> 4fae139b0b540b49a2b17d23c419a72ed4bdbfa2
}