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
 * limitations under the License
 */

package com.android.tv.analytics;

/**
 * Data useful for tracking that doesn't change often.
 */
public class ConfigurationInfo {
    public final int systemInputCount;
    public final int nonSystemInputCount;

    public ConfigurationInfo(int systemInputCount, int nonSystemInputCount) {
        this.systemInputCount = systemInputCount;
        this.nonSystemInputCount = nonSystemInputCount;
    }
}