/**
 * Copyright 2012-2017 Kaixindai Financing Services Jiangsu Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kxd.talos.storage.monitor.utils;

import java.lang.management.ManagementFactory;

/**
 * 请输入功能描述
 *
 * @author X-MAN 2016年9月27日
 */
public class JdkRuntimeUtilities {
	/**
	 * get processId from jdk jmx apis
	 * @return
	 */
	public static final String getProcessId(){
		String pid = "0";
		try {
			String jvmName = ManagementFactory.getRuntimeMXBean().getName();
			pid = jvmName.split("@")[0];  
		} catch (Exception e) {
			
		}  
		return pid;
	}
	
	public static final String getCurrentThreadName(){
		String currentThreadName = Thread.currentThread().getName();
		return currentThreadName;
	}

}
