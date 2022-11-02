package com.example.interfejs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.EditText;

import java.util.Date;
import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
//        TaskStorage taskStorage = TaskStorage.getInstance();
//        if(fragment == null){
//            fragment = new TaskFragment();
//            fragmentManager.beginTransaction()
//                    .add(R.id.fragment_container, fragment)
//                    .commit();
//        }
//        return fragment;
        UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }
}

