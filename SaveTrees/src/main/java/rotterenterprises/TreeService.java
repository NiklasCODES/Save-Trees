package rotterenterprises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import rotterenterprises.dao.TreeRepository;
import rotterenterprises.models.Tree;

import java.util.ArrayList;
import java.util.List;

@Service
public class TreeService {

    @Autowired
    private TreeRepository repo;

    public List<Tree> getAllTrees() {
        List<Tree> list = new ArrayList<>();
        repo.findAll().forEach(e -> list.add(e));
        return list;
    }

    public synchronized void addTree( Tree tree) {
        long id = tree.getId();
        //List<Tree> list = (List<Tree>) repo.findById(id).get();
        //if(list.size() > 0) {
        //    return false;
       // } else {
            repo.save(tree);
       //     return true;
        //}
    }

    public void updateTree( Tree tree) {
        repo.save(tree);
    }

    public void deleteTree( Tree tree) {
        repo.delete(tree);
    }
}
