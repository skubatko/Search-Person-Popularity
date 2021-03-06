package ru.geekbrains.traineeship.group2.search_person_popularity_mai.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ru.geekbrains.traineeship.group2.search_person_popularity_mai.R;

import static ru.geekbrains.traineeship.group2.search_person_popularity_mai.Activities.MainActivity.databaseHandler;

public class KeywordsDirectoryActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * databaseHandler применяем глобально во всех Activities для обмена данными с БД
     * при доступности Веб-сервиса поменять на класс, имплементирующий работу с Веб-сервисом
     */

    Button btnBackKeywordsDirectory;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_keywords_directory );

        btnBackKeywordsDirectory = (Button) findViewById( R.id.btnBackKeywordsDirectory );
        btnBackKeywordsDirectory.setOnClickListener( this );

        databaseHandler.showDatabaseInfo();

    }

    @Override
    public void onClick( View v ) {
        switch ( v.getId() ) {
            case R.id.btnBackKeywordsDirectory:
                Intent intent = new Intent();
                setResult( RESULT_OK, intent );
                finish();
                break;
        }
    }
}
