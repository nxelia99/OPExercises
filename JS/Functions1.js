// functions: how to declare a function and how to use them

sayHi('Kai') //invokes the function and sets the parameter name as Kai
const nom = 'Joe'
sayHi(nom) // sets name as a variable named nom that stores the value Joe.
//this function takes one parameter: name
function sayHi(name) {
    console.log(`Hi ${name}`)
}

let name_2 = 'Belial'
sayGoodBye(name_2)  //can't be changed bc we already have a name declared in the function.

function sayGoodBye(name){
    name = 'Jesus' //this parameter is going to be the primary
    console.log(`Goodbye ${name}`)
}

let person = {name: 'Joe', surname: 'Hilton'} //creates an object
function greetPerson(object){
    console.log(`Hi ${object.name} ${object.surname}`) //takes the object's data
}

greetPerson(person)

//function that prints a list

function print(...parameters){
    console.log(parameters)
}
print(1,2,3, 'friends', {id: 203, name: 'Nnne'})

//function that adds the nums of a list
//return allows us to use the given value that is returned to the function caller.
//that's why we can use: const s = add(3,4,55,6)

function add(...nums){
    return nums.reduce((a,b) => a + b)
}
add(1,2,3,4)

const s = add(3,4,55,6)
console.log(s)

//function that multiplies given 2 numbers
function multiply(a = 0, b = 0){
    return a * b
}

console.log(multiply(5,6))