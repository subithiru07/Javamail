package mail.api.entity;

import java.beans.JavaBean;

@JavaBean
public class EmailDetails {

	private String recipient;
	public String getRecipient() {
		return recipient;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public String getSubject() {
		return subject;
	}
	public String getAttachment() {
		return attachment;
	}
	private String msgBody;
	private String subject;
	private String attachment;
}
