package co.techbus.www.firebasetest;

import com.firebase.client.Firebase;

/**
 * Created by sravan on 11/07/16.
 */
public class CrowdWeather extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
