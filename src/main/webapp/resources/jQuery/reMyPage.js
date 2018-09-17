$(function() {
	var on = 0;

	var on2 = 0;
	$("#moreInfo").click(
			function() {
				if (on == 0) {
					$("#detailmyInfo").css("display", "block").css("height", 0)
							.css("opacity", 0);
					$("#detailmyInfo").animate({
						opacity : 1,
						height : 180

					}, 50);

					on = 1;
				} else {

					$("#detailmyInfo").animate({
						height : 0,
						opacity : 0,
					}, 50);
					on = 0;
				}

			});

	$("#myresbtn").click(
			function() {
				$("#myresbtn").css("color", "#14a085").css("font-weight",
						"bold").css("font-size", "24px");
				$("#mypatbtn").css("color", "black").css("font-size", "20px")
						.css("font-weight", "normal");
				$("#myconbtn").css("color", "black").css("font-size", "20px")
						.css("font-weight", "normal");

				$("#myresList").css("opacity", 0).css("display", "block");
				$("#myPayList").css("display", "none");
				$("#myContents").css("display", "none");
				$("#basicInfo").css("display", "none");

				$("#myresList").animate({
					opacity : 1
				}, 200);
			});

	$("#mypatbtn").click(
			function() {
				$("#myresbtn").css("color", "black").css("font-size", "20px")
						.css("font-weight", "normal");
				$("#mypatbtn").css("color", "#14a085").css("font-weight",
						"bold").css("font-size", "24px");
				$("#myconbtn").css("color", "black").css("font-size", "20px")
						.css("font-weight", "normal");

				$("#myresList").css("display", "none");
				$("#myPayList").css("opacity", 0).css("display", "block");
				$("#myContents").css("display", "none");
				$("#basicInfo").css("display", "none");

				$("#myPayList").animate({
					opacity : 1
				}, 200);

			});

	$("#myconbtn").click(
			function() {
				$("#myresbtn").css("color", "black").css("font-size", "20px")
						.css("font-weight", "normal");
				$("#mypatbtn").css("color", "black").css("font-size", "20px")
						.css("font-weight", "normal");
				$("#myconbtn").css("color", "#14a085").css("font-weight",
						"bold").css("font-size", "24px");

				$("#myresList").css("display", "none");
				$("#myPayList").css("display", "none");
				$("#myContents").css("opacity", 0).css("display", "block");
				$("#basicInfo").css("display", "none");
				$("#myContents").animate({
					opacity : 1
				}, 200);

			});

	$(".WRModify").click(function() {
		if (on2 == 0) {
			$(".WRbottom").css("display", "block").css("opacity", "0");

			$(".WRbottom").animate({
				opacity : 1
			}, 200);
			on2 = 1;
		} else {

			$(".WRbottom").animate({
				opacity : 0,
			}, 200);
			
			$(".WRbottom").css("display", "none");
			on2 = 0;

		}

	});
	
	
	
	$("#ContentsModify").click(function(){
		alert("aa");
		$("#basicInfo").css("opacity", "0").css("display", "block");
		
	/*	$("#myresList").css("display", "none");
		$("#myPayList").css("display", "none");*/
		$("#myContents").css("display", "none");

		$("#basicInfo").animate({
			opacity : 1
		}, 200);

	});
	
	
	$('.basicInfoWrap form').submit(function(){
		alert("프로젝트 정보가 저장되었습니다.");
		
		
});

});