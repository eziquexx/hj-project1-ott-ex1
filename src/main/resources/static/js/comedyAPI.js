/**
 * 
 */

function comedyAPI() {
	const loading = document.getElementById("loading_id");
	const error = document.getElementById("error_id");
	const comedyList_id = document.getElementById("comedyList_id");
	
	loading.style.display = "block";
	error.style.display ="none";
	comedyList_id.innerHTML = "";
	
	//fetch
		fetch("/comedy/api")
		.then(response => {
			if(!response.ok) {
				throw new Error("응답 오류");
			}
			return response.json();
		})
		.then(lists => {
			const thead = document.createElement("thead");
			const tbody = document.createElement("tbody");

			comedyList_id.appendChild(thead);
			comedyList_id.appendChild(tbody);
			thead.innerHTML = `<tr><th>목록</th></tr>`;
			
			loading.style.display = "none";
			lists.forEach(item => {
				const tbodytr = document.createElement("tr");
				const td = document.createElement("td");
				//const itemYear = item.productionYear;
				//const year = itemYear.slice(0, 4);
				td.innerHTML = `<a href="/comedy/${item.id}">${item.name}(${item.productionYear})</a>`;
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

	document.addEventListener("DOMContentLoaded", comedyAPI);