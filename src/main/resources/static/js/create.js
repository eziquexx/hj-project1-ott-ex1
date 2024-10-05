/**
 * 
 */

const createForm = document.getElementById("createForm");
createForm.addEventListener("submit", function(e) {
	e.preventDefault();
	
	const movieInfo = {
		name: document.getElementById("info_name").value,
		productionYear: parseInt(document.getElementById("info_year").value, 10),
		description: document.getElementById("info_des").value,
		genre: document.querySelector("input[type=radio][name=genre]:checked").value,
	}
	
	fetch("/", {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json',
		},
		body: JSON.stringify(movieInfo)
	})
	.then(response => {
		if (response.ok) {
			alert("영화 데이터 추가 성공");
			createForm.reset();
		} else {
			alert("실패");
		}
	})
	.catch(error => {
		console.error("Error: ", error);
		alert("오류 발생");
	})
});