/**
 * 
 */
// JavaScript
/*
 * is cross-platform, object-oriented scripting language used to make
 * webpages interactive and/or functional. 
 *  - dynamic language 
 *  - loosely typed
 *  
 *  There are many more advanced server side versions of JS such as
 *  Node.JS which allows you to add more functionality to a website
 *  
 *  DATA TYPES: bunsofans
 *  STRING
 *  NUMBER
 *  BOOLEAN
 *  NULL
 *  UNDEFINED
 *  OBJECT
 *  FUNCTION
 *  ARRAY
 *  SYMBOL - ECMAScript 6, ES6, is a unique and immutable primitive value,
 *  it may used as the key for an Object
 */

//console.log("Hey, guyz");

var x; // declared a variable
let y = 5; // number type
const z = "hello";

//SCOPES
//global - outside of any declarations
//local - functions/objects
//block - within conditionals

// var, let, const allow us to declare data types
// var - global or local, escapes out of block scope
// let - all scopes
// const - cannot be changed
// let and const with ECMAscript 6 or ES6

// stay away from global variables if you can
// because you don't want them changing value or type

let name = 'Andrew';
let numberOne = 1;
let isApproved = false;
let whyVariable = undefined;
let emptyVariable = null;
//console.log(name);

let numOne; // undefined variable
// those that are not initialized nor given a type nor value but are declared
// if you try to reference an undefined variable?
// JS will return "undefined"

//numTwo; // undeclared variable
// those that do not exist in the program and are not declared
// if you try to reference an undeclared variable?
// runtime error

let numFive = 5;
// == -> checks only for value
// === -> checks for both value AND type (strictly equals)

let exObj = {}; //object

let superHero = {
		name : 'TadRotFace',
		ability: 'ACID spit and regrowing his face',
		'Andrew' : "wait, is Andrew a thing?"
}
//console.log(superHero.name);
//console.log(superHero.Andrew);

superHero.secretIdentity = "Martin the Bartender";
//console.log(superHero.secretIdentity);

delete superHero.Andrew;
//console.log(superHero);

// JavaScript is a dynamic language because you can add/delete new
// fields into your object at runtime
// JavaScript is loosely typed because you can switch data types at runtime
// interpretive language - code is not precompiled, it takes it line by line

// hoisting - move all declarations to the top of their scope

let num1 = 10;
let num2 = num1;
num1 = 25;
//console.log(num1);
//console.log(num2);
// our variables are passed by value
// so num1 is 25 and num2 is 10

let obj1 = {
		value : 10
};
let num3 = obj1.value;
obj1.value = 50;
//console.log(obj1);
//console.log(num3);
// objects are still passed by value

let arrayOfMemes=[
	['Pepe The Frog', 3], 
	['Nyon Cat', 'Planking']
	];
//console.log(arrayOfMemes[2]);
//arrayOfMemes[10] = 'Crying Jordan';
//console.log(arrayOfMemes[1][1]);

// ES6 is backticks, also known as template literals `` 
let tempNum = 15;
//let longString = 'Print longString' + tempNum + ' and now we have more stuff';

let longString = `Print longString: ${printStuff}

and now that we have that, there is more


and more


and many many more words
and a random Andrew

and Abdou

and 

Braden XD and Richie 0_0`;

//printStuff();

function printStuff(){
	console.log("stuff");
}

//Falsy Values
/*
 * number are all inherently true, 0 is false
 * strings are all inherently true, empty string is false
 * false is false, true is true
 * null is false
 * undefined is false
 * NaN is false
 * 
 * you can use any value in a boolean context and it will be assigned
 * a truthy or falsy value
 */

function checkTruthy(input) {
	console.log(`input = ${input}, and is typeof: ${typeof(input)} and 
	input is ${!!input}`)
}

//checkTruthy(-1);
//checkTruthy(0);
//checkTruthy('');
//checkTruthy([]);
//checkTruthy('false');
//checkTruthy(NaN);
//checkTruthy(null);
//checkTruthy('not true');
//checkTruthy(checkTruthy);

// NaN is not a keyword nor is it a data type
// is a property of the global object
// isNaN - function returns true if variable is not a type of number

/*
 * 1) Division of zero by zero
 * 2) Division of infinity by infinity
 * 3) Multiplication of infinity by zero
 * 4) Converting a non-numeric string or undefined into a number
 */


//loops
//course=['exam1', 'exam2', 'exam3'];
//for(let exam in course){
//	console.log(exam, course[exam]);
//}

//ES6 - arrow notation

//ES5
//var x = function(x,y){
//	return x*y;
//}
//ES6
//let x = (x,y) => x*y;


// Anonymous functions
// - is a function without a name

let myFunc = function(){
	console.log("in myFunc")
}
myFunc();

// Self Invoking functions
// invoked immediately without being called
// IIFE - Immediately Invokable Function Expression
// this will execute automatically if the expression is follow by ()

let funcTwo = function() {
	let someVariable = "inside self invoking function";
	console.log(someVariable);
}();

//Callback functions
//Simply put: function that is to be executed after another
//function has finished executing

// any function that is passed as an argument into
// another function

//function doHomework(subject, callback){
//	alert(`Starting my ${subject} homework.`);
//	callback();
//}
//function alertFinished(){
//	alert('Finished my homework');
//}
//doHomework('math', alertFinished);

//closure
// a closure is an inner function that has access to the
// outer function's variables
// The closure has 3 scope chains:
// 1)it has access to its own scope
// 2) it has access to the outer function's variables
// 3) it has access to global variables

let foo = (function() {
	let bar = 0;
	return function() {
		return bar += 1
	};
})();

//console.log(bar);
// bar is not global, cannot directly call it
//console.log(foo());

//Inheritance
//Prototypical inheritance

/*
 * In JavaScript, when it comes to inheritance,
 * it only has one construct: objects.
 * Each object has a private property which holds
 * a link to another object called its prototype.
 * The prototype has a prototype of its own, and so on
 * until an object is reached with null as its prototype.
 * 
 * Let us create an object "o" from function "f" with its
 * own properties
 */

/* o.[[Prototype]]; properties b and c
 * o.[[Prototype]].[[Prototype]] - Object.prototype
 * o.[[Prototype]].[[Prototype]].[[Prototype]] - null
 * this would be the end of the prototype chain
 * as null, by definition, has no [[Prototype]]
 */
let f = function(){
	this.a = 1;
	this.b = 2;
}
let o = new f();
// add properties
f.prototype.b = 3;
f.prototype.c = 4;
let p = f.prototype;
console.log(p.b); //3

console.log(o.a);
console.log(o.b);


