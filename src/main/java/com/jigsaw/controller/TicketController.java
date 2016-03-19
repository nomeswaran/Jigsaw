package com.jigsaw.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jigsaw.component.SendMailTLS;
import com.jigsaw.model.Ticket;
import com.jigsaw.model.User;

@Controller
@Scope("session")
public class TicketController {
	
	   @Autowired
	   private User user;
	   
	Map<String,List<Ticket>> tickets = new HashMap<>();
	
	@RequestMapping(value = "createTicket", method = RequestMethod.GET)
	public String welcome() {

		return "createTicket";

	}
	
	
	@RequestMapping(value = "/createTicket_process", method = RequestMethod.POST)
	public String ticketCreateProcess(HttpServletRequest req,@RequestParam(value="sub", required=false) String sub, 
	        @RequestParam(value="detail", required=false) String detail, ModelMap model){

		System.out.println("User name = "+user.getUserName());

		
		Ticket ticket = new Ticket(sub,detail);
		System.out.println("Ticket Details = "+ticket.toString());
		List<Ticket> list = tickets.get(user.getUserName());
		if(list != null){
			 list.add(ticket);
		}else{
			list = new ArrayList<>();
			 list.add(ticket);
		}
		
		 tickets.put(user.getUserName(), list);
		try{
		SendMailTLS.sendMail(ticket.getTicketId(), ticket.getTicketDesc(), ticket.getTicketDetail(), ticket.getTicketStatus().toString(), user.getUserName());
		}catch(Exception e){e.printStackTrace();}
		
		return "userHome";

	}
	
	@ResponseBody
	@RequestMapping(value = "/tickets", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE},headers="Accept=application/json")
	public List<Ticket> listTickets() {

		return tickets.get(user.getUserName()) != null?tickets.get(user.getUserName()) : new ArrayList<Ticket>();

	}
	
}
