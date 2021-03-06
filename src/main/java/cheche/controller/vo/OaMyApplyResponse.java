package cheche.controller.vo;

import java.util.List;

import cheche.core.dto.approval.MyApplySummary;

/**
 * 我发起的Response
 * 
 * 返回值："我发起的"审批摘要
 * 
 * @author jieli
 *
 */
public class OaMyApplyResponse extends BaseResponse<List<MyApplySummary>> {
	/** 总数 */
	private Integer total;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
