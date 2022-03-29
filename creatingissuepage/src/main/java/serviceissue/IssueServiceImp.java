package serviceissue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import issuecontroller.IssueRepository;
import userissue.InputIssue;



@Service
public class IssueServiceImp implements IssueService{
	
	@Autowired
	private IssueRepository issueRepository;

	@Override
	public InputIssue saveIssue(InputIssue inputIssue) {
		return issueRepository.save(inputIssue);
	}

	@Override
	public List<InputIssue> getAllIssue() {
		return issueRepository.findAll();
	}
	
	

}
