/*
 * WebimEndpoint.java
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package webim.model;

/**
 * Webim用户
 * 
 * @author Feng Lee <feng.lee@nextalk.im>
 *
 */
public class WebimUser extends WebimEndpoint {
	
	private static final long serialVersionUID = 3247528666563794357L;
	
	public static final String TAG = "uid";

	public WebimUser(String id, String nick) {
		super(id, nick);
	}

}
