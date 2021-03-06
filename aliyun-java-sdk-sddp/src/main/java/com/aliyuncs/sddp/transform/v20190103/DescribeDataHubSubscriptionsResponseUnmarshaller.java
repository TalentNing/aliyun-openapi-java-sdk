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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDataHubSubscriptionsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataHubSubscriptionsResponse.Subscription;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataHubSubscriptionsResponseUnmarshaller {

	public static DescribeDataHubSubscriptionsResponse unmarshall(DescribeDataHubSubscriptionsResponse describeDataHubSubscriptionsResponse, UnmarshallerContext context) {
		
		describeDataHubSubscriptionsResponse.setRequestId(context.stringValue("DescribeDataHubSubscriptionsResponse.RequestId"));
		describeDataHubSubscriptionsResponse.setPageSize(context.integerValue("DescribeDataHubSubscriptionsResponse.PageSize"));
		describeDataHubSubscriptionsResponse.setCurrentPage(context.integerValue("DescribeDataHubSubscriptionsResponse.CurrentPage"));
		describeDataHubSubscriptionsResponse.setTotalCount(context.integerValue("DescribeDataHubSubscriptionsResponse.TotalCount"));

		List<Subscription> items = new ArrayList<Subscription>();
		for (int i = 0; i < context.lengthValue("DescribeDataHubSubscriptionsResponse.Items.Length"); i++) {
			Subscription subscription = new Subscription();
			subscription.setId(context.longValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].Id"));
			subscription.setName(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].Name"));
			subscription.setDescription(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].Description"));
			subscription.setCreationTime(context.longValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].CreationTime"));
			subscription.setState(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].State"));
			subscription.setApplicationName(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].ApplicationName"));
			subscription.setUserId(context.longValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].UserId"));
			subscription.setLoginName(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].LoginName"));
			subscription.setDisplayName(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].DisplayName"));
			subscription.setSubscriptionUserId(context.longValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].SubscriptionUserId"));
			subscription.setSubscriptionUserName(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].SubscriptionUserName"));
			subscription.setSubscriptionDisplayName(context.stringValue("DescribeDataHubSubscriptionsResponse.Items["+ i +"].SubscriptionDisplayName"));

			items.add(subscription);
		}
		describeDataHubSubscriptionsResponse.setItems(items);
	 
	 	return describeDataHubSubscriptionsResponse;
	}
}