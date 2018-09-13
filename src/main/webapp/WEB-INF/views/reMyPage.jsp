<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<link rel="stylesheet" type="text/css" href="/resources/css/reMyPage.css">
<script src="/resources/js/jquery.js" type="text/javascript"></script>
<script src="/resources/jQuery/reMyPage.js" type="text/javascript"></script>

</head>
<body>
	<header>
	<div id="title">
		<a href="AllListContentsAction.do"><h3>프로젝트명</h3></a>
	</div>

	<div id="loginList">
		<c:choose>
			<c:when test="${member.c_num == null}">
				<div>
					<a href="/member/login"> 로그인 </a>
				</div>
			</c:when>

			<c:otherwise>
				<div>
					<a href="/member/logout"> 로그아웃 </a>
				</div>
			</c:otherwise>
		</c:choose>


		<c:choose>
			<c:when test="${member.c_num == null}">
				<div>회원가입</div>
			</c:when>

			<c:otherwise>
				<div>
					<a href="MovementMyInfoAction.do"> 마이 페이지 </a>
				</div>
			</c:otherwise>
		</c:choose>
		<div>
			<a href="/Contents/AddContents"> 컨텐츠 추가 </a>
		</div>
	</div>
	</header>


	<!-- 헤더 끝 -->
	
	<!-- 상단 개인정보 -->
	<section id = "myInfo">
		<div id = "myInfowrap">
			<h3> 님 환영합니다.</h3>
			<div> 더보기</div>
			
			<!-- 디테일 개인정보 -->
			<div id = "detailmyInfo">
				<p>전화번호 : </p>
				<p>주소 : </p>
				<p>계좌번호 : </p>
				
				<div>수정하기</div>
				<div>회원 탈퇴</div>
			</div>
			<!-- 디테일 개인정보  끝-->
			
		</div>
	</section>
	<!-- 상단 개인정보 끝 -->
	
	
	<!-- 메뉴 바 -->
	<section id = "menu">
		<div id = "menuwrap">
			<div id = "myresbtn">예약</div>
			<div id = "mypatbtn">결제</div>
			<div id = "myconbtn">컨텐츠</div>
		</div>
	</section>
	<!-- 메뉴 바 끝 -->
	
	
	<!-- 내 예약 리스트 -->
	
	<section id = "myresList">
		<div id = "myresListwrap">
			
			<div class = "myres">
				
				<div class = "myresTitle">
					<h4>컨텐츠 제목</h4>
					<p>컨텐츠 인트로</p>
				</div>
				
				<div class = "myresSetbtn">
					<div class = "myresModify">예약내역 수정</div>
					<div class = "myresCancle">예약 취소</div>
				</div>
				
				<hr/>
				
				<div class = "re_resDay">
					<p>예약일</p>
					<p>2014.05.25</p>
				</div>
				
				<div class = "re_payday">
					<p>결제 예정일</p>
					<p>2014.09.10</p>
				</div>
				
				<div class = "re_resPrice">
					<p>예약금액</p>
					<p>360000</p>
				</div>
				
			</div>
			
			
		</div>
	</section>
	
	
	<!-- 내 예약 리스트 끝 -->
	
	<!-- 내 결제 리스트 -->
	
	
	<section id = "myPayList">
		<div id = "myPayListWrap">
			
			<div class = "myPay">
				
				<div class = "myPayTitle">
					<h4>컨텐츠 제목</h4>
					<p>컨텐츠 인트로</p>
				</div>
				
				
				
				<hr/>
				
				<div class = "pa_resDay">
					<p>예약일</p>
					<p>2014.05.25</p>
				</div>
				
				<div class = "pa_payday">
					<p>결제 예정일</p>
					<p>2014.09.10</p>
				</div>
				
				<div class = "pa_resPrice">
					<p>예약금액</p>
					<p>360000</p>
				</div>
				
			</div>
			
			
		</div>
	</section>
	
	
	<!-- 내 결제 리스트 끝. -->
	
	
	
	<!-- 내 컨텐츠 -->
	
	<!-- 컨텐츠 있는지 없는지 조건식 넣기. -->
	<section id= "noContents">
		<div id = "noContentsWrapper">
			<h2>아직 컨텐츠가 없어여 이참에 맹글어보세여</h2>
			<a href= "/Contents/AddContents"><div id = "goAddcontents"></div></a>
		</div>
	</section>
	
	
	<section id = "myContents">
		<div id = "myContentsWrapper">
			<div id = "myContntetsTop">
				<!-- 컨텐츠 승인여부 조건식 넣기. -->
				
				
	<!-- 컨텐츠 승인여부 X일때  -->
				
				
				<!-- 컨텐츠 정보 -->
				<h3>승인대기 컨텐츠</h3>
				<div id = "watingContnents">
					<img src="">
					<div id = "watingContentsText">
						<div id = "ContentsTitle">
							<p>컨텐츠 제목</p>
							<p>컨텐츠 인트로</p>
						</div>
						
						<div id = "ContentsModify">
							수정하기
						</div>
						
						<div id = "var">
							<div id = "innervar"></div>
						</div>
						
						<div id = "ContentsNumbering">
							<h4>0%</h4>
							<p>금액</p>
							<p>0일 남음</p>
						</div>
						
					</div>
				</div>
				<!-- 컨텐츠 정보 끝 -->
				
				
				<!-- 리워드 수정 삭제 -->
				
				<div class = "waitingReward">
					
					
					<div class = "WRTop">
						
						<div class = "WRText">
							<h4>리워드 제목</h4>
							<hr/>
							<p>리워드 설명</p>
							<h4>리워드 가격</h4>
						</div>
						
						<div class = "WRRight">
							<div class= "WRModify">
								수정하기
							</div>
							
							<div class = "WRRemove">
								삭제하기
							</div>
						</div>
					</div>
					

					<!-- 리워드 수정 탭 -->
					<div class = "WRbottom">
						<hr/>
						
						<form action="" method="post">
							<h4>리워드 제목</h4>
							<input type="text" value="" name = "r_title">
							<h4>리워드 가격</h4>
							<input type = "text" value="" name = "r_price">
							<h4>리워드 내용</h4>
							<input type = "text" value="" name = "r_detail">
							
							<input type = "submit" value = "수정하기">
						</form>
					</div>
					<!-- 리워드 수정 탭 끝 -->
					
				</div>
				
	<!-- 컨텐츠 승인여부 O일때  -->			
				<!-- 컨텐츠 정보 -->
				<h3>진행중 컨텐츠</h3>
				<div id = "doingContnents">
					<img src="">
					<div id = "doingContentsText">
						<div id = "ContentsTitle">
							<p>컨텐츠 제목</p>
							<p>컨텐츠 인트로</p>
						</div>
					
						
						<div id = "var">
							<div id = "innervar"></div>
						</div>
						
						<div id = "ContentsNumbering">
							<h4>0%</h4>
							<p>금액</p>
							<p>0일 남음</p>
						</div>
						
					</div>
				</div>
				<!-- 컨텐츠 정보 끝 -->
				
				
				<!-- 리워드 정보 -->
				
				<div class = "waitingReward">
					
					<div class = "WRTop">
						
						<div class = "WRText">
							<h4>리워드 제목</h4>
							<hr/>
							<p>리워드 설명</p>
							<h4>리워드 가격</h4>
						</div>
						
					</div>
					
				</div>
				
			</div>
			
			<!-- 완료 컨텐츠  -->
			<hr/>
			
			<div id = "myContentsdwn">
				<h3>진행중 컨텐츠</h3>
				<div class = "completeContnents">
					<img src="">
					<div class = "completeContentsText">
						<div class = "ContentsTitle">
							<p>컨텐츠 제목</p>
							<p>컨텐츠 인트로</p>
						</div>
					
						
						<div class = "var">
							<div class = "innervar"></div>
						</div>
						
						<div class = "ContentsNumbering">
							<h4>0%</h4>
							<p>금액</p>
							<p>0일 남음</p>
						</div>
						
					</div>
				</div>
					
			</div>
			
			<!-- 완료컨텐츠 끝. -->
			
			
			
		</div>
	</section>
</body>
</html>