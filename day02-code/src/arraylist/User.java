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
     * ��ȡ
     * @return ID
     */
    public String getID() {
        return ID;
    }
    
    /**
     * ����
     * @param ID ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    /**
     * ��ȡ
     * @return userName
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * ����
     * @param userName �û���
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * ��ȡ
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * ����
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
