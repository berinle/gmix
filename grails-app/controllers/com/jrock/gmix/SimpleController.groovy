package com.jrock.gmix

class SimpleController {

    def index = { }
    
    def suggest = {
    	log.debug "doing suggeston..."
		redirect(uri:'/')
    }
}
