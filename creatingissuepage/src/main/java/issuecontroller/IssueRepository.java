package issuecontroller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import userissue.InputIssue;

@Repository
public interface IssueRepository extends JpaRepository<InputIssue,Integer>{

}
