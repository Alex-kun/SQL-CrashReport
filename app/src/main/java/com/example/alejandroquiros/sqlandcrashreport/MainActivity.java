package com.example.alejandroquiros.sqlandcrashreport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.alejandroquiros.sqlandcrashreport.sqlliteadmin.Contact;
import com.example.alejandroquiros.sqlandcrashreport.sqlliteadmin.DatabaseHandler;

public class MainActivity extends AppCompatActivity {

    DatabaseHandler databaseHandler = new DatabaseHandler(this);
    Contact contact = new Contact(4,"Alejandro", "123434");
    Contact contact2 = new Contact(5,"Guille", "236274");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Añadimos los contactos
        databaseHandler.addContact(contact);
        databaseHandler.addContact(contact2);

        Contact c1 = databaseHandler.getContact(4);
        Log.v("Contacto SQL", c1.getName()+" --- "+c1.getPhoneNumber());
        Log.v("Contacto SQL", " Contactos: "+databaseHandler.getAllContacts());
    }


}
