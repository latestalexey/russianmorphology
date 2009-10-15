/**
 * Copyright 2009 Alexander Kuznetsov
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
package org.apache.lucene.morpholgy.english;

import org.apache.lucene.morphology.LuceneMorph;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class RussianLuceneMorphTest {
    private LuceneMorph luceneMorph;

    @Before
    public void setUp() throws IOException {
        luceneMorph = new LuceneMorph(this.getClass().getResourceAsStream("/org/apache/lucene/morphology/english/morph.info"), new EnglishLetterDecoderEncoder());
    }

    @Test
    public void shoudGetCorrentMorphInfo() throws IOException {
        System.out.println(luceneMorph.getMorhInfo("purchases"));
        System.out.println(luceneMorph.getMorhInfo("existing"));
        System.out.println(luceneMorph.getMorhInfo("was"));
    }
}