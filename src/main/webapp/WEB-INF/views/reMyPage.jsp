<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Noto+Serif+KR" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:900" rel="stylesheet">
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
					<a href="/reMyPage"> 마이 페이지 </a>
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
			<h2><b>${member.m_name }</b> 님 환영합니다.</h2>
			<div id = "moreInfo"> 
			<div></div>
			● ● ●</div>
			
			<!-- 디테일 개인정보 -->	
			<div id = "detailmyInfo">
				<p><b>전화번호</b> : ${member.m_pno }</p>
				<p><b>주소</b> : ${member.m_add }</p>
				<p><b>계좌번호</b> : ${member.m_acc }</p>
				
				<div id = "myInfoMod">수정하기</div>
				<div id = "myInfoRemove">회원 탈퇴</div>
			</div>
			<!-- 디테일 개인정보  끝-->
			
		</div>
	</section>
	<!-- 상단 개인정보 끝 -->
	
	
	<!-- 메뉴 바 -->
	<section id = "menu2">
		<div id = "menuwrap">
			<div id = "myresbtn"><div></div>예약</div>
			<div id = "mypatbtn"><div></div>결제</div>
			<div id = "myconbtn"><div></div>컨텐츠</div>
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
					<p>결제일</p>
					<p>2014.09.10</p>
				</div>
				
				<div class = "pa_resPrice">
					<p>결제금액</p>
					<p>360000</p>
				</div>
				
			</div>
			
			
			
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
					<p>결제일</p>
					<p>2014.09.10</p>
				</div>
				
				<div class = "pa_resPrice">
					<p>결제금액</p>
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
			<a href= "/Contents/AddContents"><div id = "goAddcontents"><div></div>컨텐츠 생성</div></a>
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
					<img src="../resources/img/tumb01.jpg">
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
							<input type = "text" value="" name = "r_detail" id="modRewardText">
							
							<input type = "submit" value = "수정하기">
						</form>
					</div>
					<!-- 리워드 수정 탭 끝 -->
					
				</div>
				
	<!-- 컨텐츠 승인여부 O일때  -->			
				<!-- 컨텐츠 정보 -->
				<h3>진행중 컨텐츠</h3>
				<div id = "doingContnents">
					<img src="../resources/img/tumb01.jpg">
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
				<h3>완료 컨텐츠</h3>
				<div class = "completeContnents">
					<img src="../resources/img/tumb01.jpg">
					<div class = "completeContentsText">
						<div class = "ContentsTitle">
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
					
			</div>
	
			</div>
		
	</section>
	<!-- 완료컨텐츠 끝. -->
	
	<!-- 컨텐츠 수정  -->
			<div id = "basicInfo">
			<div id = "basicInfoWrap">
				<form action="/Contents/ModifyContents" method="post" enctype="multipart/form-data">
				<div class="info">
					<h2>프로젝트 제목</h2>
					<div>프로젝트를 잘 나타내거나 흥미를 갖게 할 수 있는 멋진 제목을 입력해보세요. <br>
							  프로젝트 페이지와 메인페이지에 사용됩니다.
					</div>
					<input type="text" id="title" name="c_title">
				</div>
				
				<div class="info">
					<h2>프로젝트 요약</h2>
					<div>프로젝트에 대해 간략한 소개를 해주세요.<br>
							  메인페이지의 프로젝트 카드이미지에 사용됩니다.
					</div>
					<input type="text" id="intro" name="c_intro">
				</div>
				
				<div class="info">
					<h2>카테고리</h2>
					<div>프로젝트의 카테고리를 지정해주세요!<br> 
							  이용자분들이 나의 프로젝트를 좀더 쉽게 찾아볼수있게 도와줍니다.
					</div>
					<select name ="c_cate">
						<option value="A">패션/뷰티</option>
						<option value="B">식음료</option>
						<option value="C">가전기기</option>
						<option value="D">소품</option>
					</select>
				</div>
				
				<div class="info">
					<h2>썸네일 이미지</h2>
					<div>썸네일이미지는 프로젝트가 소개되는 모든화면에 노출되는 사진입니다.<br>
							  가로 304px 세로 225px에 맞추어  3MB 이하의 JPG,PNG 파일로 업로드 해주세요
					</div>
					
					<input type = "file"  id="thumbImg" name="c_thimg">
				</div>
								
				<div class="info">
					<h2>본문 내용</h2>
					<div>프로젝트의 자세한 설명을 적어주세요! <br> 
							  상세페이지 상단에 들어갈 글이니 이용자들의 눈길을 끌만한 글을 작성해보세요!
					</div>
					<textarea rows="6" cols="100" name="c_text" ></textarea>
				</div>
				
				<div class="info">
					<h2>본문 이미지</h2>
					<div>프로젝트의 자세한 설명을 도와주는 이미지를 넣어주세요! 본문 내용 아래에 삽입될 이미지입니다. <br>
							  가로 868px 세로 1464px에 맞추어  3MB 이하의 JPG,PNG 파일로 업로드 해주세요
					</div>
					<input type = "file"  id="midImg" name="c_midimg">
				</div>
				
			
				<div class="info">
					<h2>메인 이미지</h2>
					<div>메인이미지는 프로젝트를 클릭했을시 제일 먼저 보이는 이미지입니다. 첫인상을 판가름하지요.<br>
							  가로 1522px 세로 720px에 맞추어  3MB 이하의 JPG,PNG 파일로 업로드 해주세요
					</div>
					
					<input type = "file"  id="dmainImg" name="c_topimg">
				</div>
				
				<div class="info">
					<h2>마감날짜</h2>
					<div>해당 프로젝트의 마감날짜를 설정해주세요.
					</div>
					<input type = "date"  id="deadDate" name="c_dead">
				</div>
				
				<div class="info">
					<h2>목표금액</h2>
					<div>프로젝트를 진행하기 위한 최소한의 목표금액을 입력해주세요.
					</div>
					<input type="number" id="goalMoney" name="c_goal">
				</div>
				
				<div id="submit">
				 <input type="hidden" value=${member.c_num } name="c_num">
					<input type="submit" id ="save" value="저장">
				</div>
				</form>
			</div>
			</div>
			
			<!-- 컨텐츠 수정 끝 -->
</body>
</html>