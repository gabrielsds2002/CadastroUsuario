package com.brq.cadastroCliente.exceptions;

import lombok.Getter;

@Getter
public class UserException extends RuntimeException{

    private String uuid;
    public UserException(String msg, String uuid){
        super(msg);
        this.setUuid(uuid);
    }
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
