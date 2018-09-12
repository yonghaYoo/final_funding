<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
      			<a href="MovementMyInfoAction.do">
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
   
   <!-- 본문 시작 -->
   		<form action="/member/join" method="get">
			아이디 : <input type="text" name="m_id"> <br>
			비밀번호 : <input type="password" name="m_pw"><br>
			이름 : <input type="text" name="m_name"> <br>
			핸드폰 번호 : <input type="text" name="m_pno"> <br>
			e-mail : <input type="text" name="m_email"> <br>
			계좌번호 : <input type="text" name="m_acc"> <br>
			주소 : <input type="text" name="m_add"> <br>
		<input type="submit" value="회원가입">
	</form>
	
</body>
</html>