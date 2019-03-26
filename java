package com.br.resource;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetHost extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException { 

	   
	    response.setContentType("text/html");

	    String hostname = request.getRemoteHost(); // hostname
	    System.out.println("hostname"+hostname);

	    String computerName = null;
	    String remoteAddress = request.getRemoteAddr();
	    System.out.println("remoteAddress: " + remoteAddress);
	    try {
	        InetAddress inetAddress = InetAddress.getByName(remoteAddress);
	        System.out.println("inetAddress: " + inetAddress);
	        computerName = inetAddress.getHostName();

	        System.out.println("computerName: " + computerName);

	        PrintWriter print=response.getWriter();
	        print.print("Host:"+hostname);
	        print.print("remoteAddress:"+remoteAddress);
	        print.print("remoteAddress:"+remoteAddress);
	        print.print("ComputerName:"+computerName);

	        if (computerName.equalsIgnoreCase("localhost")) {
	            computerName = java.net.InetAddress.getLocalHost().getCanonicalHostName();
	        } 
	    } catch (UnknownHostException e) {

	        }

	    System.out.println("computerName: " + computerName);
    }

}
