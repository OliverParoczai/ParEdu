package hu.paroczaioliver.paredu.ui.projects;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjectsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProjectsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Projektek - Fejlesztés alatt");
    }

    public LiveData<String> getText() {
        return mText;
    }
}