/**
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package io.daex.sdk.core.service.exception;

import io.daex.sdk.core.http.HttpStatus;
import okhttp3.Response;

/**
 * 415 Unsupported Media Type (HTTP/1.1 - RFC 2616).
 */
public class UnsupportedException extends ServiceResponseException {

  /**
   * The Constant serialVersionUID.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new unsupported Exception.
   *
   * @param message the message
   * @param response the HTTP response
   */
  public UnsupportedException(String message, Response response) {
    super(HttpStatus.UNSUPPORTED_MEDIA_TYPE, message, response);
  }

}
