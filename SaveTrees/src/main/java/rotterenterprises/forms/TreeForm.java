package rotterenterprises.forms;

public class TreeForm {

    private String treename;
    private int oxyperhour;
    private String treekind;
    private String treeseed;

    public void setTreename(String treename) {
        this.treename = treename;
    }

    public void setOxyperhour(int oxyperhour) {
        this.oxyperhour = oxyperhour;
    }

    public void setTreekind(String treekind) {
        this.treekind = treekind;
    }

    public void setTreeseed(String treeseed) {
        this.treeseed = treeseed;
    }

    public String getTreename() {

        return treename;
    }

    public int getOxyperhour() {
        return oxyperhour;
    }

    public String getTreekind() {
        return treekind;
    }

    public String getTreeseed() {
        return treeseed;
    }
}
