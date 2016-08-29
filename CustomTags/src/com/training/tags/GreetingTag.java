package com.training.tags;

import java.util.logging.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetingTag extends TagSupport {

    private String message;
    private static Logger log = Logger.getLogger("mylogger");

    public GreetingTag() {
        super();

        log.info("Greeting Tag Initialized");
    }

    public void setMessage(String message) {
        this.message = message;

        log.info("Set message Called");
    }

    @Override
    public int doStartTag() throws JspException {
        // TODO Auto-generated method stub

        JspWriter out = pageContext.getOut();

        try {

            if (message != null) {
                out.println("Welcome to Tag Programming");
            } else {
                out.println(message);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return Tag.SKIP_BODY;
    }

}
