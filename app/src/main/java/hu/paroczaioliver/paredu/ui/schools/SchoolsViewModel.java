package hu.paroczaioliver.paredu.ui.schools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SchoolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SchoolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Iskolák - Fejlesztés alatt");
    }

    public LiveData<String> getText() {
        return mText;
    }
}