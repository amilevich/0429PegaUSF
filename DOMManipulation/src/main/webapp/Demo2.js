/**
 * 
 */
/*
 * DOM - Document Object Model
 * it defines the logical structure of documents and the way
 * a document is accessed and manipulated
 * HTML file - a series of elements, all of which can be manipulated
 */

/////GET ELEMENT BY ID
let paraTwo = document.getElementById('para2');
paraTwo.innerText = 'Oyindamola has two legs';

let paraThree = document.getElementById('para3');
paraThree.innerHTML = '<i> Well, today was not as bad as I thought. </i>';

////GET ELEMENT BY CLASS NAME
let hders = document.getElementsByClassName('headers');
hders[1].textContent = "THE THIRTEENTH DAY.... SURVIVALS: 17";

///GET ELEMENTS BY TAGNAME
// getElementsByTagName('');

// Events - any action that an end user performs
/*
 * click
 * mouseup
 * mousedown
 * altkey
 * mouseleave
 * mouseenter
 */

let buttonOne = document.getElementById('button');
buttonOne.addEventListener('click', myFuncOne);

function myFuncOne(eve){
	console.log(eve.altKey);
}

buttonOne.addEventListener('mouseenter', myFuncTwo);

function myFuncTwo(eveTwo){
	console.log(eveTwo.type);
}


