/*
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

package com.aliyuncs.cf.transform.v20151127;

import com.aliyuncs.cf.model.v20151127.MonthlyPaymentCheckOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MonthlyPaymentCheckOrderResponseUnmarshaller {

	public static MonthlyPaymentCheckOrderResponse unmarshall(MonthlyPaymentCheckOrderResponse monthlyPaymentCheckOrderResponse, UnmarshallerContext context) {
		
		monthlyPaymentCheckOrderResponse.setRequestId(context.stringValue("MonthlyPaymentCheckOrderResponse.requestId"));
		monthlyPaymentCheckOrderResponse.setData(context.booleanValue("MonthlyPaymentCheckOrderResponse.data"));
		monthlyPaymentCheckOrderResponse.setCode(context.stringValue("MonthlyPaymentCheckOrderResponse.code"));
		monthlyPaymentCheckOrderResponse.setSuccess(context.booleanValue("MonthlyPaymentCheckOrderResponse.success"));
		monthlyPaymentCheckOrderResponse.setMessage(context.stringValue("MonthlyPaymentCheckOrderResponse.message"));
	 
	 	return monthlyPaymentCheckOrderResponse;
	}
}