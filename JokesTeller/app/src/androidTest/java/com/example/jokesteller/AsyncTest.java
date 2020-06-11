package com.example.jokesteller;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

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
        Assert.assertNotEquals("", joke);
    }
}
