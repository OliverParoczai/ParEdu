package hu.paroczaioliver.paredu.ui.schools;

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

public class SchoolsFragment extends Fragment {

    private SchoolsViewModel schoolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        schoolsViewModel =
                new ViewModelProvider(this).get(SchoolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_schools, container, false);
        final TextView textView = root.findViewById(R.id.text_schools);
        schoolsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}