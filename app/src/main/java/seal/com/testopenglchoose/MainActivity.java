package seal.com.testopenglchoose;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    GLES3JNIView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new GLES3JNIView(getApplicationContext());
        setContentView(mView);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    @Override protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        mView.onResume();
    }

}
