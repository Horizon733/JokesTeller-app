package com.example.jokesteller;

import android.content.Context;

import androidx.test.espresso.internal.inject.InstrumentationContext;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;


import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTest {
    @Test
    public void test() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.SendJokes() {
            @Override
            public void onFinish(String joke) {

            }
        });
    endpointsAsyncTask.execute();
    String joke = endpointsAsyncTask.get();
        assertNotNull(joke);
    }
}
