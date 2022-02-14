package com.flipperdevices.bridge.dao.api.delegates

import com.flipperdevices.bridge.dao.api.model.FlipperKey
import com.flipperdevices.bridge.dao.api.model.parsed.FlipperKeyParsed

interface KeyParser {
    /**
     * Load key content and map it to object
     */
    suspend fun parseKey(flipperKey: FlipperKey): FlipperKeyParsed
}