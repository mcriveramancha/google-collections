/*
 * Copyright (C) 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.collect;

/**
 * Tests for {@link MapConstraints#constrainedSetMultimap}.
 *
 * @author Jared Levy
 */
public class ConstrainedSetMultimapTest extends AbstractSetMultimapTest {

  @Override protected SetMultimap<String, Integer> create() {
    return MapConstraints.<String, Integer>constrainedSetMultimap(
        HashMultimap.<String, Integer>create(),
        MapConstraintsTest.TEST_CONSTRAINT);
  }

  // not serializable
  @Override public void testSerializable() {}
}