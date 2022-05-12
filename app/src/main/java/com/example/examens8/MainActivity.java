package com.example.examens8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.examens8.adaptadores.ContactAdapter;
import com.example.examens8.entities.Contact;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("EX_VJ2022","onCreate");
        setContentView(R.layout.activity_main);

        List<Contact> contacts = getContact();
        ContactAdapter adapter = new ContactAdapter(contacts);

        RecyclerView rv = findViewById(R.id.rvContacts);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        /*Button btLog = findViewById(R.id.buttonLlamar);
        btLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("+51 "));
                startActivity(intent);

            }
        });*/



    }

    private List<Contact> getContact(){
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1,"Jeyson Chávez","954135045"));
        contacts.add(new Contact(2,"Bruno Jave","945612378"));
        contacts.add(new Contact(3,"Miguel Rodriguez","789542636"));
        contacts.add(new Contact(4,"Gianmarco Gutierres","987312654"));
        contacts.add(new Contact(5,"Piero Mori","987789345"));
        contacts.add(new Contact(6,"Rafael Zegarra","91375285"));
        contacts.add(new Contact(7,"Lenin Zamora","396285174"));
        contacts.add(new Contact(8,"Diana Lopez","491768253"));
        contacts.add(new Contact(9,"Paola Diaz","927183246"));
        contacts.add(new Contact(10,"Rossmery Perez","907840535"));

        return contacts;
    }
}