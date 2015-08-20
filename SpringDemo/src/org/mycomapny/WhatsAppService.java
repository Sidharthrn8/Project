package org.mycomapny;
public class WhatsAppService implements MessageService{
	String msg;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getReciverName() {
		return reciverName;
	}

	public void setReciverName(String reciverName) {
		this.reciverName = reciverName;
	}

	String reciverName;

	@Override
	public void sendMessage(String receiverName, String msg) {
				// TODO Auto-generated method stub
		
		receiverName=this.reciverName;
		msg=this.msg;
		System.out.println("Reciver name:"+receiverName);
		System.out.println("Message"+msg);
	}

}
