package serviceissue;

import java.util.List;

import userissue.InputIssue;

public interface IssueService {
	public InputIssue saveIssue(InputIssue inputIssue);
	public List<InputIssue> getAllIssue();

}
