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
package com.kxd.talos.trace.sample.service;

import java.util.concurrent.Callable;

import com.kxd.talos.core.trace.TalosTrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 请输入功能描述
 *
 * @author X-MAN 2016年10月9日
 * @param <String>
 */
@TalosTrace
@Service("callableService")
public class CallableServiceA<String> implements Callable<String> {

	@Autowired
	private AopServiceB aopServiceB;
	
	@Override
	public String call() throws Exception {
		aopServiceB.step1();
		aopServiceB.step2();
		return (String) "finish";
	}

}
