package com.smfssilva.cursomc.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import com.smfssilva.cursomc.domain.Pedido;

public abstract class AbstractEmailService implements EmailService {
	
	@Value("${default.sender}")
	private String sende;
	
	@Override
	public void sendOrderConfirmationEmail(Pedido obj) {
		
		SimpleMailMessage sm = prepareSimpleMailMessageFromPedido(obj);
		sendEmail(sm);
		
	}

	protected SimpleMailMessage prepareSimpleMailMessageFromPedido(Pedido obj) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(obj.getCliente().getEmail());
		sm.setFrom(sende);
		sm.setSubject("Pedido confirmado! Código: " + obj.getId());
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText(obj.toString());
		return sm;
	}

}
