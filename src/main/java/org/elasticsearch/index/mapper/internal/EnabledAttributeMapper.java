/*
 * Licensed to ElasticSearch and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.index.mapper.internal;

public enum EnabledAttributeMapper {
    ENABLED(true), UNSET_ENABLED(true), DISABLED(false), UNSET_DISABLED(false);

    public final boolean enabled;

    EnabledAttributeMapper(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean unset() {
        return this == UNSET_DISABLED || this == UNSET_ENABLED;
    }
}
