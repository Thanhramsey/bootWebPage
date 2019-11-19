package com.thanh.controller;

import com.thanh.domain.User;
import com.thanh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = { "/userLogin" },method={RequestMethod.GET,RequestMethod.POST})
    public String logIn(
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "password", required = false) String password,
            Model model) {

        if((email==null ||email.equals(""))  && (password==null )){
            return "login";
        }
        else{
        User user = userRepository.findByEmail(email);
        if(user != null){
            if(user.getPassword().equals(password)){
                return "admin";
            }
            model.addAttribute("message","[{\"id\":18,\"firstname\":\"business\",\"beneficiaryAction\":\"UPDATE\",\"addressLine1\":\"Phan VanTri\",\"addressLine2\":\"GoVap\",\"stateId\":null,\"zip\":\"12321321\",\"contactno\":\"0967891231\",\"nationalityId\":2,\"dateOfBirth\":\"1998-09-20\",\"subscriberId\":null,\"msisdn\":null,\"beneficiaryState\":\"123213\",\"beneficiaryType\":\"member\",\"beneficiaryAccountType\":\"Business\",\"attachments\":{\"frontDocument\":{\"identificationFile\":\"image/jpeg\",\"data\":\"\",\"identificationNumber\":\"backDocument\",\"identificationType\":\"2\",\"documentName\":\"72942257_2805464209485465_4176046343132807168_n.jpg\",\"encoding\":\"BASE64\"},\"proofDocument\":{\"identificationFile\":\"image/png\",\"data\":\"\",\"identificationNumber\":\"proofDocument\",\"identificationType\":\"18\",\"documentName\":\"pg2.png\",\"encoding\":\"BASE64\"}}},{\"id\":19,\"firstname\":\"superfuinf\",\"beneficiaryAction\":\"UPDATE\",\"addressLine1\":\"phan van tri\",\"addressLine2\":\"pham van dong\",\"stateId\":null,\"zip\":\"123123\",\"contactno\":\"1213123111\",\"nationalityId\":2,\"dateOfBirth\":\"1990-01-01\",\"subscriberId\":null,\"msisdn\":null,\"beneficiaryState\":\"12321\",\"beneficiaryType\":\"trustee\",\"beneficiaryAccountType\":\"Self Managed Super Fund\",\"attachments\":null}]");
            return "login";
        }
        model.addAttribute("message","You haven't created account");
        return "login";
        }
    }
}
