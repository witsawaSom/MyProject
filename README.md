# MyProject

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> stringMutableLiveData;

    public void init()
    {
        stringMutableLiveData=new MutableLiveData<>();
    }

    public void sendData(String msg)
    {
        stringMutableLiveData.setValue(msg);
    }

    public LiveData<String> getMessage()
    {
        return stringMutableLiveData;
    }
}

// Fragment
 MyViewModel mViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        ViewModelProviders.of(getActivity()).get(MyViewModel.class).getMessage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String message) {
               // update list view
            }
        });
// Activity
MyViewModel myViewModel=ViewModelProviders.of(this).get(MyViewModel.class);
myViewModel.init();
myViewModel.sendData("Category");
