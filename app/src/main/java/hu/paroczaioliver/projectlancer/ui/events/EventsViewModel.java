package hu.paroczaioliver.projectlancer.ui.events;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EventsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Rendezvények - Fejlesztés alatt");
    }

    public LiveData<String> getText() {
        return mText;
    }
}