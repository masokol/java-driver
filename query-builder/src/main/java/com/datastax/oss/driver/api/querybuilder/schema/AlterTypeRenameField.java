/*
 * Copyright DataStax, Inc.
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
package com.datastax.oss.driver.api.querybuilder.schema;

import com.datastax.oss.driver.api.core.CqlIdentifier;

public interface AlterTypeRenameField {

  /**
   * Adds a field rename to ALTER TYPE specification. This may be repeated with successive calls to
   * rename fields.
   */
  AlterTypeRenameFieldEnd renameField(CqlIdentifier from, CqlIdentifier to);

  /**
   * Shortcut for {@link #renameField(CqlIdentifier,CqlIdentifier)
   * renameField(CqlIdentifier.fromCql(from),CqlIdentifier.fromCql(to))}.
   */
  default AlterTypeRenameFieldEnd renameField(String from, String to) {
    return renameField(CqlIdentifier.fromCql(from), CqlIdentifier.fromCql(to));
  }
}