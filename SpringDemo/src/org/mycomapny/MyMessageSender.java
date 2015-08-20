package org.mycomapny;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.mycomapny.EmailService;
import org.mycomapny.TwitterService;
import org.mycomapny.WhatsAppService;

public class MyMessageSender {
	
	public static void main(String args[])
	{
		ApplicationContext bean =new ClassPathXmlApplicationContext("newbean.xml"); 
		WhatsAppService wp;
		TwitterService tw;
		EmailService es;
		int ch;
		Scanner in=new Scanner(System.in);
		do
		{
			System.out.println("1.Email Service");
			System.out.println("2.WhatsApp Service");
			System.out.println("3.Twitter Service");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				es=(EmailService)bean.getBean("EmailService");
				es.sendMessage(es.getReciverName(),es.getMsg());
				break;
			case 2:
				wp=(WhatsAppService)bean.getBean("WhatsAppService");
				wp.sendMessage(wp.getReciverName(),wp.getMsg());
				break;
			case 3:
				tw=(TwitterService)bean.getBean("TwitterService");
				tw.sendMessage(tw.getReciverName(),tw.getMsg());
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid");
			}
			
		}while(ch!=4);
	}

}