package com.androidsabari.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class StudentPage extends Activity {

    Button btSignIn,btLogin;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_page);
        btLogin = (Button) findViewById(R.id.btLogin);
        btSignIn = (Button) findViewById(R.id.btSign);
        img = (ImageView) findViewById(R.id.imageView1);

        btLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent loginIntent = new Intent(getBaseContext(),Login.class);
                startActivity(loginIntent);
            }
        });

        btSignIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent SignIntent =new Intent(getBaseContext(),SignIn.class);
                startActivity(SignIntent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.student_page, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

//            case R.id.action_settings:
//                Toast.makeText(this, "You Clicked Settings", Toast.LENGTH_LONG).show();
        }

        return true;
    }

}
