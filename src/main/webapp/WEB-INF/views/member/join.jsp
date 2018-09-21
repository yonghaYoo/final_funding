<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/resources/js/jquery.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
   
   <!-- 본문 시작 -->
   		<form action="/member/join" method="post">
			아이디 : <input type="text" name="m_id" id="m_id"> 
				   <input type="button" id="idck" value="중복확인"><br>
				   
				   
				   
			<script type="text/javascript">
			
			$(function() {
				var idck = 0;
				
			    $("#idck").click(function() {
			    	event.preventDefault();
			    	
			        var m_id = $("#m_id").val(); 
			        $.ajax({
			        	url:"/idcheck/" + m_id,
			        	type:'GET',
			        	datatype:'text',
			        	success:function(data){
			        		if(data==0){
			        			alert("사용가능합니다");
			        		}else{
			        			alert("이미사용중입니다");
			        		}
			        	}
			        });
			    });
			});
			</script>

			비밀번호 : <input type="password" name="m_pw"><br>
			이름 : <input type="text" name="m_name"> <br>
			핸드폰 번호 : <input type="text" name="m_pno"> <br>
			e-mail : <input type="text" name="m_email" placeholder="aa@example.com"> <br>
			계좌번호 : <input type="text" name="m_acc"> <br>
			주소 : <input type="text" id="sample4_postcode" placeholder="우편번호">
			<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
			<input type="text" id="sample4_roadAddress" name = "m_add"placeholder="도로명주소"> <!-- sample4_roadAddress -->
			<input type="text" id="sample4_jibunAddress" placeholder="지번주소">
			<span id="guide" style="color:#999"></span>
			
			<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
			<script>
			    function sample4_execDaumPostcode() {
			        new daum.Postcode({
			            oncomplete: function(data) {
			                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
			                var extraRoadAddr = ''; // 도로명 조합형 주소 변수
			
			                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
			                    extraRoadAddr += data.bname;
			                }
			                if(data.buildingName !== '' && data.apartment === 'Y'){
			                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
			                }
			                if(extraRoadAddr !== ''){
			                    extraRoadAddr = ' (' + extraRoadAddr + ')';
			                }
			                if(fullRoadAddr !== ''){
			                    fullRoadAddr += extraRoadAddr;
			                }
			
			                document.getElementById('sample4_postcode').value = data.zonecode; //5자리 새우편번호 사용
			                document.getElementById('sample4_roadAddress').value = fullRoadAddr;
			                document.getElementById('sample4_jibunAddress').value = data.jibunAddress;
			
			                if(data.autoRoadAddress) {
			                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
			                    document.getElementById('guide').innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
			
			                } else if(data.autoJibunAddress) {
			                    var expJibunAddr = data.autoJibunAddress;
			                    document.getElementById('guide').innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
			
			                } else {
			                    document.getElementById('guide').innerHTML = '';
			                }
			            }
			        }).open();
			    }
			</script>
			
		<input type="submit" value="회원가입">
	</form>
	
</body>
</html>