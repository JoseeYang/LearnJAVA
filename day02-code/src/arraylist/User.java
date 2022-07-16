package arraylist;

public class User {
    private String ID;
    private String userName;
    private String password;
    
    
    public User() {
    }
    
    public User(String ID, String userName, String password) {
        this.ID = ID;
        this.userName = userName;
        this.password = password;
    }
    
    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }
    
    /**
     * 设置
     * @param ID ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * 设置
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * 设置
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
