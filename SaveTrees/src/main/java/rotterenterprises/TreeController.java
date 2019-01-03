package rotterenterprises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import rotterenterprises.dao.TreeRepository;
import rotterenterprises.forms.PersonForm;
import rotterenterprises.forms.TreeForm;
import rotterenterprises.models.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class TreeController {

    @Autowired
    TreeService service;

    @RequestMapping( value = "/listTrees")
    public String listTrees(Model model) {

        List<Tree> wald = service.getAllTrees();
        model.addAttribute("forest", wald);

        return "trees";
    }

    @RequestMapping(value = { "/addATree" }, method = RequestMethod.GET)
    public String showAddTreePage(Model model) {

        TreeForm treeForm = new TreeForm();
        model.addAttribute("treeForm", treeForm);

        return "addATree";
    }

    @RequestMapping(value = { "/addATree" }, method = RequestMethod.POST)
    public String saveTree(Model model, //
                             @ModelAttribute("personForm") TreeForm tF) {

        String treeName = tF.getTreename();
        String treekind = tF.getTreekind();
        int oxyamount = tF.getOxyperhour();
        String treeseed = tF.getTreeseed();

        if (treeName != null && treeName.length() > 0 //
                && treekind != null && treekind.length() > 0) {
            Tree tree = new Tree();
            tree.setTreeName(treeName);
            tree.setTreeKind(treekind);
            tree.setOxyperhour(oxyamount);
            tree.setTreeseed(treeseed);
            service.addTree(tree);

            return "redirect:/listTrees";
        }
        //model.addAttribute("errorMessage", errorMessage);
        return "addTree";
    }

}
