package it.sevenbits.space.controller;

import it.sevenbits.space.dao.SubscriptionDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: denis
 * Date: 7/23/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class SubscriptionController {
    //private Repository repo = new Repository();

    @RequestMapping("/subscriptions.html")
    //public ModelAndView listSubscriptions(Model it.sevenbits.space.model) {
    public String listSubscriptions(Model model) {

        ApplicationContext ctx = (ApplicationContext)new ClassPathXmlApplicationContext("app-context.xml");

        SubscriptionDao dao=(SubscriptionDao)ctx.getBean("userDao");
        /*List<Subscription> users = dao.getAllSubscriptionJdbc();
        int size =
        for(Subscription u:users) {
            System.out.println(u.toString());
            model.addAttribute("subscriptions",u.toString());
        } */

        return "subscriptions";         }
}
