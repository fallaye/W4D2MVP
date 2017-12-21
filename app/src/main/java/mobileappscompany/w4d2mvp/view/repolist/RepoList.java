package mobileappscompany.w4d2mvp.view.repolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import mobileappscompany.w4d2mvp.R;
import mobileappscompany.w4d2mvp.model.Repo;

/**
 * Created by fallaye on 12/19/17.
 */

public class RepoList extends AppCompatActivity implements  RepoListContract.View{
    private TextView textView;

    private EditText etFirstname, etLastname;
    //private TextView textView;
    public static final String TAG ="Repolist";

    private RepoListPresenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tvFullName);
        etFirstname = findViewById(R.id.etFirstName);
        etLastname = findViewById(R.id.etLastName);

        presenter = new RepoListPresenter();
        presenter.attachView(this);

        presenter.getRepos("manroopsingh");


    }

    public void addNames(View view) {
        Log.d(TAG, "addNames: ");
        String firstName = etFirstname.getText().toString();
        String lastName = etLastname.getText().toString();

        presenter.getFullName(firstName,lastName);



    }

    @Override
    public void showError(String error) {
        Log.d(TAG, "showError: ");
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFullName(String fullName) {

        Log.d(TAG, "setFullName: ");
        textView.setText(fullName);
    }

    @Override
    public void setRepos(List<Repo> repos) {

        for (Repo r :
                repos) {
            Log.d(TAG, r.getFullName());
        }
    }


}
