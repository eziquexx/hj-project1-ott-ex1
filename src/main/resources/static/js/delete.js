/**
 * 
 */


function deleteItem(id) {
	if (confirm('정말 삭제하시겠습니까?')) {
	           // 삭제 요청을 보낼 URL
	           const url = `/delete/${id}`;
	           const form = document.createElement('form');
	           form.method = 'post';
	           form.action = url;

	           document.body.appendChild(form);
	           form.submit(); // 폼 제출
	       }
};