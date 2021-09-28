import java.util.List;

public class CompanyHierarchyTree {
    List<User> users;

    /**
     *
     * @param users
     */
    public CompanyHierarchyTree(List<User> users){
        this.users = users;
    }

    /**
     * Gets and returns all users from Hierarchy Tree.
     *
     * @return List<User>  all users
     */
    public List<User> getAllUsers() {
        return null;
    }

    /**
     * Gets and returns all users who are higher in the hierarchy than user
     *
     * @param user
     * @return List<User>  list of upper users
     */
    public List<User> getUpperUsers(User user) {
        return null;
    }

    /**
     * Gets and returns all users who are lower in the hierarchy than user
     *
     * @param user
     * @return List<User>  list of lower users
     */
    public List<User> getLowerUsers(User user) {
        return null;
    }

    /**
     * Gets and returns all users who are at the same level in the hierarchy as user
     *
     * @param user
     * @return List<User>  list of the same level users
     */
    public List<User> getSameLevelUsers(User user) {
        return null;
    }
}
