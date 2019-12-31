package com.reactlibrary;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;

import org.junit.Test;
import org.mockito.Mockito;

import androidx.test.annotation.UiThreadTest;
import androidx.test.core.app.ApplicationProvider;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;


public class MyToastModuleTest {
    private final Context context = ApplicationProvider.getApplicationContext();

    @Test
    public void sampleMethod() {
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

    @Test
    @UiThreadTest
    public void show(){
        ReactApplicationContext mContext = new ReactApplicationContext(context);
        MyToastModule module = new MyToastModule(mContext);
        String s = "Hello";
        Toast cb = Mockito.mock(Toast.class);
        module.show(s);
        Mockito.verify(cb).makeText(mContext, s, anyInt());
    }
}