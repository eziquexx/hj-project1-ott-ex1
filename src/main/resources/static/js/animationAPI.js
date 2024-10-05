/**
 * 
 */

function animationAPI() {
	const loading = document.getElementById("loading_id");
	const error = document.getElementById("error_id");
	const animationList = document.getElementById("animationList_id");
	
	loading.style.display = "block";
	error.style.display ="none";
	animationList.innerHTML = "";
	
	//fetch
	fetch("/animation/api")
	.then(response => {
		if(!response.ok) {
			throw new Error("응답 오류");
		}
		return response.json();
	})
	.then(lists => {
		const thead = document.createElement("thead");
		const tbody = document.createElement("tbody");

		animationList.appendChild(thead);
		animationList.appendChild(tbody);
		thead.innerHTML = `<tr><th>목록</th></tr>`;
		
		loading.style.display = "none";
		lists.forEach(item => {
			const tbodytr = document.createElement("tr");
			const td = document.createElement("td");
			//const itemYear = item.productionYear;
			//const year = itemYear.slice(0, 4);
			td.innerHTML = `<a href="/animation/${item.id}">${item.name}(${item.productionYear})</a>`;
			tbody.appendChild(tbodytr);
			tbodytr.appendChild(td);
		});
	})
	.catch(error => {
		console.error('Fetch error: ', error);
		loading.style.display = "none";
		error.style.display = "block";
	})
}

document.addEventListener("DOMContentLoaded", animationAPI);