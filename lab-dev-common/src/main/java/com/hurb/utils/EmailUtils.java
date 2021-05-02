package com.hurb.utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;
import java.util.Random;
@Component
public class EmailUtils {

    @Value("${spring.mail.username}")
    private String from;

    @Resource
    JavaMailSender javaMailSender;

    /**
     * 发送验证码
     *
     * @param email
     * @param session
     */
    public boolean sendMail(String email, HttpSession session) {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            //设置发件人
            mimeMessageHelper.setFrom(from);
            //设置收件人
            mimeMessageHelper.setTo(email);
            //设置邮件主题
            mimeMessageHelper.setSubject("注册验证码");
            //生成随机数
            String random = randomInteger();
            //将随机数放置到session中
            session.setAttribute("email",email);
            session.setAttribute("code",random);
            //设置验证码的样式
            mimeMessageHelper.setText("<font style='color:green'>"+random+"</font>",true);
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 生成随机验证码
     *
     * @return
     */
    private String randomInteger() {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        //生成6位的随机数
        for (int i = 0;i<6;i++){
            int i1 = random.nextInt(10);
            stringBuffer.append(i1);
        }
        return stringBuffer.toString();
    }

}

