package net.vitvol.photogalleryflickr;

import android.support.v4.app.Fragment;

import net.vitvol.photogalleryflickr.fragment.PhotoGalleryFragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }

}
