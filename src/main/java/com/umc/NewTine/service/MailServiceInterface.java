package com.umc.NewTine.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.umc.NewTine.dto.response.MailConfirmResponse;
import org.springframework.stereotype.Service;

// mail 서비스 interface
public interface MailServiceInterface {

    // 메일 내용 작성
    MimeMessage createMessage(String to) throws MessagingException, UnsupportedEncodingException;


    // 랜덤 인증 코드 전송
    String createKey();

    // 메일 발송
    MailConfirmResponse sendSimpleMessage(String to) throws Exception;
}
