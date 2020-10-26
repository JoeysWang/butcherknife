/*
 * Copyright (C) 2020 LitterSun.
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

package com.littersun.butcherknife.plugin;

public class SystemLog implements Log {

    @Override
    public void info(String message) {
        System.out.println("[ButcherKnifePlugin.info] " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("[ButcherKnifePlugin.debug] " + message);
    }

    @Override
    public void warning(String message) {
        System.err.println("[ButcherKnifePlugin.warn] " + message);
    }

    @Override
    public void warning(String message, Throwable cause) {
        System.err.println("[ButcherKnifePlugin.warn] " + message);
        cause.printStackTrace(System.err);
    }

    @Override
    public void error(String message) {
        System.err.println("[ButcherKnifePlugin.error] " + message);
    }

    @Override
    public void error(String message, Throwable cause) {
        System.err.println("[ButcherKnifePlugin.error] " + message);
        cause.printStackTrace(System.err);
    }
}
