// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.ClassicTokenizer;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.ClassicTokenizer} and
 * {@link ClassicTokenizer}.
 */
public final class ClassicTokenizerConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.ClassicTokenizer} to {@link ClassicTokenizer}.
     */
    public static ClassicTokenizer map(com.azure.search.documents.indexes.implementation.models.ClassicTokenizer obj) {
        if (obj == null) {
            return null;
        }

        return new ClassicTokenizer(obj.getName()).setMaxTokenLength(obj.getMaxTokenLength());
    }

    /**
     * Maps from {@link ClassicTokenizer} to {@link com.azure.search.documents.indexes.implementation.models.ClassicTokenizer}.
     */
    public static com.azure.search.documents.indexes.implementation.models.ClassicTokenizer map(ClassicTokenizer obj) {
        if (obj == null) {
            return null;
        }

        return new com.azure.search.documents.indexes.implementation.models.ClassicTokenizer(obj.getName())
            .setMaxTokenLength(obj.getMaxTokenLength());
    }

    private ClassicTokenizerConverter() {
    }
}
