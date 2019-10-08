/*
 * Copyright 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.firebase.internal;

import com.google.api.client.http.HttpResponseException;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseHttpResponse;
import java.io.IOException;

public interface HttpErrorHandler<T extends FirebaseException> {

  T handleIOException(IOException e);

  T handleHttpResponseException(HttpResponseException e, FirebaseHttpResponse response);

  T handleParseException(IOException e, FirebaseHttpResponse response);

}