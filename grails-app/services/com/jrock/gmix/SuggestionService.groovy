package com.jrock.gmix

class SuggestionService {

    static transactional = false

    def suggest() {
		println "doing suggestion..."
		log.info "doing suggeston..."
		redirect(uri:'/index')
    }
}
