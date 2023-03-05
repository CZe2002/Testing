package akz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import akz.helper.MyHelper;
import akz.models.User;
import com.mysql.cj.protocol.Resultset;



public class UserDao {
    public int createUser(User user) {
        int status=0;
        Connection connection=MyHelper.getInstance().getConnection();
        String quary="INSERT INTO user(name,mail,phone,address) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps=connection.prepareStatement(quary);
            ps.setString(1, user.getName());
            ps.setString(2, user.getMail());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            status=ps.executeUpdate();


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return status;
    }

    public List<User> getAllUsers(){
        Connection connection=MyHelper.getInstance().getConnection();
        String quary="SELECT * from user";
        List<User>users=new ArrayList();
        ResultSet rs;
        try {
            PreparedStatement ps=connection.prepareStatement(quary);
            rs=ps.executeQuery();
            while(rs.next()) {
                User user=new User(rs.getInt("iduser"),rs.getString("name"),rs.getString("mail"),rs.getString("phone"),rs.getString("address"));
                users.add(user);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return users;
    }

    public int deleteUser(int iduser) {

        Connection connection=MyHelper.getInstance().getConnection();
        String quary="DELETE FROM user WHERE iduser=?";
        int status=0;
        try {
            PreparedStatement ps=connection.prepareStatement(quary);
            ps.setInt(1, iduser);
            status=ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return status;

    }

    public User getUserbyid(int iduser) {
        Connection connection=MyHelper.getInstance().getConnection();
        String quary="SELECT * FROM user WHERE iduser=?";
        User user=null;
        ResultSet rs;
        try (PreparedStatement ps = connection.prepareStatement(quary)) {
            ps.setInt(1, iduser);
            rs = ps.executeQuery();
            while(rs.next()) {
                user = new User(rs.getInt("iduser"),rs.getString("name"),rs.getString("mail"),rs.getString("phone"),rs.getString("address"));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return user;

    }

    public int updateUser(User user) {
        Connection connection= MyHelper.getInstance().getConnection();

        String quary="UPDATE user SET name=?, mail=?, phone=?, address=? WHERE iduser=?";
        int status=0;
        try {
            PreparedStatement ps=connection.prepareStatement(quary);

            ps.setString(1, user.getName());
            ps.setString(2, user.getMail());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setInt(5,user.getIduser());
            status=ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return status;

    }

}