/**
 * 
 */
/*
 * AJAX - Asynchronous JavaScript and XML
 * JSON - data format of our choice (both human and machine readable)
 * JavaScript Object Notation
 * 
 * Asynchronous - the browser does not need to reload the entire
 * page when only a small bit of data on the page has changed.
 * We do not have to wait for the server to respond to a previous
 * request to send a new one.
 * 
 * AJAX - is not a programming language.
 * AJAX is a technique for accessing web servers from a web page
 * asynchronously. 
 * 
 * AJAX is a combination of:
 * - browser built-in XMLHttpRequest object (requests data from a 
 * web server)
 * - JavaScript
 * - HTML DOM (to display or use the data)
 * 
 * How does AJAX work?
 * 1) An event occurs in a web page (button is clicked, page is loaded...)
 * 2) An XMLHttpRequest object is created by JavaScript
 * 3) The XMLHttpRequest object sends a request to a web server
 * 4) The server processes the request
 * 5) The server sends a response back to the web page
 * 6) The response is read by JavaScript
 * 7) A proper action (like page update) is performed by JavaScript
 * 
 */

window.onload = function(){
	document.getElementById("pokemonSubmit")
	.addEventListener('click', getPokemon);
}

function getPokemon(){
	
	//getting the id/field value
	let pokemonId = document.getElementById('pokemonId').value;
	// create an XMLHttpRequest object to allow us to make requests
	// and get data back
	let xhttp = new XMLHttpRequest();
	
	xhttp.onreadystatechange = function(){
		
		/*
		 * The readystate property holds the status of the 
		 * XMLHttpRequest
		 * 0 - request not initialized
		 * 1 - server connection established
		 * 2 - request received
		 * 3 - processing request
		 * 4 - request is finished and response is ready
		 */
		
		if( xhttp.readyState == 4 && xhttp.status == 200){
			
			let pokemon = JSON.parse(xhttp.responseText);
			setValues(pokemon);
		}
		
	}
	// create a connection (method, url, boolean asynch or not)
	xhttp.open("GET", 'https://pokeapi.co/api/v2/pokemon/' + pokemonId, true);
	xhttp.send();
	
}

function setValues(pokemon){
	document.getElementById("pokemonName").innerHTML = pokemon.name;
	
	let pokemonImgElement = document.getElementById("pokemonImg");
	pokemonImgElement.setAttribute("src", pokemon.sprites.front_default);
	pokemonImgElement.setAttribute("alt", pokemon.name);
}

