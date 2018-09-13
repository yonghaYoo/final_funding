package com.funding.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.funding.domain.ContentsVO;
import com.funding.dto.ContentDTO;
import com.funding.service.contents.ContentsService;

@Controller
@RequestMapping("/Contents")
public class ContentsController {
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@Inject
	private ContentsService service;
	
	@RequestMapping(value="/AddContents", method=RequestMethod.GET)
	public String AddContents(HttpServletRequest request){
		System.out.println(uploadPath);
		HttpSession session = request.getSession();
		
		if(session.getAttribute("member")!=null){
			
			
			
			
			return "/Contents/AddContents";
		}else{
			
			return "member/login";
		}
		
		
	}
	
	
	@RequestMapping(value="/AddContents", method=RequestMethod.POST)
	public void AddContents(ContentDTO dto) throws IOException, Exception{
		MultipartFile midimg = dto.getC_midimg();
		String midimgName = uploadFile(midimg.getOriginalFilename(), midimg.getBytes());
		
		MultipartFile topimg = dto.getC_topimg();
		String topimgName = uploadFile(topimg.getOriginalFilename(), topimg.getBytes());
		
		MultipartFile thimg = dto.getC_thimg();
		String thimgName = uploadFile(thimg.getOriginalFilename(),thimg.getBytes());
		
		
		ContentsVO contents = new ContentsVO();
		contents.setC_num(dto.getC_num());
		contents.setC_title(dto.getC_title());
		contents.setC_intro(dto.getC_intro());
		contents.setC_cate(dto.getC_cate());
		contents.setC_thimg(thimgName);
		contents.setC_text(dto.getC_text());
		contents.setC_midimg(midimgName);
		contents.setC_topimg(topimgName);
		contents.setC_dead(dto.getC_dead());
		contents.setC_goal(dto.getC_goal());
		
		service.InsertContents(contents);
		
	}
	
	
	private String uploadFile(String originalName,byte[] fileData) throws Exception{
		UUID uid = UUID.randomUUID();
		
		String savedName = uid.toString() + "_" + originalName;
		
		File target = new File(uploadPath,savedName);
		
		FileCopyUtils.copy(fileData, target);
		
		return savedName;
	}
}
