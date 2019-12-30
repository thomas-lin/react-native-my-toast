package com.reactlibrary;

import android.content.Context;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import androidx.test.core.app.ApplicationProvider;

import static org.mockito.ArgumentMatchers.anyString;

public class MyToastModuleTest {

    @Test
    public void sampleMethod() {
        Context context = ApplicationProvider.getApplicationContext();
        ReactApplicationContext mContext = new ReactApplicationContext(context);
        MyToastModule module = new MyToastModule(mContext);

        int i = 10;
        String s = "Hello";
        String expectString = "Received numberArgument: " + i + " stringArgument: " + s;
        Callback cb = Mockito.mock(Callback.class);
        module.sampleMethod(s, i, cb);
        Mockito.verify(cb, Mockito.times(1)).invoke(expectString);
        Mockito.verify(cb).invoke(anyString());
    }
}