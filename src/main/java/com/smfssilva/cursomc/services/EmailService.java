package com.smfssilva.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.smfssilva.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
