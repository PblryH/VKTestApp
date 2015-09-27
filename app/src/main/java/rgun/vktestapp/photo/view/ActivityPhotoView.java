package rgun.vktestapp.photo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import rgun.vktestapp.photo.PhotoPojo;

public class ActivityPhotoView extends AppCompatActivity {

    public static final String INTENT_EXTRA_PHOTO = "photo";
    private UiPhotoView uiPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        uiPhotoView = new UiPhotoView(this);
        PhotoPojo photo = (PhotoPojo) getIntent().getSerializableExtra(INTENT_EXTRA_PHOTO);
        uiPhotoView.loadImage(photo.url);
    }
}
