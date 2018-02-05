/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.util.Objects;

public final class DestinationEncryptionConfiguration implements Serializable {
  private final String kmsKeyName;

  public String getKmsKeyName() {
    return this.kmsKeyName;
  }

  public static final class Builder {
    private String kmsKeyName;

    private Builder() {}

    private Builder(DestinationEncryptionConfiguration options) {
      kmsKeyName = options.kmsKeyName;
    }

    public DestinationEncryptionConfiguration.Builder setProjectionFields(String kmsKeyName) {
      this.kmsKeyName = kmsKeyName;
      return this;
    }

    /**
     * Creates a {@code DestinationEncryptionConfiguration} object.
     */
    public DestinationEncryptionConfiguration build() {
      return new DestinationEncryptionConfiguration(this);
    }
  }

  private DestinationEncryptionConfiguration(DestinationEncryptionConfiguration.Builder builder) {
    this.kmsKeyName = builder.kmsKeyName;
  }

  /**
   * Returns a builder for the {@code DestinationEncryptionConfiguration} object.
   */
  public DestinationEncryptionConfiguration.Builder toBuilder() {
    return new DestinationEncryptionConfiguration.Builder(this);
  }

  /**
   * Returns a builder for a {@code DestinationEncryptionConfiguration} object.
   */
  public static DestinationEncryptionConfiguration.Builder newBuilder() {
    return new DestinationEncryptionConfiguration.Builder();
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("kmsKeyName", kmsKeyName)
        .toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsKeyName);
  }

  @Override
  public boolean equals(Object obj) {
    return obj == this
        || obj instanceof DestinationEncryptionConfiguration
        && Objects.equals(kmsKeyName, ((DestinationEncryptionConfiguration) obj).getKmsKeyName());
  }
}
