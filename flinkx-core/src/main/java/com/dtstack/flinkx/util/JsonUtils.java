/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.flinkx.util;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonGenerationException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonParseException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonMappingException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Reason:
 * Date: 2019/1/7
 * Company: www.dtstack.com
 * @author maqi
 */
public class JsonUtils {

	private static ObjectMapper objectMapper = new ObjectMapper();

	public static <T> T jsonStrToObject(String jsonStr, Class<T> clazz) throws JsonParseException, JsonMappingException, JsonGenerationException, IOException {
		return  objectMapper.readValue(jsonStr, clazz);
	}

}