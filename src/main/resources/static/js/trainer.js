$(document).ready(function() {
	setTimeout(function() {
		getTrainers();
   }, 1000);
})

function getTrainers() {
	$.ajax({
		type : "GET",
		url : "http://localhost:8081/trainerapp/trainer",
		success : function(data) {
			var list = $('<ul class="list-group"></ul>');
			$('p').append(list);
			$.each(data, function(index, trainer) {
				list.append('<li class="list-group-item">' + trainer.firstName
						+ " " + trainer.surname + '</li>')
			});
		}
	});
}

function addTrainer() {
	var firstName = document.getElementById('firstname').value;
	var surname = document.getElementById('surname').value;
	var trainer = new Object();
	trainer.firstName = firstName;
	trainer.surname = surname;
	var trainerJSON = JSON.stringify(trainer);
	$.ajax({
		type : "POST",
		url : "http://localhost:8081/trainerapp/trainer",
		contentType : "application/json",
		data : trainerJSON,
		success : function(data) {
			console.log(data);
		},
		error : function(data) {
			console.log(data);
		},
		dataType : 'json'
	});
}
