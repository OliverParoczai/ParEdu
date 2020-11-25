package hu.paroczaioliver.paredu.ui.projects;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import hu.paroczaioliver.paredu.R;

public class ProjectsFragment extends Fragment {

    private hu.paroczaioliver.paredu.ui.projects.ProjectsViewModel ProjectsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProjectsViewModel =
                new ViewModelProvider(this).get(hu.paroczaioliver.paredu.ui.projects.ProjectsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_projects, container, false);
        final TextView textView = root.findViewById(R.id.text_projects);
        ProjectsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}