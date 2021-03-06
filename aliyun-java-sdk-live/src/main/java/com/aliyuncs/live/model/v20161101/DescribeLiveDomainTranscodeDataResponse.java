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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainTranscodeDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainTranscodeDataResponse extends AcsResponse {

	private String requestId;

	private List<TranscodeDataInfo> transcodeDataInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TranscodeDataInfo> getTranscodeDataInfos() {
		return this.transcodeDataInfos;
	}

	public void setTranscodeDataInfos(List<TranscodeDataInfo> transcodeDataInfos) {
		this.transcodeDataInfos = transcodeDataInfos;
	}

	public static class TranscodeDataInfo {

		private String date;

		private Integer total;

		private String detail;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
	}

	@Override
	public DescribeLiveDomainTranscodeDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainTranscodeDataResponseUnmarshaller.unmarshall(this, context);
	}
}
