/*
 * Copyright 2015 Shazam Entertainment Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.shazam.fork.reporter.model;

import java.util.List;

public class FlakinessReport {
    private final String name;
    private final List<PoolHistory> poolHistories;

    public String getName() {
        return name;
    }

    public List<PoolHistory> getPoolHistories() {
        return poolHistories;
    }

    private FlakinessReport(Builder builder) {
        this.name = builder.name;
        this.poolHistories = builder.poolHistories;
    }

    public static class Builder {
        private String name;
        private List<PoolHistory> poolHistories;

        public static Builder flakinessReport() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPoolHistories(List<PoolHistory> poolHistories) {
            this.poolHistories = poolHistories;
            return this;
        }

        public FlakinessReport build() {
            return new FlakinessReport(this);
        }
    }
}