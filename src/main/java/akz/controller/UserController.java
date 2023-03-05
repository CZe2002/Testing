package akz.controller;


import akz.dao.UserDao;
import akz.models.User;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {
    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public String userCreatePost(@RequestParam("name") String name, @RequestParam("mail") String mail,
                                 @RequestParam("phone") String phone, @RequestParam("address") String address) {
        UserDao userdao = new UserDao();
        User user = new User(name, mail, phone, address);
        userdao.createUser(user);
        return "home";
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.GET)
    public String userDeleteGet(@RequestParam("iduser") int iduser) {
        // get the user with the specified ID
        UserDao userdao = new UserDao();
        userdao.deleteUser(iduser);
        return "user.view";
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public String userUpdatePost(@RequestParam("iduser") String iduser, @RequestParam("name") String name, @RequestParam("mail") String mail,
                                 @RequestParam("phone") String phone, @RequestParam("address") String address) {
        // Update the user with the specified ID

        int id=Integer.parseInt(iduser);
        UserDao userdao = new UserDao();
        User user=new User(id, name, mail, phone, address);
        userdao.updateUser(user);
        return "user.view";
    }
}







