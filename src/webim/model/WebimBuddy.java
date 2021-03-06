/*
 * WebimBuddy.java
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

import java.io.Serializable;
import java.util.Date;

/**
 * WebimBuddy好友关系
 * 
 * @author Feng Lee <feng.lee@nextalk.im>
 * 
 * @5.9
 */
public class WebimBuddy implements Serializable {

	private static final long serialVersionUID = -6988426926529579572L;

	private String uid;

	private String fid;
	
	public WebimBuddy() {
	}

	public WebimBuddy(String uid, String fid) {
		this.uid = uid;
		this.fid = fid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String toString() {
		return String.format("Buddy(uid=%s, fid=%s,", uid, fid);
	}

}
