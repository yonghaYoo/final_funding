package com.funding.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.funding.service.member.MemberService;
@RestController
public class IdcheckController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping("/idcheck/{m_id}")
    public int idcheck(@PathVariable("m_id") String m_id) throws Exception {
        
        int count = 0;
        System.out.println(m_id);
        count = service.idcheck(m_id);
        
        return count;
    }
	
}
