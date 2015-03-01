package lehman.android;

import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.util.Log;

public class Lab2Fragment extends Fragment {

    private static final String TAG = AppHelper.APP_LOG_TAG + "Lab2Fragment"; 

	public Lab2Fragment() {}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.v(TAG, "Starting onCreateView");
		View rootView = inflater.inflate(R.layout.fragment_lab2, container, false);
		Log.v(TAG, "onCreateView completed");
		return rootView;
	}

}