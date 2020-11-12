package com.me.spring.controller;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

class SMTPAuthenticator extends Authenticator
{
public PasswordAuthentication getPasswordAuthentication()
{
    String username = "Poweron235@hotmail.com";
    String password = "Muhammed1";
    return new PasswordAuthentication(username, password);
}
}
