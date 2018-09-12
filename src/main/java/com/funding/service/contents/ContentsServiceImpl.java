package com.funding.service.contents;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.funding.domain.ContentsVO;
import com.funding.dto.ContentDTO;
import com.funding.persistence.contents.ContentsDAO;

@Service
public class ContentsServiceImpl implements ContentsService {
	@Inject
	private ContentsDAO dao;
	
	@Override
	public List<ContentsVO> AllListContents() {
		List<ContentsVO> list = new ArrayList<ContentsVO>();
	      list = dao.AllListContents();

	      for (int i = 0; i < list.size(); i++) {
	         Date date = new Date();
	         SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
	         	
	         String today = f.format(date);
	         String itemDate = list.get(i).getC_dead();

	         List<Integer> tlist = new ArrayList<Integer>();
	         List<Integer> ilist = new ArrayList<Integer>();
	         tlist.add(Integer.parseInt(today.substring(0, 4)));
	         tlist.add(Integer.parseInt(today.substring(5, 7)));
	         tlist.add(Integer.parseInt(today.substring(8, 10)));

	         ilist.add(Integer.parseInt(itemDate.substring(0, 4)));
	         ilist.add(Integer.parseInt(itemDate.substring(5, 7)));
	         ilist.add(Integer.parseInt(itemDate.substring(8, 10)));
	         String r1 = null;
	         String r2 = null;
	         
	         List<Integer> value = new ArrayList<Integer>();
	         
	         for (int j = 0; j < 3; j++) {
	            value.add(ilist.get(j)-tlist.get(j));
	         }
	         
	         int result = (value.get(0)*365)+(value.get(1)*30)+(value.get(2));
	         
	         
	         list.get(i).setC_remday(result);
	         System.out.println(result);
	      }
	      
	
	      
	      for(int i=0;i<list.size();i++){
	         dao.GoalPerContents(list.get(i));
	         System.out.println(list.get(i).getC_num());
	      }
	      return list;
	}

	@Override
	public ContentsVO DetailContents(int c_num) {
		return dao.DetailContents(c_num);
	}

	@Override
	public void InsertContents(ContentsVO contents) {
		dao.InsertContents(contents);
	}


	

	
	
	
}
