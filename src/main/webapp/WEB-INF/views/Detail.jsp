<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Gothic+A1:700&amp;subset=korean" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="/resources/css/Detail.css">

<title>Insert title here</title>
</head>
<body>
	<!-- 헤더 -->
   <header>
      <div id="title">
      <a href="/main"><h3>FUNP</h3></a>
      </div>
      
      <div id="loginList">
      <c:choose>
      	<c:when test="${member.c_num == null}">
      		<div>

         	<a href="/member/login">
            로그인
            </a>
            </div>
      	</c:when>
      	
         <c:otherwise>
         	<div>
         	<a href="/member/logout">
            로그아웃
            </a>
            </div>
         </c:otherwise>
      </c:choose>
        	
        	
      <c:choose>
      	<c:when test="${member.c_num == null}">
      		<div>
      		<a href="/member/join">
            회원가입
			</a>
         	</div>
      	</c:when>
      	
      	<c:otherwise>
      		<div>
      			<a href="/reMyPage">

    	 마이 페이지
    	 		</a>
      		</div>
      	</c:otherwise>
      </c:choose>
      </div>
   </header>
   
   
   <!-- 헤더 끝 -->
	
	
	<!-- 본문 시작 -->
	
	<div id = wrapper>
	
	<section id="first">
		<div id ="mainImage">
			<img src="/resources/receiveimg/${Contents.c_topimg }">
			<div id="mainText">
				<h1>${Contents.c_title}</h1>
				<p>${Contents.c_intro }</p>
			</div>
			<a href="Funding/FundingPage?c_num=${Contents.c_num}">
				<div id="fundingbutton">
					<h1>펀딩하기</h1>
				</div>
			</a>
		</div>
	</section>
	
	<section id="middle">
		<div id="text">
			<br>
			<br>
			<br>
			<br>
			<hr/>
			<h1>헤드문구</h1>
			<p>
				${Contents.c_text}
		
			</p>
		</div>
		<div id="rewordList">
		
		<%-- <c:forEach var="wow" items="${list}">
			<div class="reword">
				<h1>${wow.r_title}</h1>
				<hr/>
				<h4>
				${wow.r_price}</h4>
				<p>
				${wow.r_detail}
				</p>
				<hr/>
			</div>
		</c:forEach> --%>
		
		<c:forEach var="wow" items="${list2 }">
			<div class="reword">
				<h1>${wow.r_title}</h1>
				<hr/>
				<h4>
				${wow.r_price}</h4>
				<p>
				${wow.r_detail}
				</p>
				<hr/>
			</div>
		</c:forEach>
		
		</div>
		<div id="img">
			<img  src="/resources/receiveimg/${Contents.c_midimg }">
		</div>
	</section>
	
	</div>
	<!-- 본문 끝 -->
	
	<!-- 푸터시작 -->
	<footer>
	
		<div id="f_first">
		</div>
		<div id="f_second">
			FUNP (주) | 대표이사 배오유 | <br>
			사업자등록번호 220-88-37661 | <br>
			통신판매업신고 2013-경기성남-0428<br> 
			경기도 성남시 분당구 판교로 242 (삼평동)<br> 
			판교디지털센터 A동 4층 402호<br>
		</div>
		<div id="f_third">
		
		고객센터 1661-9056 | info@FUNP.kr<br> 

		제휴문의 070-5088-0219 | partner@FUNP.kr<br> 

		Yellow ID @FUNP<br> 

		이용약관 | 개인정보처리방침 | 수수료 항목<br> 
		</div>
	</footer>
	
	<!-- 푸터끝 -->
</body>
</html>