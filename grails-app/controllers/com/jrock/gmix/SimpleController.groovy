package com.jrock.gmix

import groovyx.net.ws.WSClient

class SimpleController {

    def index = { }
    
    def suggest = {
    	log.debug "doing suggeston..."
    	
    	def proxy = new WSClient("http://localhost:8090/redlight/services/home?wsdl", this.class.classLoader)
    	proxy.initialize()
    	proxy.soapCall()
    	
		redirect(uri:'/')
		//redirect(url:'http://www.cnn.com')
    }
}
