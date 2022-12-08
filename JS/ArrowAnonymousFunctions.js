// arrow and/or anonymous functions

const array = [1,2,3,5,8,9,78]

// .map() creates a new array from calling a function for every 
// array element. map() calls a function once for each element 
// in an array. map() 
const array2 = array.map((value) => { //arrow function (doesn't need keyword function)
    return value * 2
})

console.log(array2)

// arrow function that * 3 a value.
const tripleValue = value => {return value * 3} //declaration

console.log(tripleValue(2)) //execution (once given the value and the function is initialized)

const array3 = array.map(tripleValue) //apply an arrow function to an array
console.log(array3)

// arrow and/or anonymous functions

const array = [1,2,3,5,8,9,78]

// .map() creates a new array from calling a function for every 
// array element. map() calls a function once for each element 
// in an array. map() 
const array2 = array.map((value) => { //arrow function (doesn't need keyword function)
    return value * 2
})

console.log(array2)

// anonymous function

let showMessage = function() {
    console.log('This is an anonymous function');
};

showMessage()

// another anonymous function example
let person = {
    firstName: 'John',
    lastName: 'Doe'
};

(function () {
    console.log(person.firstName + ' ' + person.lastName);
})(person);
