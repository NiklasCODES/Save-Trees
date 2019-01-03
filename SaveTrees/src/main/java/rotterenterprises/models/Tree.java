package rotterenterprises.models;

import javax.persistence.*;

@Entity
public class Tree {

    private String treeName;
    private String treeKind;
    private String treeseed;
    private int oxyperhour;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id")
    private long id;

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public void setTreeKind(String treeKind) {
        this.treeKind = treeKind;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTreeName() {

        return treeName;
    }

    public String getTreeKind() {
        return treeKind;
    }

    public long getId() {
        return id;
    }

    public void setTreeseed(String treeseed) {
        this.treeseed = treeseed;
    }

    public void setOxyperhour(int oxyperhour) {
        this.oxyperhour = oxyperhour;
    }

    public String getTreeseed() {

        return treeseed;
    }

    public int getOxyperhour() {
        return oxyperhour;
    }
}
