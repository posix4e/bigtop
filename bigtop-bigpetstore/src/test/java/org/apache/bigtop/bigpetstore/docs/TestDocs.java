/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bigtop.bigpetstore.docs;

import java.io.File;

import junit.framework.Assert;

import org.apache.bigtop.bigpetstore.util.BigPetStoreConstants;
import org.apache.bigtop.bigpetstore.util.BigPetStoreConstants.OUTPUTS;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class TestDocs {

    @Test
    public void testGraphViz() throws Exception{
        //test the graphviz file
        //by grepping out the constants.
        String graphviz=FileUtils.readFileToString(new File("arch.dot"));
        System.out.println(graphviz);

        org.junit.Assert.assertTrue(
                graphviz.contains(
                        OUTPUTS.generated.name()));

        org.junit.Assert.assertTrue(
                graphviz.contains(
                        OUTPUTS.cleaned.name()));


    }
}