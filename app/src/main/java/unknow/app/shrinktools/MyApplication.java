package unknow.app.shrinktools;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application
{
    public static MyApplication Instance = null;

    @Override
    public void onCreate()
    {
        try
        {
            super.onCreate();
            Instance = this;
        }
        catch (Exception Err)
        {
            Log.e("ShrinkTools", Err.toString());
        }
    }
}
