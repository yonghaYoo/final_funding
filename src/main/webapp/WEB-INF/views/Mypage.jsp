<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/Detail.css">
<title>Insert title here</title>
</head>
<body>
	<!-- 헤더 -->
   <header>
      <div id="title">
      <a href="AllListContentsAction.do"><h3>프로젝트명</h3></a>
      </div>
      
      <div id="loginList">
      <c:choose>
      	<c:when test="${member.c_num == null}">
      		<div>
         	<a href="MovementLoginAction.do">
            로그인
            </a>
            </div>
      	</c:when>
      	
         <c:otherwise>
         	<div>
         	<a href="LogoutAction.do">
            로그아웃
            </a>
            </div>
         </c:otherwise>
      </c:choose>
        	
        	
      <c:choose>
      	<c:when test="${member.c_num == null}">
      		<div>
            회원가입

         	</div>
      	</c:when>
      	
      	<c:otherwise>
      		<div>
      			<a href="/Mypage">
    	 마이 페이지
    	 		</a>
      		</div>
      	</c:otherwise>
      </c:choose>
         <div>
         	<a href="MovementAddContentsAction.do">
            컨텐츠 추가
            </a>
         </div>
      </div>
   </header>
   
   
   <!-- 헤더 끝 -->

	<!--  본문 시작 -->
	<div id = "title"></div>

	<div id="Mypage">

		<h3>마이페이지</h3>
	</div>
	<div id = "pageturn"></div>
	<div >
		<ul id ="MyList"> 
			<li id = "myInfo">내정보 보기</li>
			<li>예약 내역</li>
			<li>내가 만든 컨텐츠</li>
		</ul>
	</div>
	<br><br>
	
		<div id="Information">
			<div id="PersonalInformation">
			<br><br>
			
				<div class="name">이름[${m_info.m_name}]</div><br>
						
				<div class="Id">id[${m_info.m_id}]</div><br>
				
				<div class = "Email">이메일[${m_info.m_email}]</div><br>
			
				<div class = "Acc">계좌번호[${m_info.m_acc}]</div><br>
		
			
		
	</div>
</div>
	<!-- 본문 끝 -->
	
	<!-- 결제내역 시작 -->
<%-- 	
	<c:forEach var="wow" items="${reList }">
		<!-- 나중에 foreach 로 변경 해야 해요... -->
		<div id = lalala></div>
		<div id = FundinfList>
			<div>컨텐츠 제목
			[${wow.c_title}]</div><br>
			
			<div>간단한 소개
			[${wow.c_intro}]
			</div><br>
			
			<div>예약 날짜
			[${wow.f_resday}]
			</div><br>
			
			<div>예약 금액
			[${wow.f_price}]
			</div><br>
			
			<div>예약 일시
			[${wow.f_resday}]
			</div><br>
		</div>
	</c:forEach>
	<div id = "ShareFunding">
		<div>공유하기</div><br>
		<div>자세히 보기</div><br>
	</div>	
	
		
	<div></div>
	
	<div id ="MyCotentsListUp">
		<br>
		<div>컨텐츠</div>
	</div>
	<div id="ContentsDisplay">
		<div id="img">
			<img  src="img/tumb01.jpg">
			<!-- 링크 걸기 -->
			<a href=""><div id="LinkFunding">집사를 위한 츄르 100개</div></a><!-- detail로 넘어가요 -->
	</div>
	
	
	
	
	</div>
	
	
	 <table border="1">
	<tr>
	<td  colspan="3">결제 내역<td>
	</tr>
	
	<tr border="1">
	<th>이름</th>
	<th>내용</th>
	<th>공유하기</th>
	
	<tr border="1"></tr>
	<td>집사를 위한 주인님 간식</td>
	<td>츄르 100개</td>
	<td></td>
	

	</table> 
	
	 --%>
	

	<!-- 푸터시작 -->
	<footer>

	<div id="f_first"></div>
	<div id="f_second">
		와디즈 (주) | 대표이사 신혜성 | <br> 사업자등록번호 220-88-37661 | <br>
		통신판매업신고 2013-경기성남-0428<br> 경기도 성남시 분당구 판교로 242 (삼평동)<br>
		판교디지털센터 A동 4층 402호<br>
	</div>
	<div id="f_third">

		고객센터 1661-9056 | info@wadiz.kr<br> 제휴문의 070-5088-0219 |
		partner@wadiz.kr<br> Yellow ID @와디즈<br> 이용약관 | 개인정보처리방침 |
		수수료 항목<br>
	</div>
	</footer>

	<!-- 푸터끝 -->
</body>
</html>