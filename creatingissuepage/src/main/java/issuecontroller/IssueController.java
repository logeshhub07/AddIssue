package issuecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import userissue.InputIssue;

@RestController
@RequestMapping("/issue")
public class IssueController {
	
	@Autowired
	private IssueRepository issueRepository;
	
	@PostMapping("/addIssues")
	public String add(@RequestBody InputIssue inputIssue) {
		issueRepository.save(inputIssue);
		return "issues added successfully";
	}
	
	@GetMapping("/getIssues")
	public List<InputIssue> getIssues(){
		return issueRepository.findAll();
	}

}
