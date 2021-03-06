/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.support.car.test;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Looper;
import android.support.car.Car;
import android.support.car.ServiceConnectionListener;
import android.support.car.hardware.CarSensorEvent;
import android.support.car.hardware.CarSensorManager;
import android.test.AndroidTestCase;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/** TODO change to mocking
public class CarSensorManagerTest extends AndroidTestCase {
    private static final long DEFAULT_WAIT_TIMEOUT_MS = 3000;

    private final Semaphore mConnectionWait = new Semaphore(0);

    private Car mCar;
    private CarSensorManager mCarSensorManager;

    private final ServiceConnectionListener mConnectionListener = new ServiceConnectionListener() {

        @Override
        public void onServiceSuspended(int cause) {
            assertMainThread();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            assertMainThread();
        }

        @Override
        public void onServiceConnectionFailed(int cause) {
            assertMainThread();
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            assertMainThread();
            mConnectionWait.release();
        }
    };

    private void assertMainThread() {
        assertTrue(Looper.getMainLooper().isCurrentThread());
    }
    private void waitForConnection(long timeoutMs) throws InterruptedException {
        mConnectionWait.tryAcquire(timeoutMs, TimeUnit.MILLISECONDS);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mCar = new Car(getContext(), mConnectionListener, null);
        mCar.connect();
        waitForConnection(DEFAULT_WAIT_TIMEOUT_MS);
        mCarSensorManager =
                (CarSensorManager) mCar.getCarManager(Car.SENSOR_SERVICE);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        mCar.disconnect();
    }

    public void testDrivingPolicy() throws Exception {
        int[] supportedSensors = mCarSensorManager.getSupportedSensors();
        assertNotNull(supportedSensors);
        boolean found = false;
        for (int sensor: supportedSensors) {
            if (sensor == CarSensorManager.SENSOR_TYPE_DRIVING_STATUS) {
                found = true;
                break;
            }
        }
        assertTrue(found);
        assertTrue(mCarSensorManager.isSensorSupported(
                CarSensorManager.SENSOR_TYPE_DRIVING_STATUS));
        assertTrue(CarSensorManager.isSensorSupported(supportedSensors,
                CarSensorManager.SENSOR_TYPE_DRIVING_STATUS));
        CarSensorEvent lastEvent = mCarSensorManager.getLatestSensorEvent(
                CarSensorManager.SENSOR_TYPE_DRIVING_STATUS);
        assertNotNull(lastEvent);
    }
}*/
