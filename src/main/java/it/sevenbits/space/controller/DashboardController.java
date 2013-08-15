package it.sevenbits.space.controller;

import it.sevenbits.space.dao.IEventDao;
import it.sevenbits.space.dao.ISubscriptionDao;
import it.sevenbits.space.forms.SubscriptionForm;
import it.sevenbits.space.model.Event;
import it.sevenbits.space.model.Subscription;
import it.sevenbits.space.validators.SubscriptionVaildator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DashboardController {

    //public final String IMG_SRC = "/space_adventures/resources/img/";

    @Autowired
    private ISubscriptionDao ISubscriptionDao;

    @Autowired
    private IEventDao IEventDao;

    @Autowired
    private SubscriptionVaildator subscriptionVaildator;

    /*@Value(value = "${img.url}")
    public static String IMG_SRC;*/

    @Value("${app.img.url}")
    public static String IMG_SRC;
    @Value("#{app.img.url}")
    public static String IMG_SRC2;
    @Value("${img.url}")
    public static String IMG_SRC3;
    @Value("#{img.url}")
    public static String IMG_SRC4;

    /*@Autowired
    private Environment env;
    public static String IMG_SRC1; = env.getProperty("img.url")*/



    /**
     * <p>Отображает список событий на главной страницк</p>
     *
     */

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public ModelAndView showListEvent() {

        /*Properties prop = new Properties();
        try {
            InputStream inStream = getClass().getClassLoader().getResourceAsStream("app.properties");
            prop.load(inStream);
            inStream.close();
        } catch (IOException e) {
            //return DEFAULT_PAGE_SIZE;
        }
        String str = prop.getProperty("img.url");
        String IMG_SRC = str.substring(1, str.length() - 1); */

        ModelAndView modelAndView = new ModelAndView("index");
        List<Event> results  = IEventDao.getAllEvent();
        for (Event item : results) {
            String img = item.getImg();
            //img = "/space_adventures/resources/img/" + img;
            img = IMG_SRC + img;
            item.setImg(img);
        }
        modelAndView.addObject("events", results);
        return modelAndView;
    }

    /**
     * <p>КДобавление электронного адресса подписчика в базу данных,
     * в случае успешной валидации. В противном случае, отрисовывается форма с ошибкой</p>
     * @param subscriptionForm объект - форма подписки
     */
    @RequestMapping(value = "/index.html", method = RequestMethod.POST)
    public ModelAndView addEventOnMain(@Valid final SubscriptionForm subscriptionForm, final BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("subscribe-form");
            modelAndView.addObject("subscriptionForm", subscriptionForm);
            return modelAndView;
        }
        Subscription subscription = new Subscription();
        subscription.setEmail(subscriptionForm.getEmail());
        ISubscriptionDao.create(subscription);
        return null;
    }

    /**
     * Отрисовка формы
     */
    @RequestMapping(value = "/subscribe-form.html", method = RequestMethod.GET)
    public ModelAndView addSubscription() {
        SubscriptionForm subscriptionForm = new SubscriptionForm();
        ModelAndView modelAndView = new ModelAndView("subscribe-form");
        modelAndView.addObject("subscriptionForm", subscriptionForm);
        return modelAndView;
    }

    @InitBinder
    protected void initBinder(final WebDataBinder binder) {
        binder.setValidator(subscriptionVaildator);
    }
}